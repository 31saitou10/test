<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/fifties.css"/>
<link href="https://fonts.googleapis.com/css?family=Pacifico" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,700" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=PT+Sans" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Cookie" rel="stylesheet">

<title>Home</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.arctext.js"></script>
<style type="text/css">

html,body{
  overflow: hidden
}

	body{
	text-align: center;
	color: white;
	}
	ul {
		margin: 0;
		padding: 0;
	}
	#main{
	    width:1600px;
	   	height: 100%;
		margin-top: 90px;
		margin:0 auto;
		text-align: center;
	}

	#slide {
	    position:relative;
	    margin:0;
	}
	#slide img {
	    position:absolute;
	    height: 100%;
	    left:0;
	    vertical-align: bottom;
	}


#scrn{
    position:absolute;
    width:100%;
    height:100%;
    top:90px;
  	background: linear-gradient( to right, #40e0d0, #ff8c00, #ff0080);
	z-index:1;
    filter:alpha(opacity=50);
   	-moz-opacity: 0.5;
   	opacity: 0.5;
   	mix-blend-mode: 	color-dodge;
    }

h3{
	position: absolute;
 	top: 150px;
  	right: 0;
  	bottom: 0;
  	left: 0;
  	margin: auto;
	z-index:1;
	opacity: 0.9;
}

.line-1{
 	font-family: 'Pacifico', cursive;
    position: absolute;
    font-style: normal;
    font-weight: normal;
    text-decoration: inherit;
    font-size: 40px;
}

.line-2{
	font-family: 'Roboto Slab', serif;
	top: 190px;
  	letter-spacing: 7px;
  	font-size: 130px;
}

.line-3{
	font-size:35px;
	top: 440px;
	font-family: 'PT Sans', sans-serif;
  	font-weight: 700;
  	letter-spacing: 4px;
    }

 .line-3::before{
    margin: 17px 0 0 -85px;
    content: " ";
    position: absolute;
    width: 70px;
    height: 5px;
    border-top: 3px solid white;
    border-bottom: 3px solid white;
    }
 .line-3::after{
    margin: 17px 0 0 10px;
    content: " ";
    position: absolute;
    width: 70px;
    height: 5px;
    border-top: 3px solid white;
    border-bottom: 3px solid white;
}

.line-4{
	font-family: 'Cookie', cursive;
	font-size: 33px;
	top:500px;
	font-style: oblique;
}


</style>

<script type="text/javascript">
jQuery(function($){
	// 設定
	var $width =1600; // 横幅
	var $height = $("#main").height();  // 高さ
	var $interval = 5000; // 切り替わりの間隔（ミリ秒）
	var $fade_speed = 1000; // フェード処理の早さ（ミリ秒）
	$("#slide ul li").css({"position":"relative","overflow":"hidden","width":$width,"height":$height});
	$("#slide ul li").hide().css({"position":"absolute","top":0,"left":0});
	$("#slide ul li:first").addClass("active").show();
	setInterval(function(){
	var $active = $("#slide ul li.active");
	var $next = $active.next("li").length?$active.next("li"):$("#slide ul li:first");
	$active.fadeOut($fade_speed).removeClass("active");
	$next.fadeIn($fade_speed).addClass("active");
	},$interval);

	 $(".line-2").arctext({"radius": 400});
});
</script>
<style type="text/css">
	footer {
		position: fixed;
		bottom: 0;
	}
</style>
</head>
<body>

<jsp:include page="includeHeader.jsp"/>
<div id="scrn"></div>
 <div id="main">
 		<h3 class="line-1">★      the      ★</h3>
 		<h3 class="line-2">FIFTIES</h3>
 		<h3 class="line-3">AMERICAN VINTAGE SHOP</h3>
 		<h3 class="line-4">～　Since 2018　～</h3>

        <div id="slide">
            <ul>
                <li><a href=""><img src="./images/top_01.jpg" alt="" width="1600"  /></a></li>
                <li><a href=""><img src="./images/top_02.jpg" alt="" width="1600"  /></a></li>
                <li><a href=""><img src="./images/top_03.jpg" alt="" width="1600"  /></a></li>
            </ul>
        </div>
</div>

<jsp:include page="includeFooter.jsp"/>


</body>
</html>