package com.jason.business.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jason.business.mapper.UserMapper;
import com.jason.business.model.User;

/**
 * Created by 01435340 on 2016/10/31.
 */
@Service

public class InstanceServiceImpl implements InstanceService {

	@Autowired
	UserMapper userMapper;
	@Override
	public List<Object> queryList(String name) {
		// TODO Auto-generated method stub
		System.out.println("success================================================");
		User user = userMapper.findUserByName("test");
		System.out.println("success================================================"+user.getId());
		User user2 = new User();
		user2.setName("张三");
		userMapper.insert(user2);
		return null;
	}

}
