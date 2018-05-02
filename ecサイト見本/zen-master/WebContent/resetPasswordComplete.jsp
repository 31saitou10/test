<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
     <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<link rel="stylesheet" type="text/css" href="./css/resetPasswordComplete.css">
<meta charset="UTF-8">
<meta http-equiv="refresh" content="3;URL='./GoHomeAction'" />
<title>パスワード変更完了</title>
<style type="text/css">
</style>
</head>
<body>
<jsp:include page="include_header.jsp" flush="true" />
<div id="top">
<div class="resetpasswordconfirm">

<div class="home">
<h1>パスワードの再設定が完了しました。</h1>
<p>
パスワードの再設定が完了しました。
３秒後にホーム画面に切り替わります。
</p>
</div>
</div>
</div>

<footer class="footer-menu">
   <div class="border2"></div>
   <div class="inquiry"><a href='<s:url action="InquiryAction"/>'>お問い合わせ</a></div>
   <div class="company">&copy;ZEN</div>
  </footer>

</body>
</html>