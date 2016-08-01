package com.telly.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telly.model.Bus;
import com.telly.model.BusDao;

@Service
public class BusService {
	
	@Autowired
	private BusDao busDao;
	
	public void save(Bus bus){
		busDao.save(bus);
	}
	
	public List<Bus> findByDate(Date dateLeave, Date dateReturn, String goingTo, String leaveFrom){
		List<Bus> results = busDao.findBydateLeaveAndDateReturnAndGoingToAndLeaveFrom(dateLeave, dateReturn, goingTo, leaveFrom);
		
		return results;
	}

	public Bus findById(Long id) {
		Bus bus = busDao.findOne(id);
		return bus;
	}

}
