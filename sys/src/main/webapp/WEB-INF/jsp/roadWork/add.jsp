<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<%@include file="/WEB-INF/jsp/header.jsp" %>

<title>录入施工情况表</title>
</head>
<body>
<div class="pd-20">
    <form action="" class="form form-horizontal">
    
        <div class="row cl">
            <label class="form-label col-2">队号</label>
            <div class="formControls col-5">
                <input id="tid" type="text" class="input-text" name="tid" value="" />
            </div>
            <div class="col-5" ></div>
        </div>

        <div class="row cl">
            <label class="form-label col-2">队长</label>
            <div class="formControls col-5">
                <input id="captain" type="text" class="input-text" name="captain" value=""  />
            </div>
            <div class="col-5"></div>
        </div>
            
        <div class="row cl">
            <label class="form-label col-2">所属角色</label>
            <div class="formControls col-5">
                   <!--  <input id="subject1" type="checkbox" name="roleIds" value="1" /><label for="subject1" style="margin-right: 10px;">超级管理员</label> -->
                    
                    <c:forEach var="rList" items="${roleList}">
                    <input id="subject2" type="checkbox" name="roleIds" value="${rList.id }" /><label for="subject2" style="margin-right: 10px;">${rList.name }</label>
                    </c:forEach>
            </div>
            <div class="col-5"></div>
        </div>

        <div class="row cl">
            <div class="col-9 col-offset-2">
                <input class="btn btn-primary radius" type="button" value="添加" onclick="adminUserAdd()" />
                <input class="btn btn-default radius" type="button" value="关闭" onclick="location.href='list.do'" style="margin-left: 30px;" />
            </div>
        </div>
    </form>
</div>
<script type="text/javascript" src="<%=ctxPath %>/js/adminUser.js"></script>
</body>
</html>