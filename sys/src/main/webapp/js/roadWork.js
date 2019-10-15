/**删除施工情况表*/
	function roadWorkDel(id){
		$(".hintl").css({"display":"block"});
		$(".box").css({"display":"block"});
	    
		$(".hintl-in3").click(function(event) {
			$(".hintl").css({"display":"none"});
			$(".box").css({"display":"none"});
			window.location="delete.do?id="+id+"";
		});
		
		$(".hintl-in4").click(function() {
			$(".hintl").css({"display":"none"});
			$(".box").css({"display":"none"});
		});
	}
	/*print*/
	function roadWorkPrint(id){
		//alert(id);
		window.location="print.do?id="+id+"";
	}
		
	/**分页*/
	function nextPage(currPage,pageSize){	
		window.location="list.do?currPage="+currPage+"&pageSize="+pageSize+"";
	}

	/**每页显示*/
	function showPageSize(){
		var pageSize = document.getElementById("pageSize").value;
		if(pageSize.length>0){
			nextPage(1,pageSize);
		}		
	}
         		
	/**跳转到具体页*/
	function jumpPage(totalPage,pageSize){
		var page = document.getElementById("jumpPage").value;
		var reg = /^[0-9]*$/;
		if (0!=page&&reg.test(page)&&totalPage>=page) {
			nextPage(page,pageSize);
		}else{				
			layer.msg("请输入正确页数!");
		}
	}

	
	/**添加施工情况*/
	function roadWorkAdd(){
		var layer_place = jQuery("#layer_place").val();
		var layer_id = jQuery("#layer_id").val();   //int
		var hole_way = jQuery("#hole_way").val();   
		var perforation_way = jQuery("#perforation_way").val();   
		var perforation_well_section = jQuery("#perforation_well_section").val(); 
		var perforation_thick = jQuery("#perforation_thick").val();   //double
		var hole_density = jQuery("#hole_density").val(); //double
		var hole_count = jQuery("#hole_count").val();   //int
		var bullet_type = jQuery("#bullet_type").val();  
		var deep_all = jQuery("#deep_all").val();   //double
		var hole_all = jQuery("#hole_all").val();   //int
		var gun_bullet_type = jQuery("#gun_bullet_type").val();  
		if(layer_place==null||layer_place==""){
			layer.msg('层位不能为空！');
			return false;
		}
		if(layer_id==null||layer_id==""){

			layer.msg('层号不能为空！');
			return false;
		}
		if(hole_all==null||hole_all==""){
			layer.msg('总孔数不能为空！');
			return false;
		}
		roadWorkAddSave(layer_place,layer_id,hole_way,perforation_way,perforation_well_section,perforation_thick,hole_density,hole_count,bullet_type,deep_all,hole_all,gun_bullet_type);
	}
	
	/**添加施工情况提交保存*/
	function roadWorkAddSave(layer_place,layer_id,hole_way,perforation_way,perforation_well_section,perforation_thick,hole_density,hole_count,bullet_type,deep_all,hole_all,gun_bullet_type){
		var data = {layer_place:layer_place,layer_id:layer_id,hole_way:hole_way,perforation_way:perforation_way,perforation_well_section:perforation_well_section,perforation_thick:perforation_thick,hole_density:hole_density,hole_count:hole_count,bullet_type:bullet_type,deep_all:deep_all,hole_all:hole_all,gun_bullet_type:gun_bullet_type};
		var load = layer.load();
		jQuery.ajax({
			url:"roadWorkAdd.do",
			data:data,
			type:"post",
			dataType:"json",
			beforeSend:function(){
				layer.msg('正在处理...');
			},
			success:function(result){
				
				layer.close(load);
				if(result && result.status != 200){
					layer.msg(result.message,function(){});
				    return;
				}else{
				    layer.msg(result.message);
				    setTimeout(function(){
			    		window.location.href="list.do";
		    		},1000)
				}
			},
			error:function(e){
			    alert(e.status+"=="+e.readyState+"=="+e.message);
			    layer.msg('添加提交失败！');
			    window.location.href="add.do";
			}
		});
	}	