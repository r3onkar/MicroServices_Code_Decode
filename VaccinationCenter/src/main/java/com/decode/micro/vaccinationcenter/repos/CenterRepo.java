package com.decode.micro.vaccinationcenter.repos;



import com.decode.micro.vaccinationcenter.entity.VaccinationCenter;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CenterRepo extends JpaRepository<VaccinationCenter	, Integer> {


}
