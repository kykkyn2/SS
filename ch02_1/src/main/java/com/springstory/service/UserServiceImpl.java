package com.springstory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springstory.dao.UserDao;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public String getHelloMessage() {
		return "안녕하세요 " + userDao.getUser("hamzang").getName();
	}
}
