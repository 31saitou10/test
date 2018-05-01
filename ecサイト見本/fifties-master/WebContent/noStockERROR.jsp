<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<link rel="stylesheet" href="./css/cart.css"/>
	<title>在庫エラー</title>
</head>
<body>
	<jsp:include page="includeHeader.jsp"/>

	<br>

	<div class="error">
		<h3>申し訳ありません。在庫がありません。</h3>>
	<a href='<s:url action ="CartAction"/>'>カートへ</a>
	<a href='<s:url action ="GoHomeAction" />'>ホーム画面へ</a>
	</div>

	<jsp:include page="includeFooter.jsp"/>
</body>
</html>