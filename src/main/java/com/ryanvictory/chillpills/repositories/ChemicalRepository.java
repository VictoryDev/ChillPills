package com.ryanvictory.chillpills.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ryanvictory.chillpills.models.Chemical;

@Repository
public interface ChemicalRepository extends CrudRepository<Chemical, Long>{
	List<Chemical> findAll();
	Optional<Chemical> findById(Long id);
}
