package com.where2park.biz.user;

import java.sql.SQLException;

import com.where2park.biz.user.dao.UserDAOMybatis;
import com.where2park.biz.user.vo.UserVO;

public class UserServiceClient {

	public static void main(String[] args) {
		
		UserDAOMybatis userDAO = new UserDAOMybatis();
		
		UserVO vo = new UserVO();
		
		vo.setEmail("jjh1637@gmail.com");
		vo.setPassword("1234jjhjh");
		vo.setNickname("지히흐히");
		System.out.println(vo.toString());
		
		userDAO.insertUser(vo);
		
//		List<UserVO> userList = userDAO

	}

}
