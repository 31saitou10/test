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
<link rel="stylesheet" href="./css/productDetails.css">
<title>商品詳細</title>
</head>
<body>

	<jsp:include page="includeHeader.jsp" />

	<div class="main">
		<div class="title">
			<div class="titlefont">
				<h1>PRODUCT</h1>
				<p class="title">商品詳細</p>
			</div>
		</div>

	<div id="main_con">
		<div class="container1">

			<s:form action="CartInsertAction">

				<img class="img1" src="<s:property value='image_file_path'/>">

				<div class="con1">
					<p class="pname">
						<b><s:property value="product_name" /></b>
					</p>

					<p class="kana">
						<s:property value="product_name_kana" />
					</p>

					<p class="info">
						<s:property value="release_date" /><br>
						<s:property value="release_company" />
					</p>

					<p class="price">
						<s:property value="price" />
						円
					</p>

					<p class="info">
						在庫：<s:property value="product_stock" />個
					</p>

				<s:if test="remainingCount > 0 && remainingCount < 6 ">
				<div id="selectWrap">
					<s:select class="select" name="productCount" list="stockList" />
				</div>
						<s:hidden name="productId" value="%{product_id}" />
						<s:hidden name="price" value="%{price}" />
						<s:submit class="button-layout long" value=" カートに入れる" />
					</s:if>
					<s:elseif test="remainingCount >= 6">
					<div id="selectWrap">
						<select class="select" name="productCount">
							<s:iterator value="stockList" status="st" begin="1" end="5">
								<option value="<s:property value="#st.count"/>"><s:property
										value="#st.count" /></option>
							</s:iterator>
						</select>
						</div>
						<s:hidden name="productId" value="%{product_id}" />
						<s:hidden name="price" value="%{price}" />
						<s:submit  class="button-layout long" value=" カートに入れる" />
					</s:elseif>

					<s:elseif test="product_stock==0">
						<p>在庫がありません</p>
					</s:elseif>
					<s:else>
						<p>カートにこれ以上いれられません</p>
					</s:else>
				</div>

			<!-- トークン -->
			<s:token/>

			</s:form>

			<s:if test="%{session.loginFlg == true}">
			<s:if test = "favoriteFlg == 0">
				<s:form action="FavoriteAction">
					<s:hidden name="productId" value="%{product_id}" />
					<s:hidden name="createFlg" value="1" />
					<p class="favorite">
						<s:submit class="button-layout long fv" value="お気に入りに入れる" />
					</p>
				</s:form>
				</s:if>
				<s:else>
				<s:form action="FavoriteAction">
				<p class="favorite">
						<s:submit class="button-layout long2 fv" value="お気に入り一覧を見る"/>
					</p>
				</s:form>
				</s:else>
			</s:if>

			<div class="con2">
				<p>
					<s:property value="product_description" />

				</p>
			</div>

			<s:if test="reviewList == null">
				<p>商品レビューはありません</p>
			</s:if>
			<s:elseif test="reviewList.size() >0 && reviewList.size <3 ">
				<div class="con3">
					<s:iterator value="reviewList" status="st">
						<div class="reviewbox">

							<span class="rtitle"><s:property value="reviewTitle" />
							</span>
							<br>

							<s:if test="reviewScore == 1">
								<span class="star">★</span>
							</s:if>
							<s:if test="reviewScore == 2">
								<span class="star">★★</span>
							</s:if>

							<s:if test="reviewScore == 3">
								<span class="star">★★★</span>
							</s:if>

							<s:if test="reviewScore == 4">
								<span class="star">★★★★</span>
							</s:if>

							<s:if test="reviewScore == 5">
								<span class="star">★★★★★</span>
							</s:if>


							<p class="rbody">
								<s:property value="reviewBody" />
							</p>
						</div>
					</s:iterator>

						<a
							href='<s:url action="ReviewListAction">
				<s:param name="productId" value="%{product_id}"/>
				<s:param name="imageFilePath" value="%{image_file_path}"/>
				<s:param name="productName" value="%{product_name}"/>
				<s:param name="productNameKana" value="%{product_name_kana}"/>
				<s:param name="productDescription" value="%{product_description}"/>
				<s:param name="productStock" value="%{product_stock}"/>
				<s:param name="price" value="%{price}"/>
				<s:param name="categoryId" value="%{category_id}"/>
				<s:param name="releaseCompany" value="%{release_company}"/>
				<s:param name="releaseDate" value="%{release_date}"/>
				</s:url>'>
				<span class="review">▼レビュー一覧▼</span></a>
				</div>
			</s:elseif>

			<s:else>
				<div class="con3">
					<s:iterator value="reviewList" status="st" begin="0" end="2">
						<div class="reviewbox">

							<span class="rtitle"><s:property value="reviewTitle" />
							</span>
							<br>

							<s:if test="reviewScore == 1">
								<span class="star">★</span>
							</s:if>
							<s:if test="reviewScore == 2">
								<span class="star">★★</span>
							</s:if>

							<s:if test="reviewScore == 3">
								<span class="star">★★★</span>
							</s:if>

							<s:if test="reviewScore == 4">
								<span class="star">★★★★</span>
							</s:if>

							<s:if test="reviewScore == 5">
								<span class="star">★★★★★</span>
							</s:if>



							<p class="rbody">
								<s:property value="reviewBody" />
							</p>
						</div>
					</s:iterator>
						<a
							href='<s:url action="ReviewListAction">
				<s:param name="productId" value="%{product_id}"/>
				<s:param name="imageFilePath" value="%{image_file_path}"/>
				<s:param name="productName" value="%{product_name}"/>
				<s:param name="productNameKana" value="%{product_name_kana}"/>
				<s:param name="productDescription" value="%{product_description}"/>
				<s:param name="productStock" value="%{product_stock}"/>
				<s:param name="price" value="%{price}"/>
				<s:param name="categoryId" value="%{category_id}"/>
				<s:param name="releaseCompany" value="%{release_company}"/>
				<s:param name="releaseDate" value="%{release_date}"/>
				</s:url>'>
				<span class="review">▼レビュー一覧▼</span></a>
				</div>
			</s:else>
		</div>
		</div>
		<h3>おすすめ商品</h3>

		<s:if test="sugestList.size()==0">
			<p>関連商品はありません
			<p>
		</s:if>
		<s:iterator value="sugestList">
			<div class="productbox">
				<a
					href="<s:url action="ProductDetailsAction">
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
					<span class="link2">
						<s:property value="product_name" />
					</span>
						<br>
					<span class="link2">
						<s:property value="product_name_kana" />
					</span>
						<br>
					<span class="link2">
						<s:property value="price" />円
					</span>
						 <br>
					<span class="link2">
						在庫：
						<s:property value="product_stock" />
						個
					</span>
				</a>
			</div>
		</s:iterator>
	</div>
	<jsp:include page="includeFooter.jsp" />
</body>
</html>