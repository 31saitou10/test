<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<style>
header {
margin-top:0 auto;
	width: 100%;
	height: 90px;
	color: white;
	font-size: 100px auto;
	font-family: Impact, arial black, Helvetica, sans-serif;
	background: #33170a;
	padding:10px;
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



.header ul {

	float: left;
	margin: 0 auto;
	list-style-type: none;
	line-heght: 50px;
}

ul li {
	float: right;
	fomt-color: white;
	font-weight: bolder;
	margin: 35px 50px 0 50px;
	list-style-type: none;
}

.log ul li {
	cleate: left;
	float:rigth;
	color: white;
	font-weight: bolder;
	list-style-type: none;
	float: rigth;
	margin:0 auto;
	padding-right:20px;
	padding-top:20px;

}

}
header a {
	color: white;
	text-decoration: none;
}

header a:visited {
	color:white;
}

header a:hover {
	text-decoration: underline;
}
</style>

<div class="logo">
	<a href='<s:url action="LogoutAction"/>'><img
		src="./images/logo.png" /></a>
</div>
<header>





	<div class="header">
		<ul>
			<li><a href='<s:url action="MasterInquiryAction"/>'>問い合わせ管理</a></li>
			<li><a href='<s:url action="GoMasterAction"/>'>管理者画面TOP</a></li>

		</ul>
	</div>
	<div class="log">
		<ul>
			<li><a href='<s:url action="LogoutAction"/>'>ログアウト</a></li>
		</ul>
	</div>

</header>