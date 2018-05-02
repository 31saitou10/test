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
	  <link rel="stylesheet" type="text/css" href="./css/paymentComplete.css">
      <title>購入完了</title>

</head>
<body>
<header>
		<jsp:include page="include_header.jsp" flush="true" />
	</header>


	<div id="main">

	<div id="haikei">

			<p>お買い上げありがとうございました。</p>
			<p>
				購入手続きが完了致しました。 <br> またのご利用お待ちしております。<br>購入履歴はマイページで確認できます。
			<p>
			<div class="button_wrapper">
					<s:form action="MyPageAction">
						<s:submit class="button" value="マイページ" />
					</s:form>
			</div>
			<div class="button_wrapper">
					<s:form action="LogoutAction">
						<s:submit class="button" value="ログアウト" />
					</s:form>
			</div>
			<div class="button_wrapper">
					<s:form action="GoHomeAction">
						<s:submit class="button" value="ホーム" />
					</s:form>
			</div>
			</div>
		</div>
	<footer>
		<jsp:include page="include_footer.jsp" flush="true" />
	</footer>

</body>
</html>