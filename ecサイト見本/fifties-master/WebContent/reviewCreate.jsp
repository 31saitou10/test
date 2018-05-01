<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="./css/fifties.css" />
<link rel="stylesheet" type="text/css" href="./css/review.css" />

<title>レビューフォーム画面</title>

</head>

<body>

	<jsp:include page="includeHeader.jsp" />

	<div class="main">
		<div class="form">

			<div class="form-heading">
				<h1>REVIEW FORM</h1>
				<p>レビューフォーム</p>
			</div>


			<div class="form-main">
				<img src='<s:property value="imageFilePath"/>'>
				<h2><s:property value="productName" /></h2>

				<s:form action="CreateReviewConfirmAction" name="form">

					<p class="error">
						<s:if test="errorScore != null">
							<s:property value="errorScore" />
						</s:if>
					</p>
					<div class="rating-star">
						<input id="star1" type="radio" name="reviewScore" value="5" /> <label
							for="star1">★</label> <input id="star2" type="radio"
							name="reviewScore" value="4" /> <label for="star2">★</label> <input
							id="star3" type="radio" name="reviewScore" value="3" /> <label
							for="star3">★</label> <input id="star4" type="radio"
							name="reviewScore" value="2" /> <label for="star4">★</label> <input
							id="star5" type="radio" name="reviewScore" value="1" /> <label
							for="star5">★</label>
					</div>

					<div class="container">
						<p class="error">
							<s:if test="errorTitle != null">
								<s:property value="errorTitle" />
							</s:if>
						</p>
						<p id="title-form">
							<input id="title" type="text" name="reviewTitle" size="35" value='<s:property value="reviewTitle" />' maxlength="15"  placeholder="レビュータイトル 15文字以内 " />
							<span class="label">残り<span id="title-label"></span>文字</span>
						</p>

						<p class="error">
							<s:if test="errorBody != null">
								<s:property value="errorBody" />
							</s:if>
						</p>
						<textarea id="comment" cols="35" rows="7" name="reviewBody" maxlength="250"  placeholder="ここに商品のレビューを記入&#13;&#10;250文字以内"><s:property value="reviewBody" /></textarea>
						<p class="label">残り<span id="comment-label"></span>文字</p>
					</div>


					<input type="hidden" name="productId" value='<s:property value="productId"/>' />
					<input type="hidden" name="imageFilePath" value='<s:property value="imageFilePath"/>' />
					<input type="hidden" name="productName" value='<s:property value="productName"/>' />
					<s:submit class="button-layout" value="確認へ" />

				</s:form>
			</div>

			<div class="link">
				<a href='<s:url action="PurchaseHistoryAction" />'>購入履歴へ戻る</a>
			</div>
		</div>
	</div>

	<jsp:include page="includeFooter.jsp" />

	<script>
		(function(){

			var title = document.getElementById('title');
			var titleLabel =document.getElementById('title-label');

			var titleLimit = 15;

			titleLabel.innerHTML = titleLimit;

			title.addEventListener('keyup', function() {
			  var titleRemaining = titleLimit - this.value.length;
			  if(titleRemaining < 0){
				  titleRemainig = 0;
			  }
			  titleLabel.innerHTML = titleRemaining;
			});

// 			レビュー文字数チェック
			var comment = document.getElementById('comment');
			var commentLabel = document.getElementById('comment-label');

			var commentLimit = 250;

			commentLabel.innerHTML = commentLimit;

			comment.addEventListener('keyup', function() {
			  var commentRemaining = commentLimit - this.value.length;
			  if(commentRemaining < 0){
				  titleRemainig = 0;
			  }
			  commentLabel.innerHTML = commentRemaining;
			});

		})();
	</script>

</body>
</html>