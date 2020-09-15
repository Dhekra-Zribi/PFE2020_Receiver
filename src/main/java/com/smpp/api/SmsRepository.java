package com.smpp.api;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsRepository extends MongoRepository<Sms, Long> {
	
	List<Sms> findAllByTypeOrderByIdDesc(String type);
	 
}