package com.sys.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sys.mapper.RoadworkMapper;
import com.sys.pojo.Permission;
import com.sys.pojo.Roadwork;
import com.sys.pojo.RoadworkExample;

@Service
public class RoadWorkService {
	
	@Resource
	private RoadworkMapper roadWorkMapper;
	
	Map<String,Long> map = new HashMap<String,Long>();
	
	//增
	public void insert (Roadwork rod) {
		roadWorkMapper.insert(rod);
	}
	
	//删
	public void delete(int id) {
		roadWorkMapper.deleteByPrimaryKey(id);
		
	}
	
	//查询全部
	public List<Roadwork> findAll(){
		List<Roadwork> list = roadWorkMapper.selectByExample(new RoadworkExample());
		return list;		
	}
	
	//按ID 查询
	public Roadwork findById(int id) {
		Roadwork roadwork = roadWorkMapper.selectByPrimaryKey(id);
		return roadwork;
	}
	
	//分页查询
	public List<Roadwork> selectByPage(Long currPage,Long pageSize){
		map.put("currPage", currPage);
		map.put("pageSize", pageSize);
		return roadWorkMapper.selectByPage(map);
	}
	
	//查询总数
	public Long selectCount(){
		return roadWorkMapper.selectCount();
	}
	
}
