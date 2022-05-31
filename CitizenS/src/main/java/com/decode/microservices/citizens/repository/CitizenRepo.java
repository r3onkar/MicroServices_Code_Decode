package com.decode.microservices.citizens.repository;

import java.util.List;

import com.decode.microservices.citizens.entity.Citizen;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CitizenRepo extends JpaRepository<Citizen	,Integer> {

	
	

	public List<Citizen> findByVaccinationCenterId (Integer id);
	
	
}
