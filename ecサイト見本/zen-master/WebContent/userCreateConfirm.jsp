<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<link rel="stylesheet" type="text/css"
	href="./css/userCreateConfirm.css">


<title>UserCreateConfirm画面</title>


</head>
<body>
	<!-- ヘッダー -->
	<jsp:include page="include_header.jsp" />

	<div id="main">

		<div id="haikei">

			<div class="white">
				<div class="create-area">


					<s:form action="UserCreateCompleteAction">

						<h3 class="heading">登録する内容は以下でよろしいですか。</h3>
						<table class="table">
							<tr>

								<th>姓</th>

								<td><s:property value="#session.family_name" escape="false" />
									<input type="hidden" name="family_name"
									value='<s:property value="family_name"/>'></td>
							</tr>

							<tr>

								<th>名</th>

								<td><s:property value="#session.first_name" escape="false" />
									<input type="hidden" name="first_name"
									value='<s:property value="first_name"/>'></td>
							</tr>

							<tr>

								<th>姓ふりがな</th>

								<td><s:property value="#session.family_name_kana"
										escape="false" /> <input type="hidden" name="family_name_kana"
									value='<s:property value="family_name_kana"/>'></td>
							</tr>

							<tr>

								<th>名ふりがな</th>

								<td><s:property value="#session.first_name_kana"
										escape="false" /> <input type="hidden" name="first_name_kana"
									value='<s:property value="first_name_kana"/>'></td>
							</tr>

							<tr>

								<th>性別</th>

								<td><s:property value="#session.sex" escape="false" /> <input
									type="hidden" name="sex" value='<s:property value="sex"/>'>
								</td>
							</tr>

							<tr>

								<th>メールアドレス</th>

								<td><s:property value="#session.email" escape="false" /> <input
									type="hidden" name="email" value='<s:property value="email"/>'>
								</td>
							</tr>

							<tr>

								<th>ログインID:</th>

								<td><s:property value="#session.user_id" escape="false" />
									<input type="hidden" name="user_id"
									value='<s:property value="user_id"/>'></td>
							</tr>

							<tr>

								<th>ログインPASS:</th>

								<td><s:property value="#session.password" escape="false" />
								</td>
							</tr>

						</table>

						<div id="movement">
							<s:submit id="submit1" value="登録" />
						</div>
						<br>
						<br>
					</s:form>

					<div id="movement2">
						前画面に戻る場合は
						<s:url id="editUrl" action="UserCreateAction">
							<s:param name="family_name" value="%{family_name}" />
							<s:param name="first_name" value="%{first_name}" />
							<s:param name="family_name_kana" value="%{family_name_kana}" />
							<s:param name="first_name_kana" value="%{first_name_kana}" />
							<s:param name="sex" value="%{sex}" />
							<s:param name="email" value="%{email}" />
							<s:param name="user_id" value="%{user_id}" />
							<s:param name="password" value="%{password}" />
						</s:url>
						<s:a href="%{editUrl}">こちら</s:a>
					</div>



				</div>
			</div>



		</div>
	</div>

	<!-- フッター -->
	<jsp:include page="include_footer.jsp" />

</body>
</html>