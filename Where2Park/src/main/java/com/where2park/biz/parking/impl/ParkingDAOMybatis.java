package com.where2park.biz.parking.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.where2park.biz.parking.ParkingVO;

@Repository("parkingDAO")
public class ParkingDAOMybatis {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	
	public ParkingVO getParking() {
		System.out.println("===> Mybatis로 getParking() 기능 처리");
		return (ParkingVO)mybatis.selectOne("ParkingDAO.getParking");
	}
}
