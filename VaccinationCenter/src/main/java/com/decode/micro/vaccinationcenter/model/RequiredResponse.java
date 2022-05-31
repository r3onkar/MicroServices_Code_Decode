package com.decode.micro.vaccinationcenter.model;

import java.util.List;

import com.decode.micro.vaccinationcenter.entity.VaccinationCenter;



public class RequiredResponse {

	private VaccinationCenter  vaccinationCenter;
	
	private List<Citizen> citizens;

	public VaccinationCenter getVaccinationCenter() {
		return vaccinationCenter;
	}

	public void setVaccinationCenter(VaccinationCenter vaccinationCenter) {
		this.vaccinationCenter = vaccinationCenter;
	}

	public List<Citizen> getCitizens() {
		return citizens;
	}

	public void setCitizens(List<Citizen> citizens) {
		this.citizens = citizens;
	}

	public RequiredResponse(VaccinationCenter vaccinationCenter, List<Citizen> citizens) {
		super();
		this.vaccinationCenter = vaccinationCenter;
		this.citizens = citizens;
	}

	public RequiredResponse() {
		
	}

	@Override
	public String toString() {
		return "RequiredResponse [vaccinationCenter=" + vaccinationCenter + ", citizens=" + citizens + "]";
	}

	
}
