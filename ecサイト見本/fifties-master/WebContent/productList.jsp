<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- 戌亥 -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<link rel="stylesheet" href="./css/fifties.css">
<link rel="stylesheet" href="./css/productList.css">
<title>商品一覧</title>
</head>
<body>
<header>
<jsp:include page="includeHeader.jsp" />
</header>
<div class="main">
	<div class="title">
		<div class="titlefont">
	<h1>PRODUCT</h1>
	<p class="title">商品一覧</p>
		</div>
	</div>
	<s:if test = "searchErrorMessage == null || searchErrorMessage == '' ">
	<p><s:property value="%{searchMessage}" />
	</s:if>

	<s:else>
	<p><s:property value="%{searchErrorMessage}" />
	</s:else>
	<p>

<div class="container">
	<s:iterator value="searchList">

<div class="productbox">

			<a href="<s:url action="ProductDetailsAction">
					<s:param name="product_id" value="%{product_id}"/>
					<s:param name="image_file_path" value="%{image_file_path}"/>
					<s:param name="product_name" value="%{product_name}"/>
					<s:param name="product_name_kana" value="%{product_name_kana}"/>
					<s:param name="product_description" value="%{product_description}"/>
					<s:param name="product_stock" value="%{product_stock}"/>
					<s:param name="price" value="%{price}"/>
					<s:param name="category_id" value="%{category_id}"/>
					<s:param name="release_company" value="%{release_company}"/>
					<s:param name="release_date" value="%{release_date}"/>
				</s:url>">
				<img src="<s:property value= 'image_file_path'/>">
			<span class="link pname"><b>
				<s:property value="product_name" /></b>
			</span>
				<br>
			<span class="link kana">
				<s:property value="product_name_kana" />
			</span>
				<br>
			<span class="link price">
				<s:property value="price" />円
			</span>
				<br>
			<span class="link stock">
				在庫：<s:property value="product_stock"/>個
			</span>
			</a>
		</div>
	</s:iterator>
		</div>
	<div id="button">
		<div class="before">
			<s:if test="pageSelect > 0">
				<a href="<s:url action="ProductSearchAction">
					<s:param name="searchword" value="%{searchword}"/>
					<s:param name="category" value="%{category}"/>
					<s:param name="pageSelect" value="%{mainList()}"/>
				</s:url>">&laquo;最初へ</a>
			</s:if>
			<s:else>
						  &laquo;最初へ
			</s:else>
		</div>

		<s:if test="pageSelect > 1">
			<a href="<s:url action="ProductSearchAction">
				<s:param name="searchword" value="%{searchword}"/>
				<s:param name="category" value="%{category}"/>
				<s:param name="pageSelect" value="%{pageSelect -2}"/>
			</s:url>">
				&nbsp;<s:property value="pageSelect-1"/>&nbsp;
			</a>
		</s:if>

		<s:if test="pageSelect > 0">
			<a href="<s:url action="ProductSearchAction">
				<s:param name="searchword" value="%{searchword}"/>
				<s:param name="category" value="%{category}"/>
				<s:param name="pageSelect" value="%{pageSelect -1}"/>
			</s:url>">
				&nbsp;<s:property value="pageSelect"/>&nbsp;
			</a>
		</s:if>

				&nbsp;<s:property value="pageSelect+1"/>&nbsp;

		<s:if test="pageSelect < mainList.size() -1 && searchList.size() != allSearchList.size()">
			<a href="<s:url action="ProductSearchAction">
				<s:param name="searchword" value="%{searchword}"/>
				<s:param name="category" value="%{category}"/>
				<s:param name="pageSelect" value="%{pageSelect + 1}"/>
			</s:url>">
				&nbsp;<s:property value="pageSelect+2"/>&nbsp;
			</a>
		</s:if>

		<s:if test="pageSelect < mainList.size() -2 && searchList.size() != allSearchList.size()">
			<a href="<s:url action="ProductSearchAction">
				<s:param name="searchword" value="%{searchword}"/>
				<s:param name="category" value="%{category}"/>
				<s:param name="pageSelect" value="%{pageSelect + 2}"/>
			</s:url>">
				&nbsp;<s:property value="pageSelect+3"/>&nbsp;
			</a>
		</s:if>

	<div class="next">
		<s:if test="pageSelect < mainList.size() -1 && searchList.size() != allSearchList.size()">
			<a href="<s:url action="ProductSearchAction">
				<s:param name="searchword" value="%{searchword}"/>
				<s:param name="category" value="%{category}"/>
				<s:param name="pageSelect" value="%{mainList.size()-1}"/>
			</s:url>">最後へ&raquo;</a>
		</s:if>
		<s:else>
					  最後へ&raquo;
		</s:else>
	</div>
	</div>
	</div>

<jsp:include page="includeFooter.jsp" />
</body>
</html>