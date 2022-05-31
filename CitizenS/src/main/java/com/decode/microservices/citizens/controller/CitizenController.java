package com.decode.microservices.citizens.controller;

import java.util.List;

import com.decode.microservices.citizens.entity.Citizen;
import com.decode.microservices.citizens.repository.CitizenRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/citizen")
public class CitizenController {
	
	@Autowired
	private CitizenRepo citizenRepo;

	@RequestMapping(path="/test")
	public ResponseEntity<String> test() {
		return new ResponseEntity<>("hello",HttpStatus.OK);
	}
	
	@RequestMapping(path="/id/{id}")
	public ResponseEntity<List<Citizen>> getById(@PathVariable Integer id) {
		
		List<Citizen> listCitizens=citizenRepo.findByVaccinationCenterId(id);
		return new ResponseEntity<>(listCitizens,HttpStatus.OK);
	}
	

	@PostMapping(path = "/add")
	public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen citizen){
		
		System.out.println("++++++++++++"+citizen);
		Citizen citizen2=citizenRepo.save(citizen);
		return new ResponseEntity<>(citizen,HttpStatus.OK);
	}
	
	
	
	
}