package com.decode.micro.vaccinationcenter.controller;




import com.decode.micro.vaccinationcenter.entity.VaccinationCenter;
import com.decode.micro.vaccinationcenter.model.Citizen;
import com.decode.micro.vaccinationcenter.model.RequiredResponse;
import com.decode.micro.vaccinationcenter.repos.CenterRepo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/vaccinationcenter")
public class VaccinationCentercontroller {
	
	@Autowired
	private CenterRepo centerRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	    
	@PostMapping(path = "/add")
	public ResponseEntity<VaccinationCenter> addCitizen(@RequestBody VaccinationCenter vaccinationCenter){
		
		System.out.println("++++++++++++"+vaccinationCenter);
		VaccinationCenter vaccinationCenterAdded =centerRepo.save(vaccinationCenter);
		return new ResponseEntity<>(vaccinationCenterAdded ,HttpStatus.OK);
	}
	
	
	@GetMapping(path = "/id/{id}")
	@HystrixCommand(fallbackMethod = "handleCitizenDownTime")
	public ResponseEntity<RequiredResponse> getAllDataOnBascCenterId(@PathVariable Integer id){
		RequiredResponse requiredResponse =new RequiredResponse();
		//!st get Vaccination Center Details 
		
		VaccinationCenter center=centerRepo.findById(id).get();
		requiredResponse.setVaccinationCenter(center);
		// then get all Citizen registered to vaccination center
		
		List<Citizen> listOfCitizens = restTemplate.getForObject("http://localhost:8081/citizen/id/"+id, List.class);
		requiredResponse.setCitizens(listOfCitizens);
		return new ResponseEntity<>(requiredResponse,HttpStatus.OK);
		}
	
	public ResponseEntity<RequiredResponse> handleCitizenDownTime(@PathVariable Integer id){
		RequiredResponse requiredResponse =new RequiredResponse();
		VaccinationCenter center=centerRepo.findById(id).get();
		requiredResponse.setVaccinationCenter(center);
		return new ResponseEntity<>(requiredResponse,HttpStatus.OK);
	}

}
