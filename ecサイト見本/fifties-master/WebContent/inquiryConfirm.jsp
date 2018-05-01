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
<title>InquiryConfirm</title>

<!-- InquiryBackAction用script  -->
<script>
	function goInquiryBackAction(){
		document.getElementById("backaction").action = "InquiryBackAction";
	}
	function goInquiryCompleteAction(){
		document.getElementById("backaction").action = "InquiryCompleteAction";
	}
</script>
<!-- ここまで  -->

</head>
<body>
	<jsp:include page="includeHeader.jsp"/>

	<div id="main">
		<div id="form">
			<div class="title">
				<div class="titlefont">
					<h1>INQUIRY</h1>
					<p class="title">お問い合わせ確認</p>
				</div>
			</div>

			<div class="contents">
				<div class="form-text"><b>送信する内容は以下でよろしいでしょうか？</b></div>
					<s:form id="backaction" name="backaction" action="InquiryCompleteAction">
					<div class="form-text">お名前：</div>
					<s:property value="inquiryName" escape="true"/>
					<div class="form-text">メールアドレス</div>
					<s:property value="inquiryEmail" escape="true" />
					<div class="form-text">お問合わせの種類：</div>
					<s:property value="qtypeSelect" />
					<div class="form-text">お問い合わせ内容：</div>
					<s:property value="inquiryBody" escape="true" />


		<!-- ここからhidden  -->
				<input type="hidden" name="inquiryName" value='<s:property value="inquiryName" />'>
				<input type="hidden" name="inquiryEmail" value='<s:property value="inquiryEmail" />'>
				<input type="hidden" name="inquiryBody" value='<s:property value="inquiryBody"/>'>
		<!-- ここまでhidden -->

				<br>
				<div class="button-center">
				<s:submit class="button-layout long" value="戻って修正する" onclick="goInquiryBackAction();" /><br>
				<s:submit class="button-layout" value="送信する" onclick="goInquiryCompleteAction();" />
</div>
			</s:form>

				<p>ホームに戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a></p>
			</div>
		</div>
	</div>
	<jsp:include page="includeFooter.jsp"/>
</body>
</html>