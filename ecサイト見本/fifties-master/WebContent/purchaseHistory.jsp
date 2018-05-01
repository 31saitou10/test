
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript"/>

<link rel="stylesheet" href="./css/fifties.css">
<link rel="stylesheet" href="./css/myPage.css">

<title>購入履歴</title>

</head>


<body>
	<jsp:include page="includeHeader.jsp" />

	<div id="main" class="ph">
		<div class="title">
			<div class="titlefont">
				<h1 class="spacing">PURCHASE HISTORY</h1>
				<p class="title">購入履歴</p>
			</div>
		</div>

		<div id="contents" class="border ph">

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
						<span style="color: red;"><s:property value="message" /></span>

						<s:if test="historyList==null">
							<p>購入履歴はありません</p>
						</s:if>
					</div>

					<s:elseif test="historyList != null && historyList.size() != 0">
						<div class="message">
							<p>購入情報は以下になります。</p>
							<p>
							<!-- ■並び替えのプルダウン■ -->
								<s:form action="PurchaseHistoryAction">
									<div id="selectWrap">
										<select class="select" name="sort">
											<s:if test="sort == 1">
												<option selected value="1">注文日 新しい順</option>
											</s:if>
											<s:if test="sort != 1">
												<option value="1">注文日 新しい順</option>
											</s:if>
											<s:if test="sort == 2">
												<option selected value="2">値段 高い順</option>
											</s:if>
											<s:if test="sort != 2">
												<option value="2">値段 高い順</option>
											</s:if>
											<s:if test="sort == 3">
												<option selected value="3">値段 安い順</option>
											</s:if>
											<s:if test="sort != 3">
												<option value="3">値段 安い順</option>
											</s:if>
										</select>
									</div>
									<s:submit class="button-layout" value="並び替え" />
								</s:form>
							</p>

						</div>


						<s:form action="PurchaseHistoryAction">
						<input type="hidden" name="deleteFlg" value="2" />
						<div id="boxlist">
							<s:iterator value="historyList" status="st">

								<div class="box">
								<!-- ｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰ----ｰｰｰｰｰｰboxｰｰｰｰ-----ｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰ -->
									<a href="<s:url action="ProductDetailsAction"><s:param name="product_id" value="%{productId}" /></s:url>">
										<img src="<s:property value='imageFilePath'/>"
											alt="Photo">
									</a>
									<div class="pname"><s:property value="productName" /></div>
									<div class="kana"><s:property value="productNameKana" /></div>
									<div class="info">購入個数　<s:property value="count" />点</div>

										<!-- 購入日時 -->
										<div class="info">購入日時：<s:property value="insertDate" /></div>
										<div class="info">値段：<s:property value="price" /></div>
										<div class="info">発売会社名：<s:property value="releaseCompany" /></div>
										<div class="info">発売年月日：<s:property value="releaseDate" /></div>

								<!-- チェックボックス,選択したものだけを削除 -->
									<div class="info">
										<s:if test="#st.index == 0">
											<label><s:checkbox name="checkList" value="0"
													fieldValue="%{id}" />チェック</label>
										</s:if>
										<s:else>
											<label><s:checkbox name="checkList" value="0"
													fieldValue="%{id}" />チェック</label>
										</s:else>
									</div>

									<!-- レビュー -->
									 <div class="review"><a
										href="<s:url action="CreateReviewAction"><s:param name="productId" value="%{productId}" />
										<s:param name="imageFilePath" value="%{imageFilePath}" />
										<s:param name="productName" value="%{productName}" /></s:url>">レビューを投稿する</a></div>
								<!-- ｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰここまでｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰ -->
								</div>

							</s:iterator>
						</div>
						<div class="clear"></div>

						<!--  ■削除ボタン■ -->
							<s:submit class="button-layout button1" value="チェックした項目を削除" />

						</s:form>

							<s:form action="PurchaseHistoryAction">
								<input type="hidden" name="deleteFlg" value="1">
								<s:submit class="button-layout button1" value="履歴をすべて削除" />
							</s:form>
					</s:elseif>





			<!-- ページネーション -->
					<div id="page_move">
						<ul>
							<li>
								<s:if test="pageSelect > 0">
									<form action="PurchaseHistoryAction">
										<s:hidden name="pageSelect" value="%{pageSelect - 1}" />
										<s:hidden name="sort" value="%{sort}" />
										<s:submit class="button-layout pm" value=" 前へ" />
									</form>
								</s:if>
							</li>

							<li class="pm"><s:property value="pageSelect+1" /></li>

							<li>
								<s:if
									test="pageSelect < mainList.size() -1 && historyList.size() != allHistoryList.size()">
									<form action="PurchaseHistoryAction" method="post">
										<s:hidden name="sort" value="%{sort}" />
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


	<jsp:include page="includeFooter.jsp" />

</body>

</html>