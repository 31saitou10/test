<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />

<link rel="stylesheet" type="text/css" href="./css/destinationAddComfirm.css">

<title>宛先情報確認画面</title>
</head>

<body>
	<!-- ヘッダーの読み込み -->
	<jsp:include page="include_header.jsp" />

	<div class="main">
		<div class="white">
			<h2>登録する宛先情報は以下でよろしいですか？</h2>
			<br>

			<!-- 入力された宛先情報を表示する -->
			<div class="destination_form">
				<s:form action="DestinationAddCompleteAction">
					<table>
						<tr>
							<th>姓</th>
							<td><s:property value="family_name" escape="false" /></td>
						</tr>

						<tr>
							<th>名</th>
							<td><s:property value="first_name" escape="false" /></td>
						</tr>

						<tr>
							<th>姓（かな）</th>
							<td><s:property value="family_name_kana" escape="false" /></td>
						</tr>

						<tr>
							<th>名（かな）</th>
							<td><s:property value="first_name_kana" escape="false" /></td>
						</tr>

						<tr>
							<th>住所</th>
							<td><s:property value="user_address" escape="true" /></td>
						</tr>

						<tr>
							<th>電話番号</th>
							<td><s:property value="tel_number" escape="false" /></td>
						</tr>

						<tr>
							<th>Email</th>
							<td><s:property value="email" escape="false" /></td>
						</tr>

					</table>
					<br>
					<div class="center">
						<s:submit class="button" value="完了" />
					</div>
				</s:form>

				<!-- hiddenで入力値を一緒に送る -->
				<div class="center">
					<s:form action="DestinationAddFixAction" id="form" name="form">
						<s:submit class="fix" value="修正する"
							onclick="DestinationAddFixAction();">
							<s:hidden name="family_name" value="%{session.family_name}" />
							<s:hidden name="first_name" value="%{session.first_name}" />
							<s:hidden name="family_name_kana" value="%{session.family_name_kana}" />
							<s:hidden name="first_name_kana" value="%{session.first_name_kana}" />
							<s:hidden name="user_address" value="%{session.user_address}" />
							<s:hidden name="tel_number" value="%{session.tel_number}" />
							<s:hidden name="email" value="%{session.email}" />
						</s:submit>
					</s:form>
				</div>
			</div>
		</div>
	</div>

	<!-- フッターの読み込み -->
	<jsp:include page="include_footer.jsp" />
</body>
</html>