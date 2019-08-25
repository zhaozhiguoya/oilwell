<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<%@include file="/WEB-INF/jsp/header.jsp" %>

<title>录入施工情况</title>
</head>
<body>
<div class="pd-20">
    <form action="" class="form form-horizontal">
    
        <div class="row cl">
            <label class="form-label col-2">层位</label>
            <div class="formControls col-5">
                <input id="layer_place" type="text" class="input-text" name="layer_place" value="" />
            </div>
            <div class="col-5" ></div>
        </div>

        <div class="row cl">
            <label class="form-label col-2">层号</label>
            <div class="formControls col-5">
                <input id="layer_id" type="text" class="input-text" name="layer_id" value=""  />
            </div>
            <div class="col-5"></div>
        </div>
            
        <div class="row cl">
            <label class="form-label col-2">布孔方式</label>
            <div class="formControls col-5">
                     <input id="hole_way" type="text" class="input-text" name="hole_way" value=""  />
            </div>
            <div class="col-5"></div>
        </div>
        
         <div class="row cl">
            <label class="form-label col-2">射孔方式</label>
            <div class="formControls col-5">
                     <input id="perforation_way" type="text" class="input-text" name="perforation_way" value=""  />
            </div>
            <div class="col-5"></div>
        </div>
        
         <div class="row cl">
            <label class="form-label col-2">射孔井段(m)</label>
            <div class="formControls col-5">
                     <input id="perforation_well_section" type="text" class="input-text" name="perforation_well_section" value=""  />
            </div>
            <div class="col-5"></div>
        </div>
         <div class="row cl">
            <label class="form-label col-2">厚度(m)</label>
            <div class="formControls col-5">
                     <input id="perforation_thick" type="text" class="input-text" name="perforation_thick" value=""  />
            </div>
            <div class="col-5"></div>
        </div>
         <div class="row cl">
            <label class="form-label col-2">孔密 (孔/m)</label>
            <div class="formControls col-5">
                     <input id="hole_density" type="text" class="input-text" name="hole_density" value=""  />
            </div>
            <div class="col-5"></div>
        </div>
         <div class="row cl">
            <label class="form-label col-2">孔数</label>
            <div class="formControls col-5">
                     <input id="hole_count" type="text" class="input-text" name="hole_count" value=""  />
            </div>
            <div class="col-5"></div>
        </div>
         <div class="row cl">
            <label class="form-label col-2">射孔弹型号</label>
            <div class="formControls col-5">
                     <input id="bullet_type" type="text" class="input-text" name="bullet_type" value=""  />
            </div>
            <div class="col-5"></div>
        </div>
         <div class="row cl">
            <label class="form-label col-2">总厚度(m)</label>
            <div class="formControls col-5">
                     <input id="deep_all" type="text" class="input-text" name="deep_all" value=""  />
            </div>
            <div class="col-5"></div>
        </div>
         <div class="row cl">
            <label class="form-label col-2">总孔数</label>
            <div class="formControls col-5">
                     <input id="hole_all" type="text" class="input-text" name="hole_all" value=""  />
            </div>
            <div class="col-5"></div>
        </div>
         <div class="row cl">
            <label class="form-label col-2">枪型弹型</label>
            <div class="formControls col-5">
                     <input id="gun_bullet_type" type="text" class="input-text" name="gun_bullet_type" value=""  />
            </div>
            <div class="col-5"></div>
        </div>

        <div class="row cl">
            <div class="col-9 col-offset-2">
                <input class="btn btn-primary radius" type="button" value="添加" onclick="roadWorkAdd()" />
                <input class="btn btn-default radius" type="button" value="关闭" onclick="location.href='list.do'" style="margin-left: 30px;" />
            </div>
        </div>
    </form>
</div>
<script type="text/javascript" src="<%=ctxPath %>/js/roadWork.js"></script>
</body>
</html>