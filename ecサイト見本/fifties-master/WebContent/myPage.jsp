<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<link rel="stylesheet" href="./css/fifties.css">
<link rel="stylesheet" href="./css/myPage.css">
<title>MyPage</title>

</head>
<body>

	<jsp:include page="includeHeader.jsp"/>

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
	                    <h1>USER INFO</h1>
	                    <p class="title">ユーザー情報</p>
	               </div>
                </div>

                <div id="rightcontents">

						<table><s:iterator value="myPageList">
							<tr>
								<th>ユーザーID</th>
								<td><s:property value="userId" escape="false" /></td>
							</tr>
							<tr>
								<th>パスワード</th>
								<td><s:form action="MyPageAction" style="display: inline"><s:property value="invisiblePassword" /></s:form>
									<a href='<s:url action="ChangePasswordAction" />'>[変更]</a></td>
							</tr>
							<tr>
								<th>お名前（姓）</th>
								<td><s:property value="familyName" escape="false" /></td>

							</tr>
							<tr>
								<th>お名前（名）</th>
								<td><s:property value="firstName" escape="false" /></td>
							</tr>
							<tr>
								<th>ふりがな（せい）</th>
								<td><s:property value="familyNameKana" escape="false" /></td>
							</tr>
							<tr>
								<th>ふりがな（めい）</th>
								<td><s:property value="firstNameKana" escape="false" /></td>
							</tr>
							<tr>
								<th>性別</th>
								<td><s:if test="sex==0">男性</s:if>
									<s:if test="sex==1">女性</s:if></td>
							</tr>
							<tr>
								<th>メールアドレス</th>
								<td><s:property value="email" escape="false" /></td>
							</tr>
						</s:iterator></table>

				</div>
			</div>
			<div class="clear"></div>

		</div>
	</div>

	<jsp:include page="includeFooter.jsp"/>

</body>
</html>