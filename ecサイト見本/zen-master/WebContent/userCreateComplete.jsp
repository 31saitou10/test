<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<link rel="stylesheet" type="text/css"
	href="./css/userCreateComplete.css">
<title>UserCreateComplete画面</title>





</head>
<body>
	<!-- ヘッダー -->
	<jsp:include page="include_header.jsp" />


	<div class="home">

		<h1>登録が完了しました</h1>
       	ホームに戻る場合は
		<a href='<s:url action="GoHomeAction"/>'>こちら</a>

	</div>

	<!-- フッター -->
	<jsp:include page="include_footer.jsp" />


</body>
</html>