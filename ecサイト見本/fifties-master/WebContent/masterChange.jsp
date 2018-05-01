<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	<link rel="stylesheet" href="./css/masterChange.css">

<title>商品変更画面</title>



</head>
<body>
	<jsp:include page="masterHeader.jsp" />


<div id="main">

	<div id="top">
			<div id="title">
				<h1>商品情報変更画面</h1>
			</div>
		</div>
		<s:iterator value="errorMessageList">
			<p><span style="color: red"><s:property /></span></p>
		</s:iterator>



<div id="form">
		<s:form action="ProductChangeConfirmAction" method="post"
			enctype="multipart/form-data" name="itemInfo"
			onsubmit="return fileCheck();" >



				<input type="hidden" name="id"
			value="<s:property value="id"/>" />
				<s:hidden name="itemId" value="%{product_id}" />
				<s:hidden name="itemName" value="%{product_name}" />
				<s:hidden name="itemKanaName" value="%{product_name_kana}" />



					<p class="product">商品番号</p>
					<p><s:textfield name="product_id" value="%{product_id}"
							onKeyup="this.value=this.value.replace(/[^0-9]+/i,'')"  required=""/></p>



					<p class="product">商品名</p>
					<p><s:textfield name="product_name" value="%{product_name}"  required="" />
					</p>


					<p class="product">商品名（ひらがな）</p>
					<p><s:textfield name="product_name_kana"
							value="%{product_name_kana}"  required="" /></p>


					<p class="product">商品カテゴリー</p>
					<p><select name="category">
							<option value="1" selected="selected">車</option>
							<option value="2">音楽・映画</option>
							<option value="3">家電</option>
					</select>



					<p class="product">価格</p>
					<p><s:textfield name="price" value="%{price}"
							onKeyup="this.value=this.value.replace(/[^0-9]+/i,'')" /></p>


					<p class="product">個数</p>
					<p><select name="product_stock">
							<s:iterator status="st" begin="1" end="100">
								<option value='<s:property value="#st.count"/>' />
								<s:property value="#st.count" />
							</s:iterator>
						</select>
					</p>


					<p class="product">画像名</p>
					<p><s:textfield name="image_file_name"
							value="%{image_file_name} " /></p>


					<p class="product">画像</p>
					<p><input class ="button"  type="file" accept='image/*'  name="file"  required /></p>



					<p class="product">会社名</p>
					<p><s:textfield name="release_company"
							value="%{release_company}" /></p>


					<p class="product">商品詳細</p>
					<p><s:textfield name="product_description"
							value="%{product_description}" /></p>


			<s:submit class="button" value="変更確認" />
		</s:form>
</div>

</div>




	<jsp:include page="includeFooter.jsp" />
</body>
</html>