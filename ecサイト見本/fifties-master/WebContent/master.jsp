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
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<link rel="stylesheet" href="./css/master.css">

<title>管理画面</title>

</head>
<body>

	<jsp:include page="masterHeader.jsp" />


	<div id="main">
		<div id="top">
			<div id="title">
				<h1>管理者画面</h1>
			</div>
		</div>




		<div id="left">

			<div id="error">
				<s:if test="errorMessage !=''">
					<s:property value="errorMessage" escape="false" />
				</s:if>
				<s:if test="dMessage !=''">
					<s:property value="dMessage" escape="false" />
				</s:if>
			</div>

			<!-- 商品一覧 -->
			<s:iterator value="productDTOList" status="st">
				<div id="box">
					<s:form action="MasterAction" method="post">


						<s:hidden value="%{product_id}" name="product_id" />
						<s:hidden value="%{product_name}" name="product_name" />
						<s:hidden value="%{product_name_kana}" name="product_name_kana" />
						<s:hidden value="%{id}" name="id" />
						<s:hidden value="%{price}" name="price" />
						<s:hidden value="%{image_file_name}" name="image_file_name" />
						<s:hidden value="%{release_company}" name="release_company" />
						<s:hidden value="%{product_description}"
							name="product_description" />


						<p>
							<span>商品番号:</span>
							<s:property value="product_id" />
						</p>

						<p>
							<img class="imageFileName"
								src="<s:property value="image_file_path"/>" alt="Photo"
								width="70%" height="170">
						</p>



						<h3>
							<s:property value="product_name" />
						</h3>

						<h5>
							<s:property value="product_name_kana" />
						</h5>

						<span>カテゴリー:</span>
						<s:if test="category_id==1">
							<span>車</span>
						</s:if>
						<s:elseif test="category_id==2">
							<span>音楽・映画</span>
						</s:elseif>
						<s:elseif test="category_id==3">
							<span>家電</span>
						</s:elseif>

						<p class="product">
							在庫数:
							<s:if test="product_stock==0">
								<span>品切れ</span>
							</s:if>
							<s:elseif test="product_stock>0">

								<span><s:property value="product_stock" /></span>

							</s:elseif>

							<p>&yen<s:property  value="price" /></p>
						<div class="stock">
							<p>
								<select name="stock"><s:iterator status="st" begin="1"
										end="100">
										<option value='<s:property value="#st.count"/>' />
										<s:property value="#st.count" />
									</s:iterator></select> <span>
									<button class="button" type='submit' name='stockFlg'>在庫変更</button>
								</span>
							</p>
						</div>


						<span>
							<button class="button" type='submit' name='deleteFlg'
								onclick='return confirm("削除してよろしいですか？")'>削除</button>
						</span>
						<span>
							<button class="button" type='submit' name='changeFlg'>商品情報変更</button>
						</span>



					</s:form>
				</div>
			</s:iterator>

		</div>






		<!-- 商品登録 -->

		<div id="right">

			<h4>追加したい商品情報を入力してください。</h4>

			<s:iterator value="errorMessageList">
				<p style="color: red">
					<s:property />
				</p>
			</s:iterator>


			<div id="change">

				<s:form action="MasterAddConfirmAction" method="post"
					enctype="multipart/form-data" name="itemInfo"
					onsubmit="return fileCheck();">

					<p class="name">
						<label>商品ID</label>
					</p>
					<p>


						<s:textfield class="field" name="productId" value="%{productId}"
							placeholder="半角数字"
							onKeyup="this.value=this.value.replace(/[^0-9]+/i,'')"   required="" />
					</p>

					<p class="name">
						<label>商品名</label>
					</p>
					<p>
						<s:textfield class="field" name="productName"
							value="%{productName}" placeholder="50文字以下で入力"  required="" />
					</p>




					<p class="name">
						<label>商品名(ひらがな,カナ)</label>
					</p>
					<p>
						<s:textfield class="field" name="productKanaName"
							value="%{productKanaName}" placeholder="80文字以下で入力"  required="" />
					</p>



					<p class="name">
						<label>商品カテゴリー</label>
					</p>
					<p>
						<select name="category">
							<option value="1" selected="selected">車</option>
							<option value="2">音楽・映画</option>
							<option value="3">家電</option>
						</select>
					</p>




					<p class="name">
						<label>価格</label>
					</p>
					<p>
						<s:textfield class="field" name="price" value="%{price}"
							placeholder="半角数字"
							onKeyup="this.value=this.value.replace(/[^0-9]+/i,'')" />
					</p>


					<p class="name">
						<label>個数</label>
					</p>
					<p>
						<select name="productStock">
							<s:iterator status="st" begin="1" end="100">
								<option value='<s:property value="#st.count"/>' />
								<s:property value="#st.count" />
							</s:iterator>
						</select>
					</p>





					<p class="name">
						<label>画像名</label>
					</p>
					<p>
						<s:textfield class="field" name="imageName" value="%{imageName}"
							placeholder="30文字以下で入力" />
					</p>


					<p class="name">画像</p>


					<input type="file" accept='image/*' name="file" id="file"  required/>


					<p class="name">

						<label>会社名</label>
					</p>
					<p>
						<s:textfield class="field" name="company" value="%{company}"
							placeholder="30文字以下で入力" />
					</p>

					<p class="name">
						<label>商品詳細</label>
					</p>
					<p>
						<s:textarea class="text" name="description" value="%{description}" />
					</p>

					<!-- 登録ボタン -->

					<input class="button" type="submit" value="登録確認">




				</s:form>

			</div>
		</div>
	</div>









	<jsp:include page="includeFooter.jsp" />
</body>
</html>

