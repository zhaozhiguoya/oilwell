package com.crx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crx.mapper.RolePermissionMapper;
import com.crx.mapper.UserMapper;
import com.crx.mapper.UserRoleMapper;
import com.crx.pojo.User;
import com.crx.pojo.UserExample;
import com.crx.pojo.UserExample.Criteria;
import com.crx.pojo.UserRoleExample;


@Service
public class userServiceImpl implements userService {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserRoleMapper userroleMapper;
	@Autowired
	private RolePermissionMapper rolepermissionMapper;
	
	
	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		userMapper.insert(user);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		userMapper.deleteByPrimaryKey(id);
	}

	public User edit(int id) {
		
		User user = userMapper.selectByPrimaryKey(id);
		return user;
		
	}
	
	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		userMapper.updateByPrimaryKey(user);
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public User findByName(String name) {
		// TODO Auto-generated method stub
		UserExample ue = new UserExample();
		Criteria c = ue.createCriteria();
		c.andUsernameEqualTo(name);
		
		User user = (User) userMapper.selectByExample(ue);
		return user;
	}
	
	public List<String> findRoles(String name){
		UserRoleExample ure = new UserRoleExample();

		userroleMapper.selectByExample() findByName(name).getId()
		return;
	}

}
