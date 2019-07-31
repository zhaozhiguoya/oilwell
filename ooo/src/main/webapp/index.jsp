<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.6.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/index.js"></script>
</head>

<body>
<div class="nav-top">
	<span>油气井射孔数据处理系统</span>
    <div class="nav-topright">
    	<p>上次登陆时间：2015-04-15 22:33:50   登陆IP：192.168.1.1</p>
        <span>您好：管理员</span><span>注销</span>
    </div>
</div>
<div class="nav-down">
	<div class="leftmenu1">
        <div class="menu-oc"><img src="${pageContext.request.contextPath}/img/menu-all.png" /></div>
    	<ul>
        	<li>
            	<a class="a_list a_list1">全局设置</a>
                <div class="menu_list menu_list_first">
                	<a class="lista_first" href="#">基本设置</a>
                    <a href="#">其他设置</a>
                    <a href="#">界面风格</a>
                    <a href="#">系统工具</a>
                </div>
            </li>
            <li>
            	<a class="a_list a_list2">权限管理</a>
                <div class="menu_list">
                	<a href="#">基本权限</a>
                    <a href="#">分配权限</a>
                    <a href="#">权限管理</a>
                    <a href="#">成员管理</a>
                </div>
            </li>
            <li>
            	<a class="a_list a_list3">数据录入</a>
                <div class="menu_list">
                	<a href="#">射孔通知单录入</a>
                    <a href="#">施工情况录入</a>
                    <a href="#">射孔排炮单录入</a>
                    <a href="#">射孔器材消耗量录入</a>
                </div>
            </li>
            <li>
            	<a class="a_list a_list4">数据统计</a>
                <div class="menu_list">
                	<a href="#">射孔队</a>
                    <a href="#">测试队</a>
                </div>
            </li>
            <li>
            	<a class="a_list a_list5">数据查询</a>
                <div class="menu_list">
                	<a href="#">射孔通知单查询</a>
                    <a href="#">施工情况录入</a>
                    <a href="#">射孔排炮单查询</a>
                    <a href="#">射孔器材情况查询</a>
                </div>
            </li>
            <li>
            	<a class="a_list a_list6">射孔参数计算</a>
                <div class="menu_list">
                	<a href="#">射孔负压值计算</a>
                    <a href="#">管柱安全力学计算</a>
                </div>
            </li>
			  <li>
            	<a class="a_list a_list7">在线文件</a>
                <div class="menu_list">
                	<a href="#">公司文件</a>
                    <a href="#">体系文件</a>
                    <a href="#">应用模板</a>
                    <a href="#">规章制度</a>
                </div>
           </li>
        </ul>
    </div>
    <div class="leftmenu2">
    	<div class="menu-oc1"><img src="images/menu-all.png" /></div>
        <ul>
        	<li>
            	<a class="j_a_list j_a_list1"></a>
                <div class="j_menu_list j_menu_list_first">
                	<span class="sp1"><i></i>全局设置</span>
                	<a class="j_lista_first" href="#">基本设置</a>
                    <a href="#">其他设置</a>
                    <a href="#">界面风格</a>
                    <a href="#">系统工具</a>
                </div>
            </li>
            <li>
            	<a class="j_a_list j_a_list2"></a>
                <div class="j_menu_list">
                	<span class="sp2"><i></i>权限管理</span>
                	<a href="#">基本权限</a>
                    <a href="#">分配权限</a>
                    <a href="#">权限管理</a>
                    <a href="#">成员管理</a>
                </div>
            </li>
        </ul>       
    </div>
    
    <div class="rightcon">
    	<div class="right_con">
    	<!-- 引入主页 -->
            <jsp:include page="${pageContext.request.contextPath}/main.jsp"></jsp:include>
        </div>
    </div>
</div>
<div style="text-align:center;">
<p>来源:<a href="#" target="_blank">Libinde</a></p>
</div>

</body>
</html>