package com.telly.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BusDao extends PagingAndSortingRepository<Bus, Long>{
	
	List<Bus> findByDateAndLeaveFromAndGoingTo(Date date, String leaveFrom, String goingTo);

	List<Bus> findById(Long id);

	

}
