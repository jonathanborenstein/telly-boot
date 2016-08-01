package com.telly.model;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationsDao extends CrudRepository<Reservations, Long> {
	List<Reservations> findByEmail(String email);

}