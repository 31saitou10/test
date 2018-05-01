<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="./css/fifties.css"/>
	<link href="https://fonts.googleapis.com/css?family=Pacifico" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,700" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=PT+Sans" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Cookie" rel="stylesheet">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script type="text/javascript" src="js/jquery.easing.js"></script>
	<script type="text/javascript" src="js/jquery.arctext.js"></script>
	<meta http-equiv="refresh" content="3.5;URL='StartAction'" />
	<title></title>
<style type="text/css">
	html,body{
	  overflow: hidden;
	}

	body{
		text-align: center;
		color: white;

	}
	#main{
	    width:1600px;
	   	height: 100%;
		margin-top: 90px;
		margin:0 auto;
		text-align: center;
	}

	#back{
		position:absolute;
	    width:100%;
	    height:100%;
	    top:0px;
		margin: 0;
		z-index: 5;
		background: #33170a;

	}

	img{
	    position:absolute;
	    margin:-17px 0 0 0;
	    background-repeat: no-repeat;
	    height: 100%;
	    left:0;
	    vertical-align: bottom;
	}

	#scrn{
	    position:absolute;
	    width:100%;
	    height:100%;
	    top:0px;
	   	background: linear-gradient( to right, #40e0d0, #ff8c00, #ff0080);
	   	z-index:2;
	    filter:alpha(opacity=50);
	  	-moz-opacity: 0.5;
	   	opacity: 0.5;
	   	mix-blend-mode: color-dodge;
	    }

	h3{
		position: absolute;
	 	top: -150px;				/*文字のtopはアニメーション初期位置になります*/
	  	right: 0;
	  	bottom: 0;
	  	left: 0;
	  	margin: auto;
		z-index:5;
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
		top: -250px;
	  	letter-spacing: 7px;
	  	font-size: 130px;
	}

	.line-3{
		font-size:35px;
		top: -150px;
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
		top:-150px;
		font-style: oblique;
	}

	header {
	width: 100%;
	height: 90px;
	background: #33170a;
	position: fixed;
	z-index:5;

	}
	footer{
		position: fixed;
		width: 100%;
		height: 50px;
		z-index:5;
		background:#33170a;
		bottom: 0;
	}

	#skip a{
		z-index:6;
		font-size: 16px;
		position: fixed;
		bottom: 70px;
		right: 300px;
		color: white;
		text-decoration:none;
		color:white;
		border: 2px solid white;
		padding: 5px 20px;
		border-radius: 20px;

	}
	.productbox a:hover{
		text-decoration:underline;
		text-decoration-color: white;
	}


	</style>

	<script type="text/javascript">
		$(function(){
			$(".line-2").arctext({"radius": 400});
		});

		$(function(){
			setTimeout(function(){
			   var spd = 3000; //文字の移動速度
			   var eading = "easeOutElastic" //文字のイージングの種類

			   $(".line-1").animate({ // アニメーション後の位置
			      "top" : "150px"
			   }, spd, eading);

			   $(".line-2").animate({
			       "top" : "190px"
			   }, spd, eading);

			   $(".line-3").animate({
			       "top" : "440px"
			   }, spd, eading);

			   $(".line-4").animate({
			       "top" : "500px"
			   }, spd, eading);
			},400);
			});


		$(function(){
			setTimeout(function(){
				$('#back').fadeOut(1000);
					},2500);		// ○秒後に開始
		});

</script>
</head>

<body>
	<header></header>
	<p id="skip"><a href='<s:url action="StartAction" />'>スキップ</a></p>
	<div id="back"></div>
	<div id="scrn"></div>
	<div id="main">
 		<h3 class="line-1">★      the      ★</h3>
 		<h3 class="line-2">FIFTIES</h3>
 		<h3 class="line-3">AMERICAN VINTAGE SHOP</h3>
 		<h3 class="line-4">～　Since 2018　～</h3>

        <a href=""><img src="./images/top_01.jpg" alt="" width="1600"  /></a>

	</div>
	<footer></footer>
</body>
</html>