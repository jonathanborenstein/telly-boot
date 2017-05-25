package com.telly.model;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationsDao extends JpaRepository<Reservations, Long> {
	List<Reservations> findByEmail(String email);

}