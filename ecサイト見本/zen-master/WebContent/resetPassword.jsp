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
<link rel="stylesheet" type="text/css" href="./css/resetPassword.css">
<style>
@import url('https://fonts.googleapis.com/css?family=Noto+Serif');
</style>
<title>ログイン再設定画面</title>
</head>
<body>
<!-- ヘッダー -->
<jsp:include page="include_header.jsp" flush="true" />
<div id="haikei">
<!-- パスワード再設定画面はここから -->

<h2 class="heading">お客様情報入力画面</h2>
<p>お客様の情報を入力してください</p>
<s:form action="ResetPasswordConfirmAction">

<table class="table">
<tbody>
<tr>
<th>ログインID</th>
<td>
<s:textfield name="loginUserId" placeholder="1～8文字以内半角英数字"/>
<s:if test="loginUserIdList.size > 0">
	<s:iterator value="loginUserIdList">
		<span><s:property /></span>
	</s:iterator>
</s:if>



</td>
</tr>




<tr>
<th>新しいログインパスワード</th>
<td>
<s:password name="loginPassword" placeholder="1～16文字以内半角英数字"/>
<s:if test="loginPasswordList.size > 0">
	<s:iterator value="loginPasswordList">
		<span><s:property /></span>
	</s:iterator>
</s:if>


<tr>
<th>新しいログインパスワード（確認用）</th>
<td>
<s:password name="loginPasswordConfirm" placeholder="1～16文字以内半角英数字"/>
<s:if test="loginPasswordConfirmList.size > 0">
	<s:iterator value="loginPasswordConfirmList">
		<span><s:property /></span>
	</s:iterator>
</s:if>
</td>
</tr>




</tbody>
</table>
<div class="text-center">
<s:submit class="button" value="送信"/>
</div>
</s:form>
</div>
 <footer class="footer-menu">
   <div class="border2"></div>
   <div class="inquiry"><a href='<s:url action="InquiryAction"/>'>お問い合わせ</a></div>
   <div class="company">&copy;ZEN</div>
  </footer>



    </body>
    </html>
