package com.sys.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("file")
public class FileUploadController {
	
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
	
}
