<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>入力情報確認画面</title>
</head>

			<script>
			function goUserCreateCompleteAction() {
				document.getElementById("form-action").action = "UserCreateCompleteAction";
				}
			function goUserCreateAction() {
				document.getElementById("form-action").action = "UserCreateAction";
				}

			</script>
			<body>
			 <h2>新規ユーザー登録確認</h2>


				<div class="contents">

				<s:form id="form-action" name="form-action"
					action="UserCreateCompleteAction">

					<div class="form-text">ユーザーID</div>
					<span><s:property value="userId" escape="false" /> <input
						type="hidden" name="userId" value='<s:property value="userId"/>'></span>

 					<div class="form-text">パスワード</div>
					<span><s:property value="passCon" escape="false" />
					<input type="hidden" name="password" value='<s:property value="password"/>'></span>

					<div class="form-text">姓</div>
					<span><s:property value="familyName" escape="false" />
					 <input type="hidden" name="familyName" value='<s:property value="familyName"/>'></span>

					<div class="form-text">名</div>
					<span><s:property value="firstName" escape="false" />
					<input type="hidden" name="firstName" value='<s:property value="firstName"/>'></span>

					<div class="form-text">せい</div>
					<span><s:property value="familyNameKana" escape="false" />
					<input type="hidden" name="familyNameKana" value='<s:property value="familyNameKana"/>'></span>

					<div class="form-text">めい</div>
					<span><s:property value="firstNameKana" escape="false" />
					<input type="hidden" name="firstNameKana" value='<s:property value="firstNameKana"/>'></span>

					<div class="form-text">性別</div>
					<s:if test="sex==0">男</s:if>
					<s:if test="sex==1">女</s:if>
					<input type="hidden" name="sex" value='<s:property value="sex"/>'>

					<div class="form-text">メールアドレス</div>
					<span><s:property value="email" escape="false" /> <input
						type="hidden" name="email" value='<s:property value="email"/>'></span>

					<div class="form-text">秘密の質問</div>
					<span><s:if test="secretQuestion==1">好きな食べ物</s:if>
		                  <s:if test="secretQuestion==2">好きな動物</s:if></span>

					<div class="form-text">質問の答え</div>
					<span><s:property value="secretAnswer" escape="false" />
					<input type="hidden" name="secretAnswer" value='<s:property value="secretAnswer"/>'></span>

					<div id="button">
						<ul>
							<li><s:submit class="button-layout" value="訂正"
									onclick="goUserCreateAction();" /></li>
							<li><s:submit class="button-layout" value="登録"
									onclick="goUserCreateCompleteAction();" /></li>
						</ul>
					</div>
				</s:form>
			</div>


</body>
</html>