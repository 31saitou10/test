<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta http-equiv="refresh" content="3;URL=StartAction">
<title>エラー</title>
<style type="text/css">
		h1, p {
			margin: 0;
		}
		.main {
			margin: 0;
			width: 60%;
			height: 100%;
			margin:0 auto;
			text-align: center;
			background: rgba(255,255,255,0.7);
			position: relative;
		}

		.error {
			position: absolute;
			top: 0;
			right: 0;
			bottom: 0;
			left: 0;
			margin: auto;
			width: 80%;
			height: 50%;
		}

		</style>
</head>
<body>


<div class="main">
	<div class="error">
		<h1>エラーが発生しました。3秒後にホームページに戻ります。</h1>
		<p>ジャンプしない場合は、以下のリンクをクリックしてください。</p>
		<a href='<s:url action="StartAction" />'>ホーム画面へ</a>
	</div>
	</div>

</body>
</html>