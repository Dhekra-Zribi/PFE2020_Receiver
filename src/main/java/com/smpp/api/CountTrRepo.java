package com.smpp.api;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CountTrRepo extends MongoRepository<CountTr, Long>{

	public CountTr findByDate(String date);
	void deleteByDate(String date);
}
