package com.ryanvictory.chillpills.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ryanvictory.chillpills.models.Chemical;
import com.ryanvictory.chillpills.repositories.ChemicalRepository;

@Service
public class ChemicalService {
	private final ChemicalRepository chemRepo;

	public ChemicalService(ChemicalRepository chemRepo) {
		this.chemRepo = chemRepo;
	}
	
	public List<Chemical> allChemicals(){
		return chemRepo.findAll();
	}
	
	public Chemical findChemical(Long id) {
		Optional<Chemical> c = chemRepo.findById(id);
		if(c.isPresent()) {
			return c.get();
		} else {
			return null;
		}
	}
	
	public Chemical create(Chemical chem) {
		return chemRepo.save(chem);
	}
}
