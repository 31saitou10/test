<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>登録完了画面</title>
<link rel="stylesheet" type="text/css" href="miamiburger.css">
<link rel="stylesheet" type="text/css" href="userCreateComplete.html">

<style type="text/css">

/*================LAYOUT==============*/
.UCComplete{
	border: 3px solid blue;
}
.UCComplete-text{
	padding-top: 15%;
	padding-left: 30%;
}
.UCComplete-gohome{
	padding-top: 10%;
	padding-left: 40%;
}

</style>
</head>
<body>

<div><jsp:include page="header.jsp"/></div>

<div class="main">
<div class="inner">
<div class="UCComplete">

       <div class="UCComplete-text">
          <h3>ユーザーの登録が完了しました。</h3></div>



<div class="UCComplete-gohome"><a href=<s:url action="HomeAction"/>>ホームへ戻る</a></div>

</div>
</div>
</div>

</body>
</html>