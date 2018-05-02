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
<link rel="stylesheet" type="text/css" href="./css/buyItemHistory.css">

<title>購入履歴</title>

</head>
<body>
	<!--全ページ共通-->


	<jsp:include page="include_header.jsp" />



	<div id="main">
		<div class="top">


			<s:if test="!buyItemHistoryList.isEmpty()">


				<h3>ご購入情報は以下になります。</h3>




			</s:if>
				</div>
			<s:else>

				<h2>購入履歴は存在しません</h2>



			</s:else>











		<br> <br> <br>




		<s:iterator value="buyItemHistoryList">


			<div class="box">

				<div class="image">


					<img src="<s:property value='image_file_path'/>" alt="Photo"
						width="200" height="200">


				</div>


				<div class="moji">

					<ul>


						<li><s:property value="product_name" />
						<li><s:property value="product_namekana" />
						<li><s:property value="price" />円
						<li><s:property value="product_count" />個
						<li><s:property value="release_company" />販売店
						<li><s:property value="regist_date" />
					</ul>



				</div>
			</div>


		</s:iterator>




<s:if test="!buyItemHistoryList.isEmpty()">


	<s:form action="BuyItemHistoryAction">


						<input type="hidden" name="deleteFlg" value="1">



						<s:submit class="button" value="削除" method="delete" />



				</s:form>

</s:if>





		<div class="message">

			<s:if test="message != null">

				<h3>
					<s:property value="message" />
				</h3>

			</s:if>

		</div>





		<div class="abc"></div>

	</div>



	<jsp:include page="include_footer.jsp" flush="true" />

</body>

</html>
