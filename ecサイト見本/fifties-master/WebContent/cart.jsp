<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>
	<link rel="stylesheet" href="./css/fifties.css">
	<link rel="stylesheet" href="./css/cart.css">
	<title>カート画面</title>
</head>
<body>
	<jsp:include page="includeHeader.jsp"/>

	<div id="main">

		<div id="top">
			<div id="title">
				<h1>CART</h1>
				<p>カート</p>
			</div>
		</div>

		<div id="left">
			<s:if test="errorMessage != null">
				<p class="error"><s:property value="errorMessage"/></p>
			</s:if>

			<s:if test="cartList.isEmpty()">
				<p>カートの中は空です</p>
			</s:if>
			<s:else>
				<p class="message"><s:property value="cartList.size()"/>件の商品があります</p>
			</s:else>

			<s:form action="CartAction" id="delete-form">
				<s:hidden name="deleteFlg" value="true"/>
					<s:iterator value="cartList" status="st">
						<div class="box">
							<a href="<s:url action="ProductDetailsAction">
								<s:param name="product_id" value="%{productId}"/></s:url>">
								<img src='<s:property value="imageFilePath"/>' width="200"height="170" alt="Photo" />
							</a>

							<div class="product-text">
								<div class="product-name">
									<h2>商品名:<span class="blank"><s:property value="productName"/></span></h2>
								</div>
								<div class="kana">
									<p>ふりがな:<span><s:property value="productNameKana"/></span></p>
								</div>
								<div class="release-company">
									<p>販売会社名:<span class="blank"><s:property value="releaseCompany"/></span></p>
								</div>
								<div class="release-date">
									<p>発売年月:<span class="blank"><s:property value="releaseDate"/></span></p>
								</div>
								<div class="price">
									<p>値段:<span class="blank"><s:property value="price"/>円</span></p>
								</div>
								<div class="count">
									<p>個数:<span class="blank"><s:property value="productCount"/>個</span></p>
								</div>
								<div class="total-price">
									<span>小計:<span class="blank"><s:property value="totalPrice"/>円</span></span>
									<span class="checkbox">
<%-- 										<span class="checkbox-parts"></span> --%>
										<label><span class="checkbox-label">削除</span><s:checkbox class="checkbox-input" name="deleteList" value= "0" fieldValue="%{productId}"/></label>

									</span>
								</div>


							</div>
						</div>
					</s:iterator>
			</s:form>
		</div>

		<div id="right">

			<div class="btn">
				<p>カート内の合計金額<br>:<s:property value="cartTotalPrice"/>円</p>
				<s:form action="BuyItemConfirmAction">
					<s:submit class="settlement-btn" value="決済"/>
				</s:form>
				<div class="delete">
					<p>チェックした商品を</p>
					<s:submit class="delete-btn" value="削除" form="delete-form"/>
				</div>
			</div>

		</div>

	</div>

	<jsp:include page="includeFooter.jsp"/>

	<script>
		var height = $("#left").height();
		$("#right").height(height);
	</script>

</body>
</html>
