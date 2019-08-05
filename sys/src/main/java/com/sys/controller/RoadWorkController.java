package com.sys.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sys.pojo.AdminUser;
import com.sys.pojo.Roadwork;
import com.sys.service.RoadWorkService;

@Controller
@RequestMapping("roadWork")
public class RoadWorkController {
	
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
	Long totalPage = 0L;
	if(count>0){
	totalPage = count%pageSize==0?count/pageSize:(count/pageSize)+1;
	}
	List<Roadwork> roadWorkList = roadWorkService.selectByPage(currPage, pageSize);
	for(Roadwork rod:roadWorkList) {
		Date time = rod.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		java.sql.Date sd;
		sd = new java.sql.Date(time.getTime());
		rod.setTime(sd);
	}
	request.setAttribute("roadWorkList", roadWorkList);
	request.setAttribute("count", count);
	request.setAttribute("totalPage", totalPage);
	request.setAttribute("currPage", curr);
	request.setAttribute("pageSize", pageSize);
	return "roadWork/list";
	}

}
