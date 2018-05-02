<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
      <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
      <meta http-equiv="Content-Style-Type" content="text/css" />
      <meta http-equiv="Content-Script-Type" content="text/javascript" />
      <meta http-equiv="imagetoolbar" content="no" />
      <meta name="description" content="" />
      <meta name="keywords" content="" />
     <link href="https://fonts.googleapis.com/css?family=Noto+Serif" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="./css/error.css">

     <style>
@import url('https://fonts.googleapis.com/css?family=Noto+Serif');
</style>

<title>エラー</title>
</head>
<body>

<header>
		<jsp:include page="include_header.jsp" flush="true" />
	</header>


		<div id="haikei">
		<div id="top">
			エラーが発生しました。正常に処理が行われませんでした。<br>
			大変申し訳ございませんが、ホームより再度実行してください。
		</div>
		<div class="button_wrapper">
			<s:form action="GoHomeAction">
			<s:submit class="button" value="ホーム" />
		</s:form>
		</div>
		</div>


		<jsp:include page="include_footer.jsp" flush="true" />


</body>
</html>