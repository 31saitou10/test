<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
      <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
      <meta http-equiv="Content-Style-Type" content="text/css" />
      <link rel="stylesheet" type="text/css" href="./css/myPage.css">
      <title>myPage</title>

</head>

  <body>

  <!-- ヘッダー -->
   <jsp:include page="include_header.jsp" />

<div class="main">

<div class="back"></div><!--背景色に使いたいだけの要素-->

<div class="container">

<div class="box-colum clearfix">
<div class="box-column float-left w66">


<h2 class="heading">会員情報</h2>
<p></p>

<table class="table">
<tbody>

<s:iterator value="myPageList">

<tr>
<th>名前</th>
<td>
 <s:property value="familyName"/><s:property value="firstName"/>
</td>
</tr>

<tr>
 <th>ふりがな</th>
 <td>
 <s:property value="familyNameKana"/><s:property value="firstNameKana"/>
</td>
</tr>

<tr>
<th>性別</th>
 <td>
 <s:if test="sex==0">男性</s:if>
 <s:else>女性</s:else>
</td>
</tr>

<tr>
<th>E-mail</th>
<td>
<s:property value="email"/>
</td>
</tr>

<tr>
<th>ユーザーID</th>
<td>
<s:property value="userId"/>
</td>
</tr>

<tr>
<th>パスワード</th>
<td>
<s:property value="password"/>
</td>
</tr>

</s:iterator>

</tbody>
</table>

</div>
</div>


<div class="container2">
  <a href='<s:url action="BuyItemHistoryAction"/>'>
   <s:submit class="historybtn" value="購入履歴へ">
   </s:submit>
  </a>
</div>

</div>
</div>

<!-- フッター -->
<jsp:include page="include_footer.jsp" />

</body>
</html>