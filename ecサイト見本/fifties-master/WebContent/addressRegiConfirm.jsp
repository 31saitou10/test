<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- 林作成 -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<link rel="stylesheet" href="./css/fifties.css">
<link rel="stylesheet" href="./css/userAdd.css">
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="">
<meta name="keywords" content="" />
<title>宛先情報 登録確認</title>
<style type="text/css">

body{
	height: auto;
	}

.main{
	height: auto;
	}
.button-layout{
	margin-left: 10px;
	margin-right: 10px;

}

</style>

<script type="text/javascript">
	function goAddressRegisterAction() {
		document.getElementById("form-action").action = "AddressRegisterAction";
	}
	function goAddressRegiCompleteAction() {
		document.getElementById("form-action").action = "AddressRegiCompleteAction";
	}
</script>

</head>


<body>
	<jsp:include page="includeHeader.jsp" />

	<div id="main">
		<div id="form">
			<div class="title">
				<div class="titlefont">
					<h1>ADDRESS CHANGE</h1>
					<p class="titlefont">宛先情報登録確認</p>
				</div>
			</div>
			<div class="contents">
				<s:form id="form-action">

					<h2>以下の内容で登録します</h2>


					<!-- 姓 -->

					<div class="form-text">姓</div>
					<span><s:property value="familyName" escape="false" /> <input
						type=hidden name="familyName"
						value='<s:property value="familyName" />' /></span>


					<!-- 名 -->

					<div class="form-text">名</div>
					<span><s:property value="firstName" escape="false" /> <input
						type=hidden name="firstName"
						value='<s:property value="firstName" />' /></span>


					<!-- 姓仮名 -->

					<div class="form-text">姓（かな）</div>
					<span><s:property value="familyNameKana" escape="false" />
						<input type=hidden name="familyNameKana"
						value='<s:property value="familyNameKana" />' /></span>


					<!-- 名仮名 -->

					<div class="form-text">名（かな）</div>
					<span><s:property value="firstNameKana" escape="false" /> <input
						type=hidden name="firstNameKana"
						value='<s:property value="firstNameKana" />' /></span>


					<!-- 郵便番号 -->

					<div class="form-text">郵便番号</div>
					<span><s:property value="zip11" escape="false" /> <input
						type=hidden name="zip11" value='<s:property value="zip11" />' /></span>

					<!-- 住所 -->

					<div class="form-text">住所</div>
					<span><s:property value="addr11" escape="false" /> <input
						type=hidden name="addr11" value='<s:property value="addr11" />' /></span>


					<!-- 電話番号 -->

					<div class="form-text">電話番号</div>
					<span><s:property value="telNumber" escape="false" /> <input
						type=hidden name="telNumber"
						value='<s:property value="telNumber" />' /></span>


					<!-- メールアドレス -->

					<div class="form-text">メールアドレス</div>
					<span><s:property value="email" escape="false" /> <input
						type=hidden name="email" value='<s:property value="email" />' /></span>



					<!-- 送信ボタン -->

					<div class="button-center">
						<s:submit value="戻る" class="button-layout" onclick="goAddressRegisterAction()"/>
						<s:submit value="送信" class="button-layout" onclick="goAddressRegiCompleteAction()"/>
					</div>

				</s:form>
			</div>
		</div>
	</div>

	<jsp:include page="includeFooter.jsp" />

</body>
</html>