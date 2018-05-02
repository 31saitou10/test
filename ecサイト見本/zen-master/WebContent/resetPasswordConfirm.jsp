<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<link href="https://fonts.googleapis.com/css?family=Noto+Serif" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="./css/resetPasswordConfirm.css">
<style>
@import url('https://fonts.googleapis.com/css?family=Noto+Serif');
</style>
<title>利用者情報登録確認</title>



<script>
function goResetPasswordCompleteAction(){
	document.getElementById("form").action = "ResetPasswordCompleteAction";
}
function goResetPasswordAction(){
	document.getElementById("form").action = "ResetPasswordAction";
}
</script>
</head>
<body>
<jsp:include page="include_header.jsp" flush="true" />
<div id="haikei">
<!-- パスワード再設定画面はここから -->
<h2 class="heading">利用者情報変更確認</h2>
<p>変更内容の確認をしてください。誤りがなければ【この内容で登録する】
ボタンを押してください。修正を行う場合、【修正する】ボタンを押してください。</p>
<s:form action="ResetPasswordCompleteAction" id="form">
<div class="text-center">
<div>
<s:property value="loginUserId"/>
<s:hidden name="loginUserId" value="%{loginUserId}"/>
</div>
<div>
<s:property value="loginPassword"/>
<s:hidden name="loginPassword" value="%{loginPassword}"/>
</div>
<s:submit class="button" value="この内容で登録する" onclick="goResetPasswordCompleteAction();"/>
<s:submit class="button" value="修正する" onclick="goResetPasswordAction();"/>
</div>
</s:form>
</div>
<jsp:include page="include_footer.jsp" flush="true" />
</body>
</html>