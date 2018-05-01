<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>お気に入り削除</title>
</head>
<body>
	<jsp:include page="includeHeader.jsp" />
	<p>お気に入りを削除しました</p>
	<p>ホームへ戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a></p>
</body>
</html>