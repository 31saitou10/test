<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.jInvertScroll.js"></script>
<script type="text/javascript" src="script.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="./js/jquery-1.8.2.min.js"></script>
<script>
	/* 全角では入力できないように */
	function checkForm1($this) {
		var str = $this.value;
		if (str.match(/[^A-Z^a-z0-9]+/)) {
			alert('IDは半角英数字で入力してください。');
			$this.value = "";
		}
	}

	function checkForm2($this) {
		var str = $this.value;
		if (str.match(/[^A-Z^a-z0-9]+/)) {
			alert('パスワードは半角英数字で入力してください。');
			$this.value = "";
		}
	}
</script>
<link rel="stylesheet" type="text/css" href="./css/login.css">
<title>Login画面</title>
</head>

<body>
<!-- ヘッター -->
	<jsp:include page="include_header.jsp" />

	<div class=main>

<!-- ログイン画面はここから -->
		<div class="loginArea">
			<div class="login">
				<h2 class="headline">ログイン</h2>
<!-- テーブルの中身 -->
				<p>ログインIDとパスワードを入力してださい。</p>
<!-- ID保存機能 -->
				<s:form action="LoginAction">
					<s:if test="%{#session.saveId != null}">
						<div class="id">
							<label><s:checkbox name="saveLogin" checked="checked" />ID保存</label>
						</div>
					</s:if>
					<s:else>
						<div class="id">
							<label><s:checkbox name="saveLogin" />ID保存</label>
						</div>
					</s:else>
					<table class="table">
						<tbody>
<!-- ID入力 -->
							<tr>
								<th>IDを入力してください</th>
								<td><s:textfield type="text" id="loginUserId" class="form"
										placeholder="1文字以上8文字以下" name="loginUserId"
										value="%{#session.saveId}" style="ime-mode:disabled"
										onInput="checkForm1(this)" oncopy="return false"
										onpaste="return false" oncontextmenu="return false" />
									<s:if test="errorFlg==true">
										<span style="color: #ff0000; font-weigh:bold; font-size=1px;">
											<s:iterator value="errorLoginUserIdList">
												<s:property />
											</s:iterator>
										</span>
									</s:if></td>
							</tr>
<!-- パスワード入力 -->
							<tr>
								<th>パスワードを入力してください</th>
								<td><s:password class="form" placeholder="1文字以上16文字以下"
										name="loginPassword" style="ime-mode:disabled"
										onInput="checkForm2(this)" />
									<s:if test="errorFlg==true">
										<span style="color: #ff0000; font-weigh:bold; font-size=1px;">
											<s:iterator value="errorLoginPasswordList">
												<s:property />
											</s:iterator>
										</span>
									</s:if></td>
							</tr>
						</tbody>
					</table>
<!-- テーブル終わり -->
					<div class="text-center">
						<s:submit id="submit1" value="ログイン" />
						<br>
					</div>
				</s:form>
<!-- ログイン画面終わり -->
				<!-- 枠外 -->
				<div class="user">
					<div class="comments">
						<span>新規ユーザー登録は <s:url id="editUrl"
								action="UserCreateAction">
							</s:url> <s:a href="%{editUrl}">こちら</s:a><br>
						</span> <span>パスワード再設定は <a
							href='<s:url action="ResetPasswordAction"/>'>こちら</a><br>
						</span> <span>ホームに戻る場合は <a href='<s:url action="GoHomeAction"/>'>こちら</a>
						</span>
					</div>
				</div>
			</div>
		</div>
<!-- ログイン画面終わり -->
	</div>
<!-- フッター -->
	<jsp:include page="include_footer.jsp" />

</body>
</html>
