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
	  <link rel="stylesheet" type="text/css" href="./css/inquiry.css">
      <title>お問い合わせ</title>

</head>
<body>
<header>
		<jsp:include page="include_header.jsp" flush="true" />
	</header>


	<div id="haikei">


		<div id="top">
			<h3>お問い合わせ・リクエスト</h3>
		</div>



			<s:form method="post" action="InquiryCompleteAction">
        <table class="table">
            <tbody>
			<tr>
                <th>お名前</th>
                <td><input type="text" size="40" name="name" placeholder="255文字以下でご入力ください" value='<s:property value="name"/>'/><br>
					<span style="color: #ff0000; font-weight: bold; font-size:12px;"><s:property value="errorName" /><s:property value="errorOverName" /></span>

                </td>
            </tr>
			<tr>
                <th>メールアドレス</th>
                <td><input type="text" size="40" name="mailaddress" placeholder="半角@を含む英数字でご入力ください" value='<s:property value="mailaddress"/>'/><br>
					 <span style="color: #ff0000; font-weight: bold; font-size:12px;"><s:property value="errorMailaddress" /><s:property value="errorOverMailaddress" /><s:property value="errorEmail" /></span>

                </td>
            </tr>
            <tr>
			     <th>お問い合わせの種類</th>
                 <td><select name="qtype">
								<option value="商品について">商品について</option>
								<option value="商品リクエスト">商品リクエスト</option>
								<option value="その他">その他</option>
								</select></td>
            </tr>
            <tr>
                <th>お問い合わせ内容</th>
			     <td><s:textarea name="body" placeholder="255文字以下でご入力ください" wrap="hard" cols="40" rows="10"/><br>
					<span style="color: #ff0000; font-weight: bold; font-size:12px;"><s:property value="errorBody" /><s:property value="errorOverBody" /></span>
			</td>
            </tr>
             </tbody>
             </table>
            <div class="text-center">
	           <s:submit class="button" value="送信"/>
                </div>
            </s:form>
            <div class="back">
					<p>Homeへ戻る場合は
				<a href='<s:url action="GoHomeAction"/>'>こちら</a></p></div>
            </div>






	<footer>
		<jsp:include page="include_footer.jsp" flush="true" />
	</footer>
</body>
</html>