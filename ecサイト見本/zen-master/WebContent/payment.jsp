<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" type="text/css" href="./css/payment.css">
<title>購入確認</title>

</head>
<body>

	<jsp:include page="include_header.jsp" flush="true" />
	<div id="main">

		<div id="haikei">

			<div id="top">
				<p>購入予定商品と宛先情報選択</p>
			</div>

			<s:form action="PaymentConfirmAction" onsubmit="return radioCheck()">
				<div id="caution">
					<s:property value="errorCartList" />
				</div>
				<s:iterator value="cartList">
					<table style="table-layout: fixed;">
						<tr>
							<td style="width: 200px;" rowspan="6"><img
								src="<s:property value='image_file_path'/>" width="200"
								height="150"></td>
							<td style="width: 95px;"><span>商品名</span></td>
							<td style="width: 100px;"><s:property value="product_name" /><br>
							</td>
						</tr>
						<tr>
							<td><span>ふりがな</span></td>
							<td><s:property value="product_name_kana" /><br></td>
						</tr>

						<tr>
							<td><span>値段</span></td>
							<td><s:property value="price" /><span>円</span></td>
						</tr>

						<tr>
							<td><span>販売会社</span></td>
							<td><s:property value="release_company" /></td>
						</tr>

						<tr>
							<td><span>購入個数</span></td>
							<td><s:property value="product_count" /><span>個</span></td>
						</tr>

						<tr>
							<td><span>商品ごとの合計金額</span></td>
							<td><s:property value="product_total_price" />円</td>
						</tr>

					</table>
				</s:iterator>
				<br>
				<div id="totalprice">
					<span>お客様の合計金額</span>
					<s:property value="session.total_price" />
					円
				</div>

				<br>
				<br>

				<!-------- 宛先情報選択 -------->

				<div id="top">お届け先選択</div>

				<div id="address">
					<div id="caution">
					<s:property value="errorIdList" />
				</div>
				</div>

				<table style="table-layout: fixed;">
					<s:iterator value="#session.addressList">

						<tr>
							<td style="width: 50px;" rowspan="5"><input type="radio"
								name="id" checked="checked" value="${id}"></td>
							<td><span>お名前</span></td>
							<td><s:property value="family_name" />
								<s:property value="first_name" /></td>
						</tr>

						<tr>
							<td><span>ふりがな</span></td>
							<td><s:property value="family_name_kana" />
								<s:property value="first_name_kana" /></td>
						</tr>

						<tr>
							<td><span>メールアドレス</span></td>
							<td><s:property value="email" /></td>
						</tr>

						<tr>
							<td><span>電話番号</span></td>
							<td><s:property value="tel_number" /></td>
						</tr>

						<tr>
							<td><span>住所</span></td>
							<td><s:property value="user_address" /></td>
						</tr>

					</s:iterator>
				</table>
				<div id="button">
					<s:submit class="button" value="購  入" />
				</div>


			</s:form>

			<div class="button_wrapper">
				<s:form action="DestinationAddAction">
					<s:submit class="button" value="新規宛先登録" />
				</s:form>
			</div>

			<div id="link">
				<p>
					カートに戻る場合は<a href='<s:url action="CartAction"/>'>こちら</a>
				</p>
			</div>
		</div>
		<div class="push"></div>
	</div>
	<jsp:include page="include_footer.jsp" flush="true" />

</body>
</html>