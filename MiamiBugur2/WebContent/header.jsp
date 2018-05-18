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
<link rel="stylesheet" type="text/css" href="">
<link rel="stylesheet" href="./css/miamiburger.css">
<title>ヘッダー</title>
<style type="text/css">
</style>
</head>
<body>
	<div class="header-contents">
		<a href="<s:url action="HomeAction"/>">Home</a> <a
			href="<s:url action="MyPageAction"/>">Mypage</a> <a
			href="<s:url action="CartAction"/>">Cart</a> <a
			href="<s:url action="ProductInfoAction"/>">Product</a> <a
			href="<s:url action="CreateBurgerAction"/>">CreateBurger</a> <a
			href="<s:url action="LoginAction"/>">Login</a> <a
			href="<s:url action="LogoutAction"/>">Logout</a> <a
			href="<s:url action="UserCreateAction"/>">UserCreate</a>
		<!-- ///////////////////////検索機能///////////////////////// -->
	</div>

	<div class="search">
		<s:form action="ProductInfoAction">

			<select name="categoryId">

				<s:iterator value = "#session.mCategoryDTOList">
					<s:if test ="categoryId < 5">
						<option value="<s:property value ='categoryId'/>"><s:property value ="categoryName"/></option>
					</s:if>
				</s:iterator>

			</select>

			<span>検索:</span>
			<input type="text" name="search" >
			<s:submit value="検索" />
		</s:form>
	</div>

	<!-- ///////////////////////ここまで///////////////////////// -->


</body>
</html>