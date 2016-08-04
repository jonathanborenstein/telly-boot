package com.telly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telly.model.Reservations;
import com.telly.model.ReservationsDao;

@Service
public class ReservationsService {
	
	@Autowired
	ReservationsDao reservationsDao;
	
	public List<Reservations> findByEmail(String email)
	{
		return reservationsDao.findByEmail(email);
	}

	public void save(Reservations reserve) {
		reservationsDao.save(reserve);
		
	}

	public void delete(Long id) {
		reservationsDao.delete(id);
		
	}

}
