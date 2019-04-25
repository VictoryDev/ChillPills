package com.ryanvictory.chillpills.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ryanvictory.chillpills.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	User findByUserName(String userName);
}
