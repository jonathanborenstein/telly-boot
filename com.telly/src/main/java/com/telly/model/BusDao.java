package com.telly.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BusDao extends PagingAndSortingRepository<Bus, Long>{
	
	//Bus findFirstByOrderByIdDesc();
	
	List<Bus> findBydateLeaveAndDateReturnAndGoingToAndLeaveFrom(Date dateLeave, Date dateReturn, String goingTo, String leaveFrom);
	List<Bus> findById(Long id);

	

}
