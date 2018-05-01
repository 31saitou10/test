<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- 林作成 -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<link rel="stylesheet" href="./css/fifties.css">
<link rel="stylesheet" href="./css/myPage.css">

<title>ユーザー情報変更確認画面</title>
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
	                    <p class="title">ユーザー情報変更確認</p>
	               </div>
                </div>

				<div id="rightcontents">
                		<div id="userinfo">

                		<p>以下の内容に変更します。<br>
                			よろしいでしょうか？</p>

						<s:form action="UserUpdateCompleteAction" id="form-action">

							<div class="form-text"><b>ユーザーID</b></div>
							<span><s:property value="%{user_id}" /> <s:hidden
									name="user_id" value="%{user_id}" /></span>

							<s:if test="newPassword !=''">
								<div class="form-text"><b>新規パスワード</b></div>
								<span><s:property value="newPassword" /></span>
							</s:if>

							<s:hidden name="newPassword" value="%{newPassword}" />

							<div class="form-text"><b>メールアドレス</b></div>
							<span><s:property value="newEmail" /> <s:hidden
									name="newEmail" value="%{newEmail}" /></span>

							<div class="form-text"><b>姓</b></div>
							<span><s:property value="familyName" /> <s:hidden
									name="familyName" value="%{familyName}" /></span>

							<div class="form-text"><b>名</b></div>
							<span><s:property value="firstName" /> <s:hidden
									name="firstName" value="%{firstName}" /></span>

							<div class="form-text"><b>せい</b></div>
							<span><s:property value="familyNameKana" /> <s:hidden
									name="familyNameKana" value="%{familyNameKana}" /></span>

							<div class="form-text"><b>めい</b></div>
							<span><s:property value="firstNameKana" /> <s:hidden
									name="firstNameKana" value="%{firstNameKana}" /></span>

						</s:form>
					</div>

					<div id="button">
						<ul>
							<li><s:form action="UserUpdateAction">
									<s:submit class="button-layout" value="訂正" />
								</s:form></li>
							<li><s:submit class="button-layout" form="form-action" value="変更" /></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="includeFooter.jsp" />

</body>
</html>