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
<title>確認画面</title>
<script>
function goMasterBackAction() {
	document.getElementById("form").action = "MasterBackAction"
}
function goMasterAddCompleteAction() {
	document.getElementById("form").action = "MasterAddCompleteAction";
}
	</script>
</head>
<body>
	<jsp:include page="masterHeader.jsp" />

		<div id="main">

		<h3> 追加確認画面 </h3>


			<h3>以下の商品を新しく追加します。よろしいですか？</h3>



				<s:form ENCTYPE="multipart/form-data"  id="form">


						<p><label>商品ID</label>
						<p><s:property value="productId" /></p>



						<label>商品名</label>
						<p><s:property value="productName" /></p>


						<label>商品名(ふりがな)</label>
						<p><s:property value="productKanaName" /></p>



						<label>商品カテゴリー</label>

						<p>
						<s:if test="category==1">
							<p>車</p>
						</s:if>
						<s:elseif test="category==2">
							<p>音楽・映画</p>
						</s:elseif>
						<s:elseif test="category==3">
							<p>家電</p>
						</s:elseif></p>



						<label>価格</label>
						<p>¥ <s:property value="price" /></p>



						<label>個数</label>
						<p><s:property value="productStock" />個</p>


						<label>画像名</label>
						<p><s:property value="imageName" />個</p>


						<label>画像</label>

						<p><s:property value="imageFileName" /></p>


						<label>会社名</label>
						<p><s:property value="company" /></p>


						<label>商品詳細</label>
						<p><s:property value="description" /></p>





			<input type="hidden" name="id" value="<s:property value="id"/>" />
			<input type="hidden" name="category" value="<s:property value="category"/>" />
			<input type="hidden" name="description" value="<s:property value="description"/>" />
			<input type="hidden" name="productId" value="<s:property value="productId" />" />
			<input type="hidden" name="productName" value="<s:property value="productName"/>" />
			<input type="hidden" name="productKanaName" value="<s:property value="productKanaName"/>" />
			<input type="hidden" name="productStock" value="<s:property value="productStock"/>" />
			<input type="hidden" name="price" value="<s:property value="price"/>" />
			<input type="hidden" name="imageName"
				value="<s:property value="imageName"/>" />
			<input type="hidden" name="imageFileName"
				value="<s:property value="imageFileName"/>" />
			<input type="hidden" name="company"
				value="<s:property value="company"/>" />

			<span>
			<s:submit class="button" value="訂正" onclick="goMasterBackAction();" />
			</span>
			<span>
				<s:submit class="button" value="登録"  onclick="goMasterAddCompleteAction();"/>

			</span>

		</s:form>


		</div>

	<jsp:include page="includeFooter.jsp" />
</body>
</html>
