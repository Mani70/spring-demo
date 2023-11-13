package com.example.test.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.test.modals.MessagesDetails;
import com.example.test.repo.MessagesRepo;

@Service
public class MessagesService {
	MessagesRepo msRepo;
	public MessagesService(MessagesRepo repo) {
		this.msRepo = repo;
	}
	
	public List<MessagesDetails> sendMessage(MessagesDetails msDetails) {
		msRepo.save(msDetails);
		return getMessages();
	}
	public List<MessagesDetails> getMessages() {
		return (List<MessagesDetails>) msRepo.findAll();
	}
}
