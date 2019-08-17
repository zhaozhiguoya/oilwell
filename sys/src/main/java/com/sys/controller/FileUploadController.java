package com.sys.controller;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.sys.pojo.FileExample;
import com.sys.pojo.Roadwork;
import com.sys.service.FileService;

@Controller
@RequestMapping("file")
public class FileUploadController {
	
	@Autowired
	private FileService fileService;
	
	@RequestMapping("turnUpload.do")
	 public String turnUpload() throws IOException{  
      System.out.println("哈哈哈");
       return "file/fileUpload";  
   }  
	
	
	//Request method 'GET' not supported
	@RequestMapping("upload.do")
	 public String upload(MultipartFile file,HttpServletRequest request) throws IOException{  
        String path = request.getSession().getServletContext().getRealPath("upload");  
        String fileName = file.getOriginalFilename();    
        File dir = new File(path,fileName);          
        if(!dir.exists()){  
            dir.mkdirs();  
        }  
       
        file.transferTo(dir);  
        return "file/fileMassgae";  
    }  
	
	//查询全部
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
	Long count = fileService.selectCount();
	Long totalPage = 0L;
	if(count>0){
	totalPage = count%pageSize==0?count/pageSize:(count/pageSize)+1;
	}
	List<com.sys.pojo.File> fileList = fileService.selectByPage(currPage, pageSize);
	for(com.sys.pojo.File f:fileList) {
		Date time = f.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		java.sql.Date sd;
		sd = new java.sql.Date(time.getTime());
		f.setTime(sd);
	}
	request.setAttribute("fileList", fileList);
	request.setAttribute("count", count);
	request.setAttribute("totalPage", totalPage);
	request.setAttribute("currPage", curr);
	request.setAttribute("pageSize", pageSize);
	return "file/list";
	}
	
	
	//按照名字模糊查
	@RequestMapping("listByName.do")
	public String findByName(String fileName,Map<String,Object> map) {
		List<com.sys.pojo.File> fileList = fileService.findByName(fileName);
		map.put("fileList", fileList);
		return "file/list";
	}
	
}
