<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
      <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
      <meta http-equiv="Content-Style-Type" content="text/css" />
      <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
      <script type="text/javascript" src="js/jquery.jInvertScroll.js"></script>
      <script type="text/javascript" src="./js/script.js"></script>
      <link rel="stylesheet" type="text/css" href="./css/home.css">
      <title>HOME</title>
</head>
  <body>


<!--Header共通-->
  <header class="header-wrapper">

  <div class="icon" style="height:0px;">
   <a href='<s:url action="GoHomeAction"/>'><img src="./images/iconzen.gif" style="width:90px; height:85px;"></a>
  </div>

   <div class="search">
    <s:form action="ProductSearchAction" method="post" id="form1">

     <div class="search1">
     <label>
     <select name="category" class="select1">
			<option value="">カテゴリ選択</option>
			<option value="全商品">全商品</option>
			<option value="焼酎">焼酎</option>
			<option value="日本酒">日本酒</option>
			<option value="ウィスキー">ウィスキー</option>
			<option value="ワイン">ワイン</option>
	</select>
	</label>
	 </div>

     <div class="search2">
     <input class="box1"  type="search" name="searchWord" placeholder="商品名を入れてください" autofocus>
     </div>

   <div class="search3">
      <input type="image" width="13%" height="35px" src="./images/search1.png">
     </div>
    </s:form>

   </div>

 <ul>
     <li><s:if test="#session.loginFlg">
		ようこそ! <s:property value="#session.loginFirstName"/>さん
	</s:if><s:else>
        ようこそ!ゲストさん
	</s:else></li>
     <li><a href='<s:url action="ProductListAction"/>'>商品一覧</a></li>
     <li><a href='<s:url action="CartAction"/>'>カート</a></li>
     <s:if test="#session.loginFlg">
     <li><a href='<s:url action="MyPageAction"/>'>マイページ</a></li>
     <li><a href='<s:url action="LogoutAction"/>'>ログアウト</a></li>
     </s:if>

     <li><s:if test="#session.loginFlg">
         </s:if>
         <s:else><a href='<s:url action="GoLoginAction"/>'>ログイン</a></s:else></li>
   </ul>



  </header>
<!--共通-->






</body>
</html>