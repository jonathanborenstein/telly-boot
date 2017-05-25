package com.telly.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<SiteUser, Long> {
	SiteUser findByEmail(String email);

}
