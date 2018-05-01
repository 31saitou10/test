<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/fifties.css" />
<link rel="stylesheet" href="./css/reviewconfirm.css" />
<title>レビュー確認画面</title>
<script type="text/javascript">
	function goCreateReviewAction() {
		document.getElementById("form").action = "CreateReviewAction";
	}
	function goCreateReviewCompleteAction() {
		document.getElementById("form").action = "CreateReviewCompleteAction";
	}
</script>
</head>
<body>
	<jsp:include page="includeHeader.jsp" />
	<div class="main">
		<div class="form">

			<div class="form-heading">
				<h1>REVIEW FORM</h1>
				<p>確認画面</p>
			</div>

			<div class="form-main">

				<img src='<s:property value="imageFilePath"/>'>
				<h2><s:property value="productName" /></h2>

				<h3>投稿内容は以下の情報でよろしいでしょうか？</h3>
				<s:form name="form" id="form">

					<s:if test="session.r_score==1">
						<span class="star-yellow">★</span>
						<span class="star-gray">★★★★</span>
					</s:if>
					<s:elseif test="session.r_score==2">
						<span class="star-yellow">★★</span>
						<span class="star-gray">★★★</span>
					</s:elseif>
					<s:elseif test="session.r_score==3">
						<span class="star-yellow">★★★</span>
						<span class="star-gray">★★</span>
					</s:elseif>
					<s:elseif test="session.r_score==4">
						<span class="star-yellow">★★★★</span>
						<span class="star-gray">★</span>
					</s:elseif>
					<s:else>
						<span class="star-yellow">★★★★★</span>
					</s:else>
					<div class="container">
						<p>タイトル</p>
						<p><s:property value="session.r_title" /></p>
						<p>レビュー</p>
						<p><s:property value="session.r_body" /></p>
					</div>


					<s:hidden name="productId" value="%{productId}" />
					<input type="hidden" name="reviewTitle" value='<s:property value="%{session.r_title}"/>'>
					<input type="hidden" name="reviewBody" value='<s:property value="%{session.r_body}"/>'>
					<input type="hidden" name="reviewScore" value='<s:property value="%{session.r_score}"/>'>
					<input type="hidden" name="imageFilePath" value='<s:property value="imageFilePath"/>' />
					<input type="hidden" name="productName" value='<s:property value="productName"/>' />

					<s:submit class="button-layout" value="修正する" onclick="goCreateReviewAction()" />
					<s:submit class="button-layout" value="投稿する" onclick="goCreateReviewCompleteAction()" />

				</s:form>

			</div>

		</div>
	</div>

	<jsp:include page="includeFooter.jsp" />
</body>
</html>