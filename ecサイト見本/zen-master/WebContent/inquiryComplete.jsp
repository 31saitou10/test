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
    <link rel="stylesheet" type="text/css" href="./css/inquiryComplete.css">

     <style>
@import url('https://fonts.googleapis.com/css?family=Noto+Serif');
</style>

<title>お問い合わせ完了</title>
</head>
<body>

<header>
		<jsp:include page="include_header.jsp" flush="true" />
	</header>

	<div id="main">

		<div id="haikei">
		<div id="top">
			以下の内容で送信が完了致しました。<br>
			三営業日以内に担当よりご連絡致します。<br>四日以上連絡がない場合は申し訳ございませんが、
			<br>改めて送信くださいますようお願い申し上げます。
		</div>
		<div>
			<table class="table">
            	<tbody>
				<tr>
						<th>お名前</th>
					<td>
						<s:property value="name"/>
					</td>
				</tr>
				<tr>
						<th>メールアドレス</th>
					<td>
					<s:property value="mailaddress"/>
					</td>
				</tr>
				<tr>
						<th>お問い合わせの種類</th>
					<td>
						<s:property value="qtype"/>
					</td>
				</tr>
				<tr>
						<th>内容</th>
					<td>
						<s:property value="body"/>
					</td>
				</tr>

			</table>

			<div class="back">
				<p>Homeへ戻る場合は
				<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
			</div>
			</div>
		</div>
	</div>

	<footer>
		<jsp:include page="include_footer.jsp" flush="true" />
	</footer>

</body>
</html>