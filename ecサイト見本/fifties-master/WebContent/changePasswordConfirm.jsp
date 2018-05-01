<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/form.css">
<link rel="stylesheet" href="./css/fifties.css">
<link rel="stylesheet" href="./css/userAdd.css">
<title>パスワード変更確認画面</title>
<style type="text/css">
body {
	height: auto;
}

.main {
	height: auto;
}

#form{
margin-bottom: 500px;
}
</style>
</head>

<body>
	<jsp:include page="includeHeader.jsp" />
	<div id="main">
		<div id="form">

			<div class="title passchange">
				<div class="titlefont">
					<h1>CHANGE PASSWORD</h1>
					<p class="titlefont">パスワード再設定確認</p>
				</div>
			</div>

			<div class="contents">

				<s:form action="ChangePasswordCompleteAction" id="form-action">
					<div class="form-text">変更後のパスワード</div>
					<s:property value="%{hideNewPassword}" />
					<s:hidden name="newpass" value="%{newpass}" />
					<s:hidden name="userid" value="%{userid}" />
					<s:hidden name="question" value="%{question}" />
					<s:hidden name="hideNewPassword" value="%{hideNewPassword}" />
				</s:form>

				<div id="button">
					<ul>
						<li><s:form action="ChangePasswordAction">
								<s:submit class="button-layout" value="戻る" />
							</s:form></li>
						<li><s:submit class="button-layout" form="form-action"
								value="次へ" /></li>
					</ul>
				</div>

			</div>
		</div>
	</div>
	<jsp:include page="includeFooter.jsp" />
</body>
</html>