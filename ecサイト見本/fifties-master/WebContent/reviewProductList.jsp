<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<link rel="stylesheet" href="./css/fifties.css">
<link rel="stylesheet" href="./css/reviewList.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>
<title>レビューリスト</title>

</head>
<body>
	<header>
		<jsp:include page="includeHeader.jsp" />
	</header>

	<div class="main">

		<div id="top">
			<div id="title">
				<h1>REVIEW</h1>
				<p>レビュー一覧</p>
			</div>
		</div>

		<div id="content">

			<div id="product">
				<img src='<s:property value="imageFilePath" />'>
				<h3>
					<s:property value="productName" />
				</h3>
			</div>

			<div class="container">
				<s:iterator value="ReviewList">
					<div class="box">
						<p>
							<s:property value="userId" />
						</p>
						<p class="review-">
							<span class="star"> <s:if test="reviewScore == 1">
									★
								</s:if> <s:if test="reviewScore == 2">
									★★
								</s:if> <s:if test="reviewScore == 3">
									★★★
								</s:if> <s:if test="reviewScore == 4">
									★★★★
								</s:if> <s:if test="reviewScore == 5">
									★★★★★
								</s:if>
							</span>
							<s:property value="ReviewTitle" />
						</p>
						<p class="insert-date">
							<s:property value="insertDate" />
						</p>
						<span><s:property value="ReviewBody" /></span>
					</div>
				</s:iterator>
			</div>



			<a
				href='<s:url action="ProductDetailsAction">

				<s:param name="product_id" value="%{productId}"/>
				<s:param name="image_file_path" value="%{imageFilePath}"/>
				<s:param name="product_name" value="%{productName}"/>
				<s:param name="product_name_kana" value="%{productNameKana}"/>
				<s:param name="product_description" value="%{productDescription}"/>
				<s:param name="product_stock" value="%{productStock}"/>
				<s:param name="price" value="%{price}"/>
				<s:param name="category_id" value="%{categoryId}"/>
				<s:param name="release_company" value="%{releaseCompany}"/>
				<s:param name="release_date" value="%{releaseDate}"/>

			</s:url>'>商品詳細ページへ戻る</a>
		</div>

	</div>




</body>
	<jsp:include page="includeFooter.jsp" />
</html>