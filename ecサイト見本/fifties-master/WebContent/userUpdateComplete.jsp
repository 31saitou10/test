<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- ホーム画面に3秒後遷移 content="秒数" -->
<meta http-equiv="refresh" content="3;URL=MyPageAction">

<title>ユーザー情報変更完了画面</title>

<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" href="./css/fifties.css">
<link rel="stylesheet" href="./css/myPage.css">

</head>

<body>

	<jsp:include page="includeHeader.jsp" />

	<div id="main">
		<div class="title">
			<div class="titlefont">
				<h1>MY PAGE</h1>
				<p class="title">マイページ</p>
			</div>
		</div>

		<div id="contents" class="border">

			<div id="left" class="border">
				<p class="list _1"><a href='<s:url action="MyPageAction" />'>ユーザー情報確認</a></p>
				<p class="list _2"><a href='<s:url action="UserUpdateAction" />'>ユーザー情報変更</a></p>
				<p class="list _3"><a href='<s:url action="PurchaseHistoryAction" />'>購入履歴</a></p>
				<p class="list _4"><a href='<s:url action="FavoriteAction" />'>お気に入りリスト</a></p>
				<p class="list _5"><a href='<s:url action="CartAction" />'>カート</a></p>
			</div>

			<div id="right">

				<div id="contentstitle">
					<div class="titlefont">
	                    <h1>USER CHANGE</h1>
	                    <p class="title">ユーザー情報変更完了</p>
	               </div>
                </div>

				<div id="rightcontents">
                	<div id="userinfo">
						<h2>ユーザー情報の変更が完了しました。</h2>
						<p>3秒後に自動的にユーザー情報画面へ遷移します。</p>
						<p>ジャンプしない場合は
							<a href='<s:url action="MyPageAction" />'>こちら</a>
								をクリックしてください。</p>
					</div>
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="includeFooter.jsp" />
</body>
</html>