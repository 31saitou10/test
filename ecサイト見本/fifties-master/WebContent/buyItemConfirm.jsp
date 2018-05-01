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
	<link rel="stylesheet" href="./css/settlement.css">
	<title>決済確認</title>
</head>
<body>
	<jsp:include page="includeHeader.jsp"/>

<div id="main">

		<div id="top">
			<div id="title">
				<h1>SETTLEMENT</h1>
				<p id="title">決済</p>
			</div>
		</div>

		<div class="indexbox">
			<h2>注文内容は以下になります　　　</h2>
		</div>

		<div class="twocolunm">
			<div class="box">
				<div class="left">

					<s:form action="BuyItemCompleteAction" id="settlement-form">
					<s:iterator value="cartList">
						<table class="cart">
							<tr>
							<th>商品名</th>
							<td><s:property value="productName"/><td>
							</tr>

							<tr>
							<th>金額</th>
							<td><s:property value="price"/>円</td>
							</tr>

							<tr>
							<th>購入個数</th>
							<td><s:property value="productCount"/>個</td>
							</tr>

							<tr>
							<th>小計</th>
							<td><s:property value="totalPrice"/>円</td>
							</tr>
						</table>

					</s:iterator>

					<br>
					<div id="paymentPrice">
					合計金額
					<s:property value="finallyTotalPrice"/>円
					</div>

					<!-- トークン -->
					<s:token />

					</s:form>
				</div>





				<!-- 宛先情報 -->

				<div class="address">
					<h3>お届け先を選択してください</h3>
					<s:form action="AddressDeleteAction" >
					<br>
					<s:iterator value="addressDTOList" status="st">

						<div class="selectAddress">
							<label>
								<s:if test="#st.index == 0">
								<input type="radio" name="id" checked="checked" value="<s:property value='id'/>"/>
								</s:if><s:else>
								<input type="radio" name="id" value="<s:property value='id'/>"/>
								</s:else>
								お届け先住所
							</label>
						</div>
						<table class="selectAddress">
							<tr>
							<th>名前</th>
							<td><s:property value="familyName"/>　
							<s:property value="firstName"/></td>
							</tr>

							<tr>
							<th>ふりがな</th>
							<td><s:property value="familyNameKana" /><span>　</span>
							<s:property value="firstNameKana" /></td>
							</tr>

							<tr>
							<th>郵便番号</th>
							<td><s:property value="zip11"/></td>
							</tr>

							<tr>
							<th>住所</th>
							<td><s:property value="addr11" /></td>
							</tr>

							<tr>
							<th>電話番号</th>
							<td><s:property value="telNumber"/></td>
							</tr>

							<tr>
							<th>メールアドレス</th>
							<td><s:property value="email"/></td>
							</tr>
						</table>
					</s:iterator>

						<!-- 宛先選択削除 -->
						<div id="form-user-button">
						<s:submit value="宛先選択削除" class="button-layout"/>
						<input type="hidden" name="deleteFlg" value="2" />
						</div>

						</s:form>


						<!-- 宛先全削除 -->
						<div id="form-user-button">
						<s:form action="AddressDeleteAction">
						<input type="hidden" name="deleteFlg" value="1">
						<s:submit value="宛先全削除" class="button-layout" />
						</s:form>
						</div>

						<!-- 宛先の新規登録 -->
					<div id="form-user-button">
						<s:form action="AddressRegisterAction">
						<s:submit value="宛先登録" class="button-layout" />
						</s:form>
					</div>



			</div>
			</div>
			<div id="button">
				  <ul>
				    <li><s:submit form="settlement-form" value="決済" class="button-layout"/></li>
				    <li><s:form action="CartAction"><s:submit value="戻る" class="button-layout"/></s:form></li>
				  </ul>
			</div>
		</div>



	</div>



 <jsp:include page="includeFooter.jsp"/>

 <script>
 $(function(){
			    if($('.left').height()>$('.address').height()){
			    	var height = $(".left").height();
			    	$(".box").height(height);
					$(".address").height(height);
			    } else {
			    	var height = $(".address").height();
			    	$(".box").height(height);
					$(".left").height(height);
			    }
 			});
</script>



</body>
</html>