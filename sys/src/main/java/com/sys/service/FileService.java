package com.sys.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sys.mapper.FileMapper;
import com.sys.pojo.File;
import com.sys.pojo.FileExample;
import com.sys.pojo.FileExample.Criteria;
import com.sys.pojo.Roadwork;

@Service
public class FileService {
	
	@Resource
	private FileMapper fileMapper;
	
	Map<String,Long> map = new HashMap<String,Long>();
	
	//分页查询
	public List<File> selectByPage(Long currPage,Long pageSize){
		map.put("currPage", currPage);
		map.put("pageSize", pageSize);
		return fileMapper.selectByPage(map);
	}
		
	//查询总数
	public Long selectCount(){
		return fileMapper.selectCount();
	}
	
	//删
	public void delete(int id) {
		fileMapper.deleteByPrimaryKey(id);
	}
	
	//查找全部
	public List<File> findAll(){
		List<File> fileList = fileMapper.selectByExample(new FileExample());
		return fileList;
	}
	
	//名称模糊差
	public List<File> findByName(String fileName){
		FileExample fe = new FileExample();
		Criteria c = fe.createCriteria();
		c.andAuthorLike("%"+fileName+"%");
		List<File> fileList = fileMapper.selectByExample(fe);
		return fileList;
	}
}
