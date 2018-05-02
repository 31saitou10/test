<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" type="text/css" href="./css/productSearch.css">
<title>商品検索</title>
</head>
<body>

	<s:form action="ProductSearchAction" method="post" id="form1">



		<select name="category" id="select1">
			<option value="">カテゴリ選択</option>
			<option value="全商品">全商品</option>
			<option value="焼酎">焼酎</option>
			<option value="日本酒">日本酒</option>
			<option value="ウィスキー">ウィスキー</option>
			<option value="ワイン">ワイン</option>
		</select>


		<input id="search1" type="search" name="searchWord" placeholder="商品名を入れてください" autofocus>
		<input id="btn" type="image" src="./images/search.png">
	</s:form>



</body>
</html>