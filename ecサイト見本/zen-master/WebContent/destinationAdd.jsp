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

<link rel="stylesheet" type="text/css" href="./css/destinationAdd.css">

<title>宛先情報登録画面</title>
</head>

<body>
	<!-- ヘッダーの読み込み -->
	<jsp:include page="include_header.jsp" />

	<div class="main">
		<div class="white">

			<div id="top">
				<h2>宛先情報登録</h2>
			</div>
			<h4><span style="color: red"><s:property value="ERROR_MESSAGE" /></span></h4>

			<!-- 宛先情報の入力項目 -->
			<div class="destination_form">
				<s:form action="DestinationAddConfirmAction">
					<table>
						<tr>
							<th>姓</th>
							<td>
								<s:textfield name="family_name" placeholder="（例） 禅" size="40" value='%{session.family_name}' /><br>
								<span style="color: #ff0000; font-weight: bold;"><small><s:property value="errorFamilyName" /></small></span>
							</td>
						</tr>

						<tr>
							<th>名</th>
							<td>
								<s:textfield name="first_name" placeholder="（例）太郎" size="40" value='%{session.first_name}' /><br>
								<span style="color: #ff0000; font-weight: bold;"><small><s:property value="errorFirstName" /></small></span>
							</td>
						</tr>
						<tr>
							<th>姓（かな）</th>
							<td>
								<s:textfield name="family_name_kana" placeholder="（例）ぜん" size="40" value='%{session.family_name_kana}' /><br>
								<span style="color: #ff0000; font-weight: bold;"><small><s:property value="errorFamilyNameKana" /></small></span>
							</td>
						</tr>

						<tr>
							<th>名（かな）</th>
							<td>
								<s:textfield name="first_name_kana" placeholder="（例）たろう" size="40" value='%{session.first_name_kana}' /><br>
								<span style="color: #ff0000; font-weight: bold;"><small><s:property value="errorFirstNameKana" /></small></span>
							</td>
						</tr>

						<tr>
							<th>住所</th>
							<td>
								<s:textfield name="user_address" placeholder="（例）東京都千代田区三番町◯-◯" size="40" value='%{session.user_address}' /><br>
								<span style="color: #ff0000; font-weight: bold;"><small> <s:property value="errorAddress" /></small></span>
							</td>
						</tr>

						<tr>
							<th>電話番号</th>
							<td>
								<s:textfield name="tel_number" placeholder="ハイフン（-）なしで入力してください" size="40" value='%{session.tel_number}' /><br>
								<span style="color: #ff0000; font-weight: bold;"><small><s:property value="errorTel" /></small></span>
							</td>
						</tr>

						<tr>
							<th>E-mail</th>
							<td>
								<s:textfield name="email" placeholder="（例）email@gmail.com" size="40" value='%{session.email}' /><br>
								<span style="color: #ff0000; font-weight: bold;"><small><s:property value="errorEmail" /></small></span>
							</td>
						</tr>
					</table>

						<div class="center">
							<s:submit class="button" value="登録" />
						</div>
				</s:form>
			</div>
		</div>
	</div>

	<!-- フッターの読み込み -->
	<jsp:include page="include_footer.jsp" />

</body>
</html>