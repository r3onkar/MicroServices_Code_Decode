package com.decode.microservices.citizens.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Citizen {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	
	private int vaccinationCenterId;
	
	@Override
	public String toString() {
		return "Citizen [id=" + id + ", name=" + name + ", vaccinationCenterId=" + vaccinationCenterId + "]";
	}

	public Citizen() {
		super();
		//TODO Auto-generated constructor stub
	}

	public Citizen(int id, String name, int vaccinationCenterId) {
		super();
		this.id = id;
		this.name = name;
		this.vaccinationCenterId = vaccinationCenterId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVaccinationCenterId() {
		return vaccinationCenterId;
	}

	public void setVaccinationCenterId(int vaccinationCenterId) {
		this.vaccinationCenterId = vaccinationCenterId;
	}

	
	
}
