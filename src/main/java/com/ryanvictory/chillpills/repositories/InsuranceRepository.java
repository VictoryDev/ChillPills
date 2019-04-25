package com.ryanvictory.chillpills.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ryanvictory.chillpills.models.Insurance;

@Repository
public interface InsuranceRepository extends CrudRepository<Insurance, Long>{
	List<Insurance> findAll();
}
