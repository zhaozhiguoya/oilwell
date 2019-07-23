<%@ page language="java" import="com.crx.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
<link type="text/css" rel="stylesheet" href="webapp/css/publicstyle.css">
<link type="text/css" href="webapp/css/login.css" rel="stylesheet">
</head>

<body>
    <h1>登录页面----${message }</h1>  
    <img alt="" src="/static/img/1.jpg">  
    <form:form action="/login" commandName="user" method="post">  
        用户名：<form:input path="username"/> <form:errors path="username" cssClass="error"/> <br/>  
        密 &nbsp;&nbsp;码：<form:password path="password"/> <form:errors path="password" cssClass="error" /> <br/>  
        <form:button name="button">submit</form:button>  
    </form:form>  
<!--  
<form action="" method="post">
	<input type="text" name="username" placeholder="用户名" ><br>
	<input type="password" name="password" placeholder="密码" ><br>
	<input type="button" id="login_btn"><br>
</form> -->
</body>
<script type="text/javascript">
	$(function() {
		//表单边框	     	
		$("input[type='text'],input[type='password']").blur(function() {
			var $el = $(this);
			var $parent = $el.parent();
			$parent.attr('class', 'frame_style').removeClass(' form_error');
			if ($el.val() == '') {
				$parent.attr('class', 'frame_style').addClass(' form_error');
			}
		});
		$("input[type='text'],input[type='password']").focus(
				function() {
					var $el = $(this);
					var $parent = $el.parent();
					$parent.attr('class', 'frame_style').removeClass(
							' form_errors');
					if ($el.val() == '') {
						$parent.attr('class', 'frame_style').addClass(
								' form_errors');
					} else {
						$parent.attr('class', 'frame_style').removeClass(
								' form_errors');
					}
				});
		var show_num = [];
		draw(show_num);
		$("#canvas").on('click', function() {
			draw(show_num);
		})
		//登录验证
		$("#login_btn").click(function() {

			if ($("#username").val() == '') {
				alert('用户名为空！');
			} else if ($("#userpwd").val() == '') {
				alert('密码为空！');
			} else {
				var val = $(".input-val").val().toLowerCase();
				var num = show_num.join("");
				if (val == '') {
					alert("验证码为空！");
				} else if (val == num) {
					$(".form_login").submit();

				} else {
					alert('验证码错误！请重新输入！');
					$(".input-val").val('');
					draw(show_num);
				}
			}
		});

		//生成并渲染出验证码图形
		function draw(show_num) {
			var canvas_width = $('#canvas').width();
			var canvas_height = $('#canvas').height();
			var canvas = document.getElementById("canvas");//获取到canvas的对象
			var context = canvas.getContext("2d");//获取到canvas画图的环境
			canvas.width = canvas_width;
			canvas.height = canvas_height;
			var sCode = "a,b,c,d,e,f,g,h,i,j,k,m,n,p,q,r,s,t,u,v,w,x,y,z,A,B,C,E,F,G,H,J,K,L,M,N,P,Q,R,S,T,W,X,Y,Z,1,2,3,4,5,6,7,8,9,0";
			var aCode = sCode.split(",");
			var aLength = aCode.length;//获取到数组的长度
			for (var i = 0; i < 4; i++) { //这里的for循环可以控制验证码位数（如果想显示6位数，4改成6即可）
				var j = Math.floor(Math.random() * aLength);//获取到随机的索引值
				// var deg = Math.random() * 30 * Math.PI / 180;//产生0~30之间的随机弧度
				var deg = Math.random() - 0.5; //产生一个随机弧度
				var txt = aCode[j];//得到随机的一个内容
				show_num[i] = txt.toLowerCase();
				var x = 6 + i * 17;//文字在canvas上的x坐标
				var y = 20 + Math.random() * 8;//文字在canvas上的y坐标
				context.font = "bold 23px 微软雅黑";
				context.translate(x, y);
				context.rotate(deg);
				context.fillStyle = randomColor();
				context.fillText(txt, 0, 0);
				context.rotate(-deg);
				context.translate(-x, -y);
			}
			for (var i = 0; i <= 5; i++) { //验证码上显示线条
				context.strokeStyle = randomColor();
				context.beginPath();
				context.moveTo(Math.random() * canvas_width, Math.random()
						* canvas_height);
				context.lineTo(Math.random() * canvas_width, Math.random()
						* canvas_height);
				context.stroke();
			}
			for (var i = 0; i <= 30; i++) { //验证码上显示小点
				context.strokeStyle = randomColor();
				context.beginPath();
				var x = Math.random() * canvas_width;
				var y = Math.random() * canvas_height;
				context.moveTo(x, y);
				context.lineTo(x + 1, y + 1);
				context.stroke();
			}
		}
		//得到随机的颜色值
		function randomColor() {
			var r = Math.floor(Math.random() * 256);
			var g = Math.floor(Math.random() * 256);
			var b = Math.floor(Math.random() * 256);
			return "rgb(" + r + "," + g + "," + b + ")";
		}
	});
</script>
</html>