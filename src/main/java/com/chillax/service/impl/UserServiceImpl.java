package com.chillax.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chillax.dao.IUserDao;
import com.chillax.entity.User;
import com.chillax.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
	@Resource
	private IUserDao iUserDao;
	
	public List<User> getUserList() {
		return iUserDao.getUserList();
	}
	
}
