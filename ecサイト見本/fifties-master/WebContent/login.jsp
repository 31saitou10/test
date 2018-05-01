<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/fifties.css">
<link rel="stylesheet" href="./css/login.css">
<title>ログイン画面</title>
</head>
<body>

	<jsp:include page="includeHeader.jsp"/>

	<div class="main">
	    <div class="form">

	        <div class="form-heading">
	          <h1>LOGIN</h1>
	          <p>ログイン</p>
	        </div>

            <div class="form-main">


              <s:form action="LoginAction">
				　<p class="error"><s:property value="idErrorMessage" /></p>
                  <p><label>ログインID</label></p>
                  <s:textfield class="form-parts login-id" name="userId" value="%{#session.saveId}" />
                  <p class="error">
	                  <s:property value="passwordErrorMessage"/>
	                  <s:property value="errorMessage" />
                  </p>

                  <p><label>パスワード</label></p>
                  <s:password  class="form-parts" name="password" />
                  <br>
                  <s:if test ="%{#session.saveId != null}">
                      <span class="checkbox"><s:checkbox name ="saveIdFlg" checked ="checked"/><label>ID保存</label></span>
                  </s:if>
                  <s:else>
                      <p class="checkbox"><label>ログインID保存</label><s:checkbox name ="saveIdFlg"/></p>
                  </s:else>
				  <s:submit class="button-layout" value="ログイン"/>

				<!-- トークン -->
				<s:token />
              </s:form>
              <div class="link">
                  <p>新規ユーザー登録は<a href='<s:url action="UserCreateAction"/>'>こちら</a></p>
	              <p>パスワードを忘れた方は<a href='<s:url action="ChangePasswordAction"/>'>こちら</a></p>
              </div>

            </div>
        </div>
	</div>

	<jsp:include page="includeFooter.jsp"/>

</body>
</html>
