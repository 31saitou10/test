<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta charset="utf-8">
	<title>UserCreate画面</title>

</head>
<body>
    <h2>ユーザー登録</h2>
	<p>情報を入力してください</p>

	<s:form action="UserCreateConfirmAction">

			   <div class="form-text">ユーザーID</div>
			   <span> <input type="text" name="userId" placeholder=" 半角英数字 " maxlength="8"
				 value='<s:property value="userId" />' />※8文字以内</span>

			   <div class="form-text">パスワード</div>
			   <span><input type="password" name="password"
				 placeholder=" 半角英数字 " maxlength="16" />※16文字以内</span>

				 <td>
			   <div class="form-text">パスワード確認用</div>
			   <span><input type="password" name="checkLoginId"
			    placeholder=" 半角英数字 " maxlength="16" />※16文字以内</span>

			   <div class="form-text">名前（姓）</div>
			   <span><input type="text" name="familyName" placeholder=" 漢字,ひらがな,半角英字 "
				 maxlength="16" value='<s:property value="familyName"/>' />※16文字以内 </span>

			   <div class="form-text">名前（名）</div>
			   <span><input type="text" name="firstName" placeholder=" 漢字,ひらがな,半角英字 "
				 maxlength="16" value='<s:property value="firstName"/>' />※16文字以内 </span>

			   <div class="form-text">ふりがな（姓）</div>
			   <span><input type="text" name="familyNameKana"
				 placeholder=" ひらがな" maxlength="16" value='<s:property value="familyNameKana"/>' />※16文字以内</span>

			   <div class="form-text">ふりがな（名）</div>
			   <span><input type="text" name="firstNameKana" maxlength="16"
				 placeholder=" ひらがな" value='<s:property value="firstNameKana"/>' />※16文字以内</span>

			   <div class="form-text">性別</div>
				 <input type="radio" name="sex" value="男" checked="checked">男
				 <input type="radio" name="sex" value="女">女

			   <div class="form-text">メールアドレス</div>
			   <span><input type="text" name="email"  placeholder=" 半角英数字,記号 " maxlength="32"
				 value='<s:property value="email"/>' />※14文字～32文字</span>


			   <div class="form-text">秘密の質問</div>
			   <s:if test="secretQuestion==1">
			    <select name="secretQuestion" class="form">
				  <option value="">選択してください</option>
				  <option value="1" selected>好きな食べ物</option>
				  <option value="2">好きな動物</option>
			    </select>
			  </s:if>

			  <s:elseif test="secretQuestion==2">
			    <select name="secretQuestion" class="form">
				  <option value="">選択してください</option>
				  <option value="1">好きな食べ物</option>
				  <option value="2" selected>好きな動物</option>
			    </select>
			  </s:elseif>

			  <s:else>
			    <select name="secretQuestion" class="form">
				  <option value="">選択してください</option>
				  <option value="1">好きな食べ物</option>
				  <option value="2">好きな動物</option>
			    </select>
			  </s:else>

			<div class="form-text">答え</div>
			<span> <input type="text" name="secretAnswer" maxlength="10"
			  value='<s:property value="secretAnswer" />' />※10文字以内</span>


	 <s:submit value="登録確認" />

</s:form>
</body>



</head>
<body>

</body>
</html>