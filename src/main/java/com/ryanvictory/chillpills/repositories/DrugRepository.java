package com.ryanvictory.chillpills.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ryanvictory.chillpills.models.Drug;


@Repository
public interface DrugRepository extends CrudRepository<Drug, Long>{
	List<Drug> findAll();
//	List<Drug> findAllOrderByPrice();
//	List<Drug> findAllOrderByPriceDesc();
	List<Drug> findByNameOrderByPrice(String name);
	List<Drug> findByTypeOrderByPrice(String type);
	List<Drug> findByDescriptionOrderByPrice(String desc);
	
	List<Drug> findByNameContainingOrderByPrice(String name);
	List<Drug> findByTypeContainingOrderByPrice(String type);
	List<Drug> findByDescriptionContainingOrderByPrice(String desc);
	}
