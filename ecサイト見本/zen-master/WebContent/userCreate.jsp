
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<link rel="stylesheet" type="text/css" href="./css/userCreate.css">

<title>UserCreate画面</title>
</head>
<body>

	<!-- ヘッダー -->
	<jsp:include page="include_header.jsp" />

	<div id="main">

		<div id="haikei">

			<div class="white">
				<div class="create-area">
					<s:form action="UserCreateConfirmAction">



						<h2 class="heading">お客様情報入力画面</h2>
						<p>お客様の情報を入力してください</p>
						<h4>
							<span style="color: red"><s:property value="message" /></span>
						</h4>

						<table class="table">



							<tr>
								<th>姓</th>
								<td><s:textfield size="40" id="family_name" class="form"
										name="family_name" placeholder="1-16文字"
										value='%{family_name}' /> <span
									style="color: #ff0000; font-weigh: bold;"><s:iterator
											value="errorFamily_nameList">
											<s:property />
											<br>
										</s:iterator></span></td>
							</tr>

							<tr>
								<th>名</th>
								<td><s:textfield size="40" id="first_name" class="form"
										name="first_name" placeholder="1-16文字"
										value='%{first_name}' /> <span
									style="color: #ff0000; font-weigh: bold;"><s:iterator
											value="errorFirst_nameList">
											<s:property />
											<br>
										</s:iterator></span></td>
							</tr>

							<tr>
								<th>姓ふりがな</th>
								<td><s:textfield size="40" id="family_name_kana"
										class="form" name="family_name_kana" placeholder="ひらがな 1-16文字"
										value='%{family_name_kana}' /> <span
									style="color: #ff0000; font-weigh: bold;"><s:iterator
											value="errorFamily_name_kanaList">
											<s:property />
											<br>
										</s:iterator></span></td>
							</tr>

							<tr>
								<th>名ふりがな</th>
								<td><s:textfield size="40" id="first_name_kana"
										class="form" name="first_name_kana" placeholder="ひらがな 1-16文字"
										value='%{first_name_kana}' /> <span
									style="color: #ff0000; font-weigh: bold;"><s:iterator
											value="errorFirst_name_kanaList">
											<s:property />
											<br>
										</s:iterator></span></td>
							</tr>

							<tr>
								<th>性別</th>
								<td><s:if test='sex=="男"'>
										<input type="radio" type="hidden" id="sex" class="form"
											checked name="sex" value="男" />男
<input type="radio" type="hidden" id="sex" class="form" name="sex"
											value="女" />女
</s:if> <s:if test='sex=="女"'>
										<input type="radio" type="hidden" id="sex" class="form"
											checked name="sex" value="男" />男
<input type="radio" type="hidden" id="sex" class="form" checked
											name="sex" value="女" />女
</s:if> <s:if test='sex==null'>
										<input type="radio" type="hidden" id="sex" class="form"
											checked name="sex" value="男" />男
<input type="radio" type="hidden" id="sex" class="form" name="sex"
											value="女" />女
</s:if></td>
							</tr>

							<tr>
								<th>メールアドレス</th>
								<td><s:textfield size="40" id="email" class="form"
										name="email" placeholder="半角英数字 半角記号 14文字32-文字"
										value='%{email}' /> <span
									style="color: #ff0000; font-weigh: bold;"><s:iterator
											value="errorEmailList">
											<s:property />
											<br>
										</s:iterator></span></td>
							</tr>

							<tr>
								<th>ログインID</th>
								<td><s:textfield size="40" id="user_id" class="form"
										name="user_id" placeholder="半角英数字 1-8文字"
										value='%{user_id}' /> <span
									style="color: #ff0000; font-weigh: bold;"><s:iterator
											value="errorUser_idList">
											<s:property />
											<br>
										</s:iterator></span></td>
							</tr>

							<tr>
								<th>ログインPASS</th>
								<td><s:password size="40" name="password"
										placeholder="半角英数字 1-16文字" value='%{password}' /> <span
									style="color: #ff0000; font-weigh: bold;"><s:iterator
											value="errorPasswordList">
											<s:property />
											<br>
										</s:iterator></span></td>
							</tr>




						</table>

						<div id="movement">
							<s:submit id="submit1" value="登録確認" />
						</div>
						<br>
						<br>
					</s:form>
					<div id="movement2">
						前画面に戻る場合は<a href='<s:url action="GoLoginAction"/>'>こちら</a><br>
					
					</div>

				</div>
			</div>
		</div>
	</div>

	<!-- フッター -->
	<jsp:include page="include_footer.jsp" />

</body>
</html>