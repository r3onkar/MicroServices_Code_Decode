package com.decode.micro.vaccinationcenter.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class VaccinationCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	private String  Centername;
	
	private String centerAddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCentername() {
		return Centername;
	}

	public void setCentername(String centername) {
		Centername = centername;
	}

	public String getCenterAddress() {
		return centerAddress;
	}

	public void setCenterAddress(String centerAddress) {
		this.centerAddress = centerAddress;
	}

	@Override
	public String toString() {
		return "VaccinationCenter [id=" + id + ", Centername=" + Centername + ", centerAddress=" + centerAddress + "]";
	}
	
	

	
}
