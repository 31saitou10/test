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


				<s:form action="UserCreateCompleteAction">

					<tr>

 					<tr>
 					<th>パスワード</th>
					<td><s:property value="passCon" escape="false" /></td>
					</tr>

 					<tr>
 					<th>パスワード</th>
					<td><s:property value="passCon" escape="false" /></td>
					</tr>

					<tr>
					<th>姓</th>
					<td><s:property value="familyName" escape="false" /></td>
					</tr>

					<tr>
					<th>名</th>
					<td><s:property value="firstName" escape="false" /></td>
					</tr>

					<tr>
					<th>せい</th>
					<td><s:property value="familyNameKana" escape="false" /></td>
					</tr>

					<tr>
					<th>めい</th>
					<td><s:property value="firstNameKana" escape="false" /></td>
					</tr>

					<tr>
					<th>性別</th>
					<s:if test="sex==0">男</s:if>
					<s:if test="sex==1">女</s:if>
					</tr>

					<tr>
					<th>メールアドレス</th>
					<td><s:property value="email" escape="false" /></td>
					</tr>

					<tr>
					<th>秘密の質問</th>
					<td><s:if test="secretQuestion==1">好きな食べ物</s:if>
		                  <s:if test="secretQuestion==2">好きな動物</s:if></td>
		            </tr>

					<tr>
					<th>質問の答え</th>
					<td><s:property value="secretAnswer" escape="false" /></td>
					</tr>

					<div id="button">
						<ul>
							<li><s:submit class="button-layout" value="訂正"
									onclick="goUserCreateAction();" /></li>
							<li><s:submit class="button-layout" value="登録"
									onclick="goUserCreateCompleteAction();" /></li>
						</ul>
					</div>
				</s:form>



</body>
</html>