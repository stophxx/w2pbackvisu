package com.where2park.view.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.where2park.biz.user.service.UserService;
import com.where2park.biz.user.vo.UserVO;

@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	UserController() {
		System.out.println("UserController 객체 생성");
	}

	@Inject
	UserService service;

//	// 회원가입 GET
//	@RequestMapping(value = "/user/join", method = RequestMethod.GET)
//	public void getJoin() throws Exception {
//		logger.info("get join");
//	}

	// 회원가입 POST
	@RequestMapping(value = "user/join.do", method = RequestMethod.POST)
	public String postRegister(UserVO vo) throws Exception {
		logger.info("post join");

		service.join(vo);

		return "../option.jsp";
	}

}
