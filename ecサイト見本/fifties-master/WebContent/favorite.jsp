<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<link rel="stylesheet" href="./css/fifties.css">
<link rel="stylesheet" href="./css/myPage.css">
<title>お気に入り</title>
</head>

<body>

	<jsp:include page="includeHeader.jsp" />

	<div id="main" class="fv">
		<div class="title">
			<div class="titlefont">
				<h1>FAVORITE</h1>
				<p class="title">お気に入り商品</p>
			</div>
		</div>

		<div id="contents" class="border fv">

			<div id="left" class="border">
				<p class="list _1"><a href='<s:url action="MyPageAction" />'>ユーザー情報確認</a></p>
				<p class="list _2"><a href='<s:url action="UserUpdateAction" />'>ユーザー情報変更</a></p>
				<p class="list _3"><a href='<s:url action="PurchaseHistoryAction" />'>購入履歴</a></p>
				<p class="list _4"><a href='<s:url action="FavoriteAction" />'>お気に入りリスト</a></p>
				<p class="list _5"><a href='<s:url action="CartAction" />'>カート</a></p>
			</div>

			<div id="right">

				<div id="rightcon">

					<br><div class="message">
						<span style="color: red;"><s:property value="deleteMessage" /></span>

						<s:form action="FavoriteAction">
							<s:property value="%{FavoriteMessage}" />
						</s:form>
					</div>
						<s:if test="favoriteList.size() > 0">
							<s:form action="FavoriteAction">
								<div id="boxlist">
									<s:iterator value="favoriteList">
										<div class="box">
										<!-- ｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰboxｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰ -->
											<a href="<s:url action="ProductDetailsAction">
												<s:param name="product_id" value="%{product_id}"/></s:url>">
												<img src="<s:property value= 'image_file_path'/>">

												<div class="pname"><s:property value="product_name" /></div>
												<div class="kana"><s:property value="product_name_kana" /></div>
												<div class="info">発売日：<s:property value="release_date" /></div>
												<div class="info">製造会社：<s:property value="release_company" /></div>
												<div class="price"><s:property value="price" />円</div></a>

												<div class="info"><label><s:checkbox name="deleteList" value="0" fieldValue="%{product_id}" />削除する場合チェック</label></div>
										<!-- ｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰここまでｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰ -->
										</div>
									</s:iterator>
									</div>
								<div class="clear"></div>
									<input type="hidden" name="deleteFlg" value="1">
									<s:submit class="button-layout" value="削除" />

							</s:form>
						</s:if>

					<div id="page_move">
						<ul>
							<li>
								<s:if test="pageSelect > 0">
									<form class="before" action="FavoriteAction">
										<s:hidden name="productId" value="%{productId}" />
										<s:hidden name="pageSelect" value="%{pageSelect - 1}" />
										<s:submit class="button-layout pm" value=" 前へ" />
									</form>
								</s:if>
							</li>

							<li class="pm"><s:property value="pageSelect+1" /></li>

							<li>
								<s:if test="pageSelect < mainList.size() -1 && favoriteList.size() != allFavoriteList.size()">
									<form class="next" action="FavoriteAction" method="post">
										<s:hidden name="productId" value="%{productId}" />
										<s:hidden name="pageSelect" value="%{pageSelect + 1}" />
										<s:submit class="button-layout pm" value=" 次へ" />
									</form>
								</s:if>
							</li>
						</ul>

					</div>
				</div>
			</div>
		</div>
	</div>


		<jsp:include page="includeFooter.jsp"/>

</body>
</html>
