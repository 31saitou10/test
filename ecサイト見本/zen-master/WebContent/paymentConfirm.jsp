<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
      <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
      <meta http-equiv="Content-Style-Type" content="text/css" />
      <meta http-equiv="Content-Script-Type" content="text/javascript" />
      <meta http-equiv="imagetoolbar" content="no" />
      <meta name="description" content="" />
      <meta name="keywords" content="" />
	  <link rel="stylesheet" type="text/css" href="./css/paymentConfirm.css">
      <title>決済確認</title>

</head>
<body>
		<jsp:include page="include_header.jsp" flush="true" />

		<div id="main">
		<div id="haikei">

				<div id="top">
						<p>ご購入商品一覧</p>
				</div>
				<div id="caution">
				まだご購入は完了していません。</div>

			<s:form action="PaymentCompleteAction">
				<s:hidden name="userId" value="%{user_id}"/>
				<s:iterator value="cartList">
						<table style="table-layout:fixed;">
								<tr>
										<td style="width:200px;" rowspan="6">
												<img src="<s:property value='image_file_path'/>" width="200" height="150"><s:hidden name="image_file_path" value="%{image_file_path}"/><br>
										</td>
										<td style="width:95px;">
												<span>商品名</span>
										</td>
										<td style="width:100px;">
												<s:property value="product_name"/><s:hidden name="productName" value="%{product_name}"/><br>
										</td>
								</tr>

								<tr>
										<td>
												<span>ふりがな</span>
										</td>
										<td>
												<s:property value="product_name_kana"/><s:hidden name="product_name_kana" value="%{product_name_kana}"/><br>
										</td>
								</tr>

								<tr>
										<td>
												<span>販売会社</span>
										</td>
										<td>
												<s:property value="release_company"/><s:hidden name="release_company" value="%{release_company}"/><br>
										</td>
								</tr>

								<tr>
										<td>
												<span>値段</span>
										</td>
										<td>
												<s:property value="price"/><s:hidden name="price" value="%{price}"/><span>円</span>
										</td>
								</tr>

								<tr>
										<td>
												<span>購入個数</span>
										</td>
										<td>
												<s:property value="product_count"/><s:hidden name="productCount" value="%{product_count}"/><span>個</span>
										</td>
								</tr>

								<tr>
										<td>
												<span>商品ごとの合計金額</span>
										</td>
										<td><s:property value="product_total_price" />円</td>
								</tr>

								</table>
								</s:iterator>
								<br>
								<div id ="totalprice">
												<span>お客様の合計金額</span>
											<s:property value="#session.total_price" />円
								</div>
								<br>
								<br>

													<!-- 選択した宛先 -->

									<div id="top">
										お届け先ご住所
									</div>

								<s:iterator value="#session.selectAddList">
								<table style="table-layout:fixed;">
								<tr>
								<td style="width:120px;">
										<span>お名前</span>
								</td>
								<td>
								<s:property value="family_name"/><s:property value="first_name"/>
								</td>
								</tr>

								<tr>
								<td>
										<span>ふりがな</span>
								</td>
								<td>
								<s:property value="family_name_kana"/><s:property value="first_name_kana"/>
								</td>
								</tr>

								<tr>
								<td>
										<span>メールアドレス</span>
								</td>
								<td>
								<s:property value="email"/>
								</td>
								</tr>

								<tr>
								<td>
										<span>電話番号</span>
								</td>
								<td>
								<s:property value="tel_number"/>
								</td>
								</tr>

								<tr>
								<td>
										<span>住所</span>
								</td>
								<td>
								<s:property value="user_address"/>
								</td>
								</tr>
								</table>
								</s:iterator>
								<div id="button">
								<s:submit class="button" value="決  定"/>
								</div>
						</s:form>

								<div id="link">
									<p>	決済確認画面に戻る場合は<a href='<s:url action="PaymentAction"/>'>こちら</a></p>
								</div>
				</div>
				<div class="push"></div>
		</div>

	<jsp:include page="include_footer.jsp" flush="true" />

</body>
</html>