<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<link rel="stylesheet" type="text/css" href="./css/productList.css">
<title>商品一覧</title>
</head>
<body>

<header>
		<jsp:include page="include_header.jsp" flush="true" />
</header>

<div id="main2">
	<div id="message">
		<s:if test="searchWord != ''||category !=''">
			<h2>
			<s:property value="searchMessage" escape="false"/>
			</h2>
		</s:if>
	</div>

	<div id="list">商品一覧</div>


		<s:iterator value="productList">
		<div id="product1">
			<ul>
				<li><img class="image" src="<s:property value='image_file_path'/>" alt="Photo" width="250px" height="200px"></li>
				<li>商品名:<br><s:property value="product_name" /></li>
				<li>商品名かな:<br><s:property value="product_name_kana" /></li>
				<li>価格:<br><s:property value="price" />円</li>
				<li><a href="<s:url action="ProductDetailsAction"><s:param name="product_id" value="%{product_id}" /></s:url>"><s:submit id="btn2" value="商品詳細はこちら"/></a></li>
			</ul>
		</div>
		</s:iterator>
</div>

			<s:if test="pageSelect > 0">
				<form action="ProductSearchAction">
					<s:hidden name="searchWord" value="%{searchWord}" />
					<s:hidden name="category" value="%{category}" />
					<s:hidden name="pageSelect" value="%{pageSelect - 1}" />
					<s:submit id="submit1" value=" 前へ" />
				</form>
			</s:if>

			<s:if test="pageSelect < list.size() - 1">
				<form action="ProductSearchAction" method="post">
					<s:hidden name="searchWord" value="%{searchWord}" />
					<s:hidden name="category" value="%{category}" />
					<s:hidden name="pageSelect" value="%{pageSelect + 1}" />
						<s:submit id="submit2" value=" 次へ" />
				</form>
			</s:if>

<jsp:include page="include_footer.jsp"  flush="true" />

</body>
</html>