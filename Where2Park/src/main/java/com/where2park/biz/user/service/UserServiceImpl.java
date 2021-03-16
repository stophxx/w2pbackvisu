package com.where2park.biz.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.where2park.biz.user.dao.UserDAOMybatis;
import com.where2park.biz.user.vo.UserVO;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAOMybatis UserDAO;
	
	@Override
	public void join(UserVO vo) throws Exception{
		
		UserDAO.insertUser(vo);
		
	}

}
