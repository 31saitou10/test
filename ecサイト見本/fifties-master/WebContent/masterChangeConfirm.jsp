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
<link rel="stylesheet" href="./css/fifties.css">
<link rel="stylesheet" href="./css/masterConfirm.css">
<title>完了画面</title>
<script>
function goMasterBackChangeAction() {
	document.getElementById("form").action = "MasterBackChangeAction"
}
function goProductChangeCompleteAction(){
	document.getElementById("form").action = "ProductChangeCompleteAction";
}
	</script>
</head>
<body>
	<jsp:include page="masterHeader.jsp" />

	<div id="main">

<div id="con">
	<s:form enctype="multipart/form-data" id="form">

	<h3>追加確認画面</h3>


		<h3>以下の商品を新しく追加します。よろしいですか？</h3>



		<label class="product">商品ID</label>
		<p>
			<s:property value="product_id" />
		</p>

		<label  class="product">商品名</label>
		<p>
			<s:property value="product_name" />
		</p>


		<label  class="product">商品名(ふりがな)</label>
	<p>
			<s:property value="product_name_kana" />
		</p>



		<label  class="product">商品カテゴリー</label>
		<p>
			<s:if test="category==1">
							<p>車</p>
						</s:if>
						<s:elseif test="category==2">
							<p>音楽・映画</p>
						</s:elseif>
						<s:elseif test="category==3">
							<p>家電</p>
						</s:elseif>
		</p>



		<label  class="product">価格</label>
		<p>
			¥
			<s:property value="price" />
		</p>


		<label  class="product">個数</label>
		<p>
			<s:property value="product_stock" />
			個
		</p>

		<label  class="product">画像名</label>
		<p>
			<s:property value="image_file_name" />

		</p>


		<label  class="product">画像</label>
		<p>
			<s:property value="imageFileName" />
		</p>

		<label  class="product">会社名</label>
		<p>
			<s:property value="release_company" />
		</p>


		<label  class="product">商品詳細</label>
		<p>
			<s:property value="product_description" />
		</p>




		<span >
			<s:submit class="button" value="訂正" onclick="goMasterBackChangeAction()" />
		</span>

		<span >
			<s:submit class="button" value="登録"  onclick="goProductChangeCompleteAction()"/>
		</span>


		<input type="hidden" name="id"
			value="<s:property value="id"/>" />
		<input type="hidden" name="category"
			value="<s:property value="category"/>" />
		<input type="hidden" name="product_description"
			value="<s:property value="product_description"/>" />
		<input type="hidden" name="product_id"
			value="<s:property value="product_id"/>" />
		<input type="hidden" name="product_name"
			value="<s:property value="product_name"/>" />
		<input type="hidden" name="product_name_kana"
			value="<s:property value="product_name_kana"/>" />
		<input type="hidden" name="product_stock"
			value="<s:property value="product_stock"/>" />
		<input type="hidden" name="price" value="<s:property value="price"/>" />
		<input type="hidden" name="image_file_name"
			value="<s:property value="image_file_name"/>" />
		<input type="hidden" name="imageFileName"
			value="<s:property value="imageFileName"/>" />
		<input type="hidden" name="release_company"
			value="<s:property value="release_company"/>" />

	</s:form>

</div>
		</div>


	<jsp:include page="includeFooter.jsp" />
</body>
</html>