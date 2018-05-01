<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8" />
<link rel="stylesheet" type="text/css" href="css/form.css">
<link rel="stylesheet" href="./css/fifties.css">
<link rel="stylesheet" href="./css/userAdd.css">
<title>新規ユーザー登録</title>
<style type="text/css">
body {
	height: auto;
}

.main {
	height: auto;
}
</style>

</head>

<body>
	<jsp:include page="includeHeader.jsp" />
	<div id="main">
		<div id="form">
			<div class="title">
				<div class="titlefont">
					<h1>USER CREATE</h1>
					<p class="titlefont">新規ユーザー登録</p>
				</div>
			</div>

			<div class="contents">
				<s:form name="form-action" action="UserCreateConfirmAction"
					id="form-action">

					<!-- ユーザーID -->
					<s:if test="errorId!=null">
						<div class="error-color">
							<s:property value="errorId" />
						</div>
					</s:if>

					<div class="form-text">ユーザーID</div>
					<span> <input type="text" name="userId" size="20%"
						placeholder=" 半角英数字" maxlength="8"
						value='<s:property value="userId" />' />※8文字以内
					</span>
					<!-- パスワード -->
					<s:if test="errorPass!=null">
						<div class="error-color">
							<s:property value="errorPass" />
						</div>
					</s:if>

					<div class="form-text">パスワード</div>
					<span> <input type="password" name="password" size="20%"
						placeholder=" 半角英数字" maxlength="16" />※16文字以内
					</span>

					<!-- 名前（姓・名） -->
					<s:if test="errorName!=null">
						<div class="error-color">
							<s:property value="errorName" />
						</div>
					</s:if>

					<div class="form-text">お名前（姓）</div>
					<span> <input type="text" name="familyName" size="20%"
						placeholder=" 漢字,ひらがな,半角英字" maxlength="16"
						value='<s:property value="familyName"/>' />※16文字以内
					</span>

					<div class="form-text">お名前（名）</div>
					<span><input type="text" name="firstName" size="20%"
						placeholder=" 漢字,ひらがな,半角英字" maxlength="16"
						value='<s:property value="firstName"/>' />※16文字以内 </span>

					<!-- なまえ（せい・めい） -->
					<s:if test="errorNameKana!=null">
						<div class="error-color">
							<s:property value="errorNameKana" />
						</div>
					</s:if>

					<div class="form-text">ふりがな（せい）</div>
					<span> <input type="text" name="familyNameKana" size="20%" maxlength="16"
						placeholder=" ひらがな" value='<s:property value="familyNameKana"/>' />※16文字以内
					</span>

					<div class="form-text">ふりがな（めい）</div>
					<span><input type="text" name="firstNameKana" size="20%" maxlength="16"
						placeholder=" ひらがな" value='<s:property value="firstNameKana"/>' />※16文字以内
					</span>

					<!-- 性別  s:if test="sex==0" にすると null になり else になるから sex==1 にしている。  -->
					<s:if test="sex == 1">
						<div class="form-text">性別 (選択)</div>
						<input type="radio" name="sex" value='0' />男 <input type="radio"
							name="sex" value='1' checked="checked" />女
					</s:if>
					<s:else>
						<div class="form-text">性別 (選択)</div>
						<input type="radio" name="sex" value='0' checked="checked" />男 <input
							type="radio" name="sex" value='1' />女
					</s:else>

					<!-- メールアドレス -->
					<s:if test="errorEmail!=null">
						<div class="error-color">
							<s:property value="errorEmail" />
						</div>
					</s:if>

					<div class="form-text">メールアドレス【半角英数字 ＋ @】</div>
					<span><input type="text" name="email" size="20%"
						placeholder=" 半角英数字,記号" maxlength="32"
						value='<s:property value="email"/>' />※14文字～32文字</span>

					<!-- 秘密の質問 -->
					<s:if test="question=='尊敬する人物は？'">
						<div class="form-text">秘密の質問 （選択）</div>
						<select name="question">
							<option value="嫌いな食べ物は？">嫌いな食べ物は？</option>
							<option value="尊敬する人物は？" selected="selected">尊敬する人物は？</option>
							<option value="初めて飼ったペットの名前は？">初めて飼ったペットの名前は？</option>
						</select>
					</s:if>
					<s:elseif test="question=='初めて飼ったペットの名前は？'">
						<div class="text-form">秘密の質問 （選択）</div>
						<select name="question">
							<option value="嫌いな食べ物は？">嫌いな食べ物は？</option>
							<option value="尊敬する人物は？">尊敬する人物は？</option>
							<option value="初めて飼ったペットの名前は？" selected="selected">初めて飼ったペットの名前は？</option>
						</select>
					</s:elseif>
					<s:else>
						<div class="form-text">秘密の質問 (選択)</div>
						<select name="question" style="width: 172px">
							<option value="嫌いな食べ物は？" selected="selected">嫌いな食べ物は？</option>
							<option value="尊敬する人物は？">尊敬する人物は？</option>
							<option value="初めて飼ったペットの名前は？">初めて飼ったペットの名前は？</option>
						</select>
					</s:else>

					<!-- 質問の答え -->
					<s:if test="errorAnswer!=null">
						<div class="error-color">
							<s:property value="errorAnswer" />
						</div>
					</s:if>

					<div class="form-text">質問の答え</div>
					<span><input type="text" name="answer" size="20%"
						placeholder=" 答えを入力" value='<s:property value="answer"/>' /></span>
				</s:form>

				<div id="button">
					<ul>
						<li><s:form action="GoLoginAction">
								<s:submit class="button-layout" value="戻る" />
							</s:form></li>

						<li><s:submit class="button-layout" form="form-action"
								value="次へ" /></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="includeFooter.jsp" />
</body>
</html>