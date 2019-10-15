package com.sys.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sys.pojo.AdminUser;
import com.sys.pojo.Roadwork;
import com.sys.service.RoadWorkService;
import com.sys.shiro.ShiroUtils;

@Controller
@RequestMapping("roadWork")
public class RoadWorkController {
	
	protected final static Logger logger = LogManager.getLogger(RoadWorkController.class);
	protected Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
	
	@Autowired
	private RoadWorkService roadWorkService;
	
	@RequestMapping("list.do")
	public String toList(HttpServletRequest request,
			@RequestParam(value="currPage",required=false) Long curr,
			@RequestParam(value="pageSize",required=false) Long pageSize) throws ParseException{
	if(curr==null){
	curr=1L;
	}
	if(pageSize==null){
	pageSize=10L;
	}
	Long currPage = (curr-1)*pageSize;
	Long count = roadWorkService.selectCount();
	System.out.println("总数："+count);
	Long totalPage = 0L;
	if(count>0){
	totalPage = count%pageSize==0?count/pageSize:(count/pageSize)+1;
	}
	List<Roadwork> roadWorkList = roadWorkService.selectByPage(currPage, pageSize);
	//List<Roadwork> roadWorkList = roadWorkService.selectByPage(currPage, pageSize);
	for(Roadwork r : roadWorkList) {
		System.out.println(r);
	}
//	for(Roadwork rod:roadWorkList) {
//		Date time = rod.getTime();
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		java.sql.Date sd;
//		sd = new java.sql.Date(time.getTime());
//		rod.setTime(sd);
//	}
	request.setAttribute("roadWorkList", roadWorkList);
	request.setAttribute("count", count);
	request.setAttribute("totalPage", totalPage);
	request.setAttribute("currPage", curr);
	request.setAttribute("pageSize", pageSize);
	return "roadWork/list";
	}
	
	@RequestMapping("print.do")
	public String print(Map<String,Roadwork> map,String id) {
		Roadwork roadWork = roadWorkService.findById(Integer.parseInt(id));
		System.err.println(roadWork);
		map.put("roadwork",roadWork);
		return "/text/shekongform";
	}
	
	@RequestMapping("delete.do")
	public String delete(@RequestParam(value="id",required=false) int id,RedirectAttributes attr){
		try{
			//删除施工情况表
			roadWorkService.delete(id);
			return "redirect:list.do";
		}catch(Exception e){
			logger.debug(e);
			attr.addFlashAttribute("message", "删除失败！");
			return "redirect:list.do";
		}
	}
	//跳转至添加施工页面
	@RequestMapping("add.do")
	public String toRoadWork()
	{
		return "roadWork/add";
		
	}
	
	//添加施工情况
	@RequestMapping(value="roadWorkAdd.do",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> doAdd(HttpServletRequest request,RedirectAttributes attr,
						@RequestParam(value="layer_place",required=false) String layer_place,
						@RequestParam(value="layer_id",required=false) String layer_id, //int
						@RequestParam(value="hole_way",required=false) String hole_way,
						@RequestParam(value="perforation_way",required=false) String perforation_way,
						@RequestParam(value="perforation_well_section",required=false) String perforation_well_section,
						@RequestParam(value="perforation_thick",required=false) String perforation_thick,
						@RequestParam(value="hole_density",required=false) String hole_density,
						@RequestParam(value="hole_count",required=false) String hole_count,
						@RequestParam(value="bullet_type",required=false) String bullet_type,
						@RequestParam(value="deep_all",required=false) String deep_all,
						@RequestParam(value="hole_all",required=false) String hole_all,
						@RequestParam(value="gun_bullet_type",required=false) String gun_bullet_type){
		Roadwork pojo = new Roadwork();
		
		pojo.setLayerPlace(layer_place);
		System.out.println("层号："+layer_place);
		pojo.setLayerId(Integer.parseInt(layer_id));
		pojo.setHoleWay(hole_way);
		pojo.setPerforationWay(perforation_way);
		pojo.setPerforationWellSection(perforation_well_section);
		pojo.setPerforationThick(Double.parseDouble(perforation_thick));
		pojo.setHoleDensity(Double.parseDouble(hole_density));
		pojo.setHoleCount(Integer.parseInt(hole_count));
		pojo.setBulletType(bullet_type);
		pojo.setDeepAll(Double.parseDouble(deep_all));
		pojo.setHoleAll(Integer.parseInt(hole_all));
		pojo.setGunBulletType(gun_bullet_type);
		
		System.out.println("要添加的施工单："+pojo);
		
		try{
			roadWorkService.insert(pojo);
			/**遍历勾选的角色ID,添加用户和角色关联*/
			resultMap.put("status", 200);
			resultMap.put("message", "添加成功！");
		}catch(Exception e){
			logger.debug(e);
			resultMap.put("status", 500);
			resultMap.put("message", "添加失败！");
		}
		return resultMap;	
	}
}
