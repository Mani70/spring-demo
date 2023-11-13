package com.example.test.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.test.modals.MessagesDetails;

public interface MessagesRepo extends CrudRepository<MessagesDetails, Integer>{
	
}
