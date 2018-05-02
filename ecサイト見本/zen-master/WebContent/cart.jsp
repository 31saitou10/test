<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />

<link rel="stylesheet" type="text/css" href="./css/cart.css">

<script type="text/javascript">
	//チェックリストにチェックを入れてなかったときに警告をだす
	var chooseList = document.getElementsByName('chooseList');
	function checkBox() {
		for (var i = 0; i < chooseList.length; i++) {
			if (chooseList[i].checked)
				return true;
		}
		alert('商品を選択してください');
		return false;
	}
</script>

<title>カート画面</title>

</head>

<body>
	<jsp:include page="include_header.jsp" flush="true" />
	<div id="haikei">

		<div class="basket">
			<h2>カート情報一覧</h2>
			<br> <br> <span style="color: #ff0000; font-weight: bold;"><small><s:property value="message" /></small></span> <span style="color: #ff0000; font-weight: bold;"><small><s:property value="errorCartList" /></small></span>
			<div class="basket-labels">
				<ul>
					<li class="item item-heading">商品</li>
					<li class="price">価格</li>
					<li class="quantity">個数</li>
					<li class="subtotal">金額</li>
				</ul>
			</div>
			<s:form action="CartDeleteAction" name="form" onsubmit="return checkBox();">
				<s:iterator value="cartList">
					<div class="basket-product">
						<div class="item">
							<div class="product-image">
								<img src="<s:property value='image_file_path' />" alt="Placholder Image 2" class="product-frame">
							</div>
							<div class="product-details">

								<strong><span class="item-quantity"></span> <s:property value="product_name" /></strong>
								<p><s:property value="product_description" /></p>
								<p>発売会社名：<s:property value="release_company" /></p>
								<p>発売年月日：<s:property value="release_date" /></p>
							</div>
						</div>

						<div class="price">
							<s:property value="price" />
						</div>

						<div class="quantity">
							<s:property value="product_count" />
						</div>

						<div class="subtotal">
							<s:property value="product_total_price" />
						</div>

						<span class="remove">削除 <input type="checkbox" class="check_delete" name="chooseList" value='<s:property value="product_id"/>'></span>
					</div>
				</s:iterator>
				<s:submit class="button_select" value="選択削除" />
			</s:form>

			<div class="all_delete_button">
				<s:form action="AllCartDeleteAction">
					<s:submit class="button_delete" value="全削除" />
				</s:form>
			</div>
		</div>

		<!-- サイドバー -->
		<aside>
			<div class="summary">
				<div class="summary-total-items">
					<span class="total-items"></span> 合計金額
				</div>

				<s:iterator value="cartList">
					<div class="summary-subtotal">
						<div class="subtotal-title">
							<strong><s:property value="product_name" /></strong>
						</div>

						<s:property value="user_id" />

						<div class="subtotal-value final-value" id="basket-subtotal">
							<s:property value="product_total_price" />
						</div>

						<div class="summary-promo hide">
							<div class="promo-title">Promotion</div>
							<div class="promo-value final-value" id="basket-promo"></div>
						</div>
					</div>
				</s:iterator>

				<div class="summary-total">
					<div class="total-title">合計金額</div>
					<div class="total-value final-value" id="basket-total">
						<s:property value="session.total_price" />
					</div>
				</div>

				<div class="summary-checkout">
					<div class="center">
						<s:form class="checkout-cta" action="PaymentAction">
							<s:submit class="button" value="決済画面へ" />
						</s:form>
					</div>
				</div>
			</div>
		</aside>

		<div class="push"></div>
	</div>

	<jsp:include page="include_footer.jsp" flush="true" />
</body>
</html>