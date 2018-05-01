<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="./css/masterInquiry.css">

<title>問い合わせ管理画面</title>
  <script type="text/javascript">

       /* buttonのdisable属性を書き換える */
       function checkValue(check){
           var btn = document.getElementById('btn');

           if (check.checked) {
               btn.value = '削除';
               btn.removeAttribute('disabled');
           } else {
               btn.value = '削除';
               btn.setAttribute('disabled', 'disabled');
           }
       }
   </script>

</head>
<body>
	<jsp:include page="masterHeader.jsp" />



	<div id="main">
		<div id="top">
			<div id="title">
				<h1>管理者画面</h1>
			</div>
		</div>

<div id="contents">
	<div id="message">
		<s:if test="inquiryDTOList.size() == 0">
			<h2>お問い合わせはありません。</h2>
		</s:if>
			</div>

		<s:else>
		<div class="error">
			<s:if test="errorMessag !=''">
				<s:property value="errorMessage" escape="false" />
			</s:if>
			</div>
			<s:form action="MasterInquiryCompleteAction">

			<h1>▼お問い合わせ履歴▼</h1>
		<div class="table">

				<table class="table" border="1"  style="table-layout:fixed;">

				<tr>
				<td  class="td" width="30">チェック </td>
				<td class="td">名前</td>
				<td class="td">メールアドレス</td>
				<td class="td">お問い合わせの種類</td>
				<td class="td">お問い合わせ内容</td>
				<td class="td">お問い合わせ送信時間</td>
				</tr>


				<s:iterator value="inquiryDTOList" status="st">
					<tr>
					<td class="td">
						<s:checkbox name="checkList" fieldValue="%{id}" onclick="checkValue(this)" />
					</td>
					<td class="td">
						<s:property value="name" />
					</td>
					<td class="td">
						<s:property value="email" />
					</td>
					<td class="td">
						<s:property value="inquiry_type" />
					</td>
					<td class="td">
						<s:property value="inquiry_body" />
					</td>
					<td class="td">
						<s:property value="insert_date" />
					</td>
				</s:iterator>
				</table>
				</div>
				<div class="button">
	<h2>選択したお問い合わせ履歴を削除します</h2>

	 <button id="btn" type="submit" value="削除" disabled="disabled"  onclick='return confirm("よろしいですか？")'>削除</button>
</div>
	</s:form>
	</s:else>
</div>
</div>
<div id="footer">

	<jsp:include page="includeFooter.jsp" />
	</div>
</body>
</html>