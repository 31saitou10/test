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
<meta http-equiv="refresh" content="3;URL=GoMasterAction">
<title>完了画面</title>
<link rel="stylesheet" href="./css/fifties.css">
<link rel="stylesheet" href="./css/masterComplete.css">
<style type="text/css">
</style>
</head>
<body>
	<jsp:include page="masterHeader.jsp" />


			<div class="main">
		<div class="form">
			<div class="form-heading">
				<h2>【商品更新完了】</h2>
			</div>

				<h2>商品更新手続きが完了しました。</h2>
				<p>3秒後に自動的に管理者画面へ遷移します。</p>
				<p>ジャンプしない場合は、以下のリンクをクリックしてください。</p>
				<a href='<s:url action="GoMasterAction" />'>管理者画面へ</a>

			</div>
		</div>



			<jsp:include page="includeFooter.jsp" />

</body>
</html>