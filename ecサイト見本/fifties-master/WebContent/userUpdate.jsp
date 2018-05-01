<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- 林作成 -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />


<link rel="stylesheet" href="./css/fifties.css">
<link rel="stylesheet" href="./css/myPage.css">

<title>ユーザー情報変更画面</title>


</head>
<body>
	<jsp:include page="includeHeader.jsp" />

	<div id="main" class="fv">
		<div class="title">
			<div class="titlefont">
				<h1>MY PAGE</h1>
				<p class="title">マイページ</p>
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

				<div id="contentstitle">
					<div class="titlefont">
	                    <h1>USER CHANGE</h1>
	                    <p class="title">ユーザー情報変更</p>
	               </div>
                </div>

                	<div id="rightcontents">
                		<div id="userinfo">
							<s:form action="UserUpdateConfirmAction" id="form-action">

								<!-- ユーザーID -->
								<div class="form-text"><b>ユーザーID</b></div>
								<span><s:property value="%{session.userId}" /> <s:hidden
										name="user_id" value="%{session.userId}" /></span>

								<!-- 現在のパスワード -->
								<s:if test="errorPass != null">
								<div class="error-color">
									<s:property value="errorPass" />
								</div>
								</s:if>
								<div class="form-text">現在のパスワード</div>
								<span><s:password name="password"
										placeholder="1〜16文字の半角英数字" /></span>


								<div class="form-text">新規パスワード</div>
								<span><s:password name="newPassword"
										placeholder="1〜16文字の半角英数字" /></span>



								<div class="form-text">確認用パスワード</div>
								<span><s:password name="rePassword"
										placeholder="パスワードを再入力してください" /></span>

								<div class="form-text">メールアドレス</div>
								<div class="error-color">
									<s:property value="errorEmail" />
								</div>
								<s:if test="newEmail != null">
									<span><s:textfield name="newEmail"
											placeholder="14文字以上32文字以下" value="%{newEmail}" /></span>
								</s:if>
								<s:else>
									<span><s:textfield name="newEmail"
											placeholder="14文字以上32文字以下" value="%{dto.email}" /></span>
								</s:else>


								<div class="form-text"><b>名前</b></div>

								<div class="form-text">姓</div>
								<div class="error-color">
									<s:property value="errorFamilyName" />
								</div>
								<s:if test="familyName != null">
									<span><s:textfield name="familyName" value="%{familyName}"
											placeholder="1文字以上16文字以下" /></span>
								</s:if>
								<s:else>
									<span><s:textfield name="familyName"
											placeholder="1文字以上16文字以下" value="%{dto.familyName}" /></span>
								</s:else>

								<div class="form-text">名</div>
								<div class="error-color">
									<s:property value="errorFirstName" />
								</div>
								<s:if test="firstName != null">
									<span><s:textfield name="firstName" value="%{firstName}"
											placeholder="1文字以上16文字以下" /></span>
								</s:if>
								<s:else>
									<span><s:textfield name="firstName"
											placeholder="1文字以上16文字以下" value="%{dto.firstName}" /></span>
								</s:else>

								<div class="form-text"><b>ふりがな</b></div>

								<div class="form-text">せい</div>
								<div class="error-color">
									<s:property value="errorFamilyNameKana" />
								</div>
								<s:if test="familyNameKana != null">
									<span><s:textfield name="familyNameKana"
											value="%{familyNameKana}" placeholder="1文字以上16文字以下" /></span>
								</s:if>
								<s:else>
									<span><s:textfield name="familyNameKana"
											placeholder="1文字16文字以下" value="%{dto.familyNameKana}" /></span>
								</s:else>

								<div class="form-text">めい</div>
								<div class="error-color">
									<s:property value="errorFirstNameKana" />
								</div>
								<s:if test="firstNameKana != null">
									<span><s:textfield name="firstNameKana"
											value="%{firstNameKana}" placeholder="1文字以上16文字以下" /></span>
								</s:if>
								<s:else>
									<span><s:textfield name="firstNameKana"
											placeholder="1文字以上16文字以下" value="%{dto.firstNameKana}" /></span>
								</s:else>

							</s:form>
						</div>


						<div id="button">
						<ul>
							<li><s:form action="MyPageAction">
									<s:submit class="button-layout" value="戻る" />
								</s:form></li>
							<li><s:submit class="button-layout" form="form-action" value="次へ" /></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="includeFooter.jsp" />

</body>
</html>