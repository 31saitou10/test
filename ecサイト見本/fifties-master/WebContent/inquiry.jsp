<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="">
<meta name="keywords" content="" />
<link rel="stylesheet" href="./css/fifties.css">
<link rel="stylesheet" href="./css/userAdd.css">
<title>Inquiry</title>

<!-- InquiryBackAction用script  -->
<script>
	function goInquiryBackAction() {
		document.getElementById("backaction").action = "InquiryBackAction";
	}
	function goInquiryCompleteAction() {
		document.getElementById("backaction").action = "InquiryCompleteAction";
	}
</script>
<!-- ここまで  -->

</head>

<body>

	<jsp:include page="includeHeader.jsp" />
	<div id="main">
		<div id="form">
			<div class="title">
				<div class="titlefont">
					<h1>INQUIRY</h1>
					<p class="title">お問い合わせフォーム</p>
				</div>
			</div>

			<!-- 	<h3>お問合わせフォーム</h3> -->

			<div class="contents">
				<p>
					<s:if test="errorMessage!=null">
						<s:property value="errorMessage" />
					</s:if>
				</p>


				<p>項目は全て必須です。</p>

				<s:form method="post" name="backaction"
					action="InquiryConfirmAction">

					<!-- お名前 -->

					<p>
						<s:if test="errorName!=null">
							<div class="error-color">
								<s:property value="errorName" />
							</div>
						</s:if>
					</p>

					<div class="form-text">お名前</div>
					<span> <input type="text" name="inquiryName"
						value='<s:property value="inquiryName"     />'/><span>※20文字以内</span>
					</span>


					<!-- メール -->

					<p>
						<s:if test="errorEmail!=null">
							<div class="error-color">
								<s:property value="errorEmail"/>
							</div>
						</s:if>
					</p>

					<div class="form-text">メールアドレス</div>
					<span> <input type="text" name="inquiryEmail" size="35"
						value='<s:property value="inquiryEmail"/>'/>
					</span>


					<!-- お問い合わせの種類 -->

					<div class="form-text">お問合わせの種類</div>
							<div id="selectWrap">
								<select name="qtype" class="select">
										<option value="company" selected="selected">THE FIFTIESについて</option>
										<option value="product">製品について</option>
										<option value="support">アフターサポートについて</option>
										<option value="other">その他お問合わせ</option>
								</select>
							</div>


					<!-- お問い合わせ内容 -->

					<p>
						<s:if test="errorBody!=null">
							<div class="error-color">
								<s:property value="errorBody" />
							</div>
						</s:if>
					<p>

					<div class="form-text">お問合わせ内容</div>
					<textarea name="inquiryBody" rows="7" cols="35"><s:property
							value="inquiryBody" /></textarea>
					<span>※250文字以内</span>

					<div class="button-center">
						<s:submit class="button-layout" value="確認へ" />
					</div>

				</s:form>
			</div>
		</div>
	</div>
	<jsp:include page="includeFooter.jsp" />
</body>
</html>