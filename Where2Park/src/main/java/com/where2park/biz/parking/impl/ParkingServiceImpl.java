package com.where2park.biz.parking.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.where2park.biz.parking.ParkingService;
import com.where2park.biz.parking.ParkingVO;
@Service("parkingService")
public class ParkingServiceImpl implements ParkingService{
	@Autowired
	private ParkingDAOMybatis parkingDAO;
	
	@Override
	public ParkingVO getParking() {
		return parkingDAO.getParking();
	}
	
}
