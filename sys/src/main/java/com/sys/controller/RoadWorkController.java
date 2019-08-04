package com.sys.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sys.pojo.AdminUser;

@Controller
@RequestMapping("roadWork")
public class RoadWorkController {
	@RequestMapping("list.do")
	public String toList(HttpServletRequest request,
			@RequestParam(value="currPage",required=false) Long curr,
			@RequestParam(value="pageSize",required=false) Long pageSize){
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
	List<RoadWork> roadWorkList = roadWorkService.selectByPage(currPage, pageSize);
	request.setAttribute("roadWorkList", roadWorkList);
	request.setAttribute("count", count);
	request.setAttribute("totalPage", totalPage);
	request.setAttribute("currPage", curr);
	request.setAttribute("pageSize", pageSize);
	return "roadWork/list";
	}

}
