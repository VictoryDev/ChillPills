package com.ryanvictory.chillpills.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ryanvictory.chillpills.models.Drug;
import com.ryanvictory.chillpills.repositories.DrugRepository;

@Service
public class DrugService {
	private final DrugRepository drugRepo;

	public DrugService(DrugRepository drugRepo) {
		this.drugRepo = drugRepo;
	}
	
	public List<Drug> allDrugs(){
		return drugRepo.findAll();
	}
	
//	public List<Drug> allDrugsOrderPrice(){
//		return drugRepo.findAllOrderByPrice();
//	}
//	public List<Drug> allDrugsOrderPriceDesc(){
//		return drugRepo.findAllOrderByPriceDesc();
//	}
	
	public List<Drug> searchAll(String search){
		if(search.isEmpty()) {
			return null;
		} else {
			List<Drug> l1 = drugRepo.findByNameContainingOrderByPrice(search);
			List<Drug> l2 = drugRepo.findByTypeContainingOrderByPrice(search);
			List<Drug> l3 = drugRepo.findByDescriptionContainingOrderByPrice(search);
			
			if(!l1.isEmpty()) {
				return l1;
			} else if(!l2.isEmpty()) {
				return l2;
			} else if(!l3.isEmpty()) {
				return l3;
			} else {
				System.out.println("No matching results");
				return null;
			}
		}
	}
	
	public Drug findDrug(Long id) {
		Optional<Drug> d = drugRepo.findById(id);
		if(d.isPresent()) {
			return d.get();
		} else {
			return null;
		}
	}
	
	public Drug create(Drug drug) {
		return drugRepo.save(drug);
	}
	
}
