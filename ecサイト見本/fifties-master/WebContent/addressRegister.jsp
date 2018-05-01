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
<title>宛先情報 登録</title>
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
	function goAddressRegiConfirmAction() {
		document.getElementById("form-action").action = "AddressRegiConfirmAction";
	}
</script>

</head>


<body>
	<jsp:include page="includeHeader.jsp" />

	<div id="main">
		<div id="form">

			<div class="title addressreg">
				<div class="titlefont">
					<h1>ADDRESS<br>
						CREATE</h1>
					<p class="titlefont">宛先情報登録</p>
				</div>
			</div>
			<div class="contents">

				<div class="error-color">
					<span class="test"><s:if test="addressList != null">宛先が登録されていないため、</s:if></span>
				</div>

				<p class="bold">下記に必要事項を記入してください</p>

				<s:form id="form-action">


					<!-- 姓 -->

					<div class="error-color">
						<s:property value="errorFamilyName" />
					</div>
					<div class="form-text">姓【半角英語、漢字、ひらがな】</div>
					<span><s:textfield placeholder="1文字以上16文字以下" size="20%"
							name="familyName" maxlength='16' value="%{familyName}" /></span>


					<!-- 名	-->

					<div class="error-color">
						<s:property value="errorFirstName" />
					</div>
					<div class="form-text">名【半角英数字、漢字、ひらがな】</div>
					<span><s:textfield placeholder="1文字以上16文字以下" size="20%"
							name="firstName" maxlength='16' value="%{firstName}" /></span>


					<!-- 姓仮名 -->

					<div class="error-color">
						<s:property value="errorFamilyNameKana" />
					</div>
					<div class="form-text">姓（かな）【ひらがな】</div>
					<span><s:textfield placeholder="1文字以上16文字以下" size="20%"
							name="familyNameKana" maxlength='16' value="%{familyNameKana}" /></span>

					<!-- 名仮名 -->

					<div class="error-color">
						<s:property value="errorFirstNameKana" />
					</div>
					<div class="form-text">名（かな）【ひらがな】</div>
					<span><s:textfield placeholder="1文字以上16文字以下" size="20%"
							name="firstNameKana" maxlength='16' value="%{firstNameKana}" /></span>

					<!-- 郵便番号 -->

					<div class="error-color">
						<s:property value="errorZip11" />
					</div>
					<div class="form-text">郵便番号【半角英数字】</div>
					<span><s:textfield placeholder="XXX-XXXX" name="zip11"
							size="20" maxlength='8' value="%{zip11}" /></span>


					<!-- 住所 -->

					<div class="error-color">
						<s:property value="errorAddr11" />
					</div>
					<div class="form-text">住所【半角英数字記号、漢字、ひらがな、カタカナ】</div>

					<span><s:textfield placeholder="15文字以上50文字以下" name="addr11"
							size="20%" maxlength='50' value="%{addr11}" /></span>


					<!-- 電話番号 -->

					<div class="error-color">
						<s:property value="errorTelNumber" />
					</div>
					<div class="form-text">電話番号【半角英数字】</div>

					<span><s:textfield placeholder="10文字以上13文字以下"
							name="telNumber" maxlength='13' value="%{telNumber}" /></span>


					<!-- メールアドレス -->

					<div class="error-color">
						<s:property value="errorEmail" />
					</div>
					<div class="form-text">メールアドレス【半角英数字 ＋ @ ＋ 「.」】</div>
					<span><s:textfield placeholder="14文字以上32文字以下" name="email"
							maxlength='32' value="%{email}" /></span>


					<!-- 送信ボタン -->

					<div class="button-center">
						<s:submit value="送信" class="button-layout" onclick="goAddressRegiConfirmAction()"/>
					</div>
				</s:form>
			</div>
		</div>
	</div>

	<jsp:include page="includeFooter.jsp" />
</body>
</html>