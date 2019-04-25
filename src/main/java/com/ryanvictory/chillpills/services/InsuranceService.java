package com.ryanvictory.chillpills.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ryanvictory.chillpills.models.Insurance;
import com.ryanvictory.chillpills.repositories.InsuranceRepository;

@Service
public class InsuranceService {
	private final InsuranceRepository inRepo;

	public InsuranceService(InsuranceRepository inRepo) {
		this.inRepo = inRepo;
	}
	
	public List<Insurance> allInsurances(){
		return inRepo.findAll();
	}
	
	public Insurance findInsurance(Long id) {
		Optional<Insurance> i = inRepo.findById(id);
		if(i.isPresent()) {
			return i.get();
		} else {
			return null;
		}
	}
}
