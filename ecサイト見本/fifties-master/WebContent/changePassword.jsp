<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/form.css">
<link rel="stylesheet" href="./css/fifties.css">
<link rel="stylesheet" href="./css/userAdd.css">

<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<!-- 半角英数字入力のアラートを出す -->
<script type="text/javascript">
	function checkForm($this) {
		var str = $this.value;
		if (str.match(/[^A-Z^a-z0-9]+/)) {
			alert('半角英数で入力してください');
			$this.value = "";
		}
	}
</script>

<title>パスワード変更画面</title>
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
			<div class="title passchange">

				<div class="titlefont">
					<h1>
						CHANGE<br> PASSWORD
					</h1>
					<p class="titlefont">パスワード再設定</p>
				</div>
			</div>

			<div class="contents">

				<s:form action="ChangePasswordConfirmAction" id="form-action">
					<!-- エラー表示 -->
					<s:if test="errorMessage!=''">
						<s:iterator value="errMsgList">
							<div class="error-color">
								<s:property />
							</div>
						</s:iterator>
					</s:if>

					<!-- ユーザーID -->
					<div class="form-text">ユーザーID</div>
					<s:if test="#session.saveId != null">
						<span><input type="text" maxlength="8"
							value='<s:property value="#session.saveId"/>' name="userid"
							placeholder="半角英数字" />※8文字以内</span>
					</s:if>
					<s:else>
						<span><input type="text" maxlength="8"
							value='<s:property value="userid"/>' name="userid"
							placeholder="半角英数字" />※8文字以内</span>
					</s:else>

					<!-- 秘密の質問 -->
					<s:if test="question=='尊敬する人物は？'">
						<div class="form-text">秘密の質問 （選択）</div>
						<select name="question" style="width: 172px">
							<option value="嫌いな食べ物は？">嫌いな食べ物は？</option>
							<option value="尊敬する人物は？" selected="selected">尊敬する人物は？</option>
							<option value="初めて飼ったペットの名前は？">初めて飼ったペットの名前は？</option>
						</select>
					</s:if>

					<s:elseif test="question=='初めて飼ったペットの名前は？'">
						<div class="text-form">秘密の質問 （選択）</div>
						<select name="question" style="width: 172px">
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
					<div class="form-text">答え</div>
					<span><input type="text" name="answer" size="20%"
						placeholder=" 答えを入力" value='<s:property value="answer"/>' /></span>

					<div class="form-text">新しいパスワード</div>
					<input type="password" name="newpass" maxlength="16"
						placeholder="半角英数字" />※16文字以内

					<div class="form-text">確認</div>
					<input type="password" name="checkpass" maxlength="16"
						placeholder="もう一度入力" />

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