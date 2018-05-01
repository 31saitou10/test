<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<style>
header {
	width: 100%;
	height: 90px;
	color: white;
	font-size: 35px;
	font-family: Impact, arial black, Helvetica, sans-serif;
	background: #33170a;
	position: fixed;
	z-index: 5;
	min-width:1500px;
}

#headercontents {
	width: 80%;
	margin: 0 auto;
}

.logo {
	margin: 3px 15px;
	float: left;
	height: 90px;
}

.logo img {
	height: 84px;
	width: 160px;
}

.guest {
	font-size: 15px;
	line-height: 30px;
	margin: 0 0 0 10px;
	text-align: left;
}

.user{
	color: #dd99ff;
	font-size: 18px;
}

#header ul {
	display: flex;
	line-height: 60px;
	margin: 0;
	padding: 0;
}

#header ul li {
	float: left;
	margin-left: auto;
	padding: 0;
	list-style-type: none;
}

header.searth {
	float: left;
	margin-right: 10px;
}

header select {
	background-color: black;
	color: white;
	border: 1px solid white;
	font-size: 18px;
	border-radius: 5px;
}

.headerform {
	background-color: white;
	color: black;
	border: 1px solid white;
	font-size: 18px;
	border-radius: 5px;
}

.headersubmit {
	background-color: #00ced1;
	border: none;
	border: 1px solid white;
	color: white;
	border-radius: 5px;
	font-size: 18px;
}

#header a {
	text-decoration: none;
	color: #00ced1;

}

#header a:visited {
	color: #00ced1;
}

#header a:hover {
	text-decoration: underline;
}

#header ul li .inquirylogout{
	clear: both;
	font-weight: none;
	line-height: 25px;
	font-size: 15px;
}

#header ul li .inquirylogout a {
	text-decoration: none;
	color: white;
}

#header ul li .inquirylogout a:hover {
	text-decoration: underline;
}

</style>

<header>

	<div id="headercontents">

		<div class="logo">
			<a href='<s:url action="GoHomeAction"/>'><img
				src="./images/logo.png" /></a>
		</div>

		<p class="guest">
			<s:if test="#session.loginFlg">
					ようこそ！<span class="user"><s:property value="#session.userId" /></span>さん
			</s:if>
			<s:elseif test="#session.tempUserId">
					ようこそ！<span class="user">ゲスト</span>さん
			</s:elseif>
		</p>

		<div id="header">
			<ul>
				<li><a href='<s:url action="GoHomeAction"/>'>HOME</a></li>
				<li><a href='<s:url action="ProductSearchAction"/>'>PRODUCT</a></li>
				<li><a href='<s:url action="CartAction"/>'>CART</a></li>
				<s:if test="#session.loginFlg">
					<li><a href='<s:url action="MyPageAction"/>'>MY PAGE</a></li>
				</s:if>

				<li class="searchlist"><s:form action="ProductSearchAction">
						<div>

<!-- 検索されたカテゴリを保持 -->
							<s:if test="category == null  || category == 0">
								<select class="search" name="category">
									<option value=0>AllCategory</option>
									<option value=1>車</option>
									<option value=2>音楽・映画</option>
									<option value=3>家電</option>
								</select>
							</s:if>

<!-- 車で検索 -->
							<s:if test="category == 1">
								<select class="search" name="category">
									<option value=0>AllCategory</option>
									<option value=1 selected>車</option>
									<option value=2>音楽・映画</option>
									<option value=3>家電</option>
								</select>
							</s:if>

<!-- 音楽 映画で検索 -->
							<s:if test="category == 2">
								<select class="search" name="category">
									<option value=0>AllCategory</option>
									<option value=1>車</option>
									<option value=2 selected>音楽・映画</option>
									<option value=3>家電</option>
								</select>
							</s:if>

							<!-- 家電で検索 -->
							<s:if test="category == 3">
								<select class="search" name="category">
									<option value=0>AllCategory</option>
									<option value=1>車</option>
									<option value=2>音楽・映画</option>
									<option value=3 selected>家電</option>
								</select>
							</s:if>

							<input type="text" class="search headerform" name="searchWord"
								value="<s:property value="searchWord"/>" />
							<s:submit class="headersubmit search" value="検索" />
						</div>
					</s:form></li>


				<li>
					<div class="inquirylogout">
						<a href='<s:url action="InquiryAction"/>'>お問合わせ</a><br>
						<s:if test="#session.loginFlg">
							<a href='<s:url action="LogoutAction"/>'>ログアウト</a>
						</s:if>
						<s:else>
							<a href='<s:url action="GoLoginAction"/>'>ログイン</a>
						</s:else>
					</div>
				</li>
			</ul>
		</div>
	</div>
</header>