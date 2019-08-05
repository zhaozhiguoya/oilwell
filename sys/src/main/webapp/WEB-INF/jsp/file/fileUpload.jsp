<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>文件上传</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>  
<script type="text/javascript">
function displayDate()
{
document.getElementById("demo").innerHTML=Date();
}
</script>
</head>
<body>


<!-- 文件上传 -->
<form action="${pageContext.request.contextPath }/file/upload.do" method="post" enctype="multipart/form-data">
<div class="form-group">
   <div class="col-sm-4 control-label">选择文件</div>
   <br><br>
   <div class="col-sm-6">
       <div class="input-group">
       <input id='location' class="form-control" onclick="$('#i-file').click();">
           <label class="input-group-btn">
               <input type="button" id="i-check" value="浏览文件" class="btn btn-primary" onclick="$('#i-file').click();">
           </label>
       </div>
   </div>
   <input type="file" name="file" id='i-file'  accept=".xls, .xlsx, .pptx, .docx" onchange="$('#location').val($('#i-file').val());" style="display: none">
</div>
<input type="submit" value="上传" class="btn btn-info" style="margin-top: -19px;">
</form>
   
    <!--  文件下载
    <form action="${pageContext.request.contextPath }/file/down.chao"
        method="get">
        <input type="submit" value="下载">
    </form>
     -->
     
</body>
</html>