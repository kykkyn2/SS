package com.springstory.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springstory.vo.User;

@Repository
public class UserDao {

	@Autowired
	private SqlSession sqlSession;

	public User getUser(String id) {
		return sqlSession.selectOne("users.getUser", id);
	}

}
