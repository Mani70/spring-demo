package com.example.test.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.test.modals.MessagesDetails;
import com.example.test.services.MessagesService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MyMessageController {
	
	
	MessagesService mService;
	
	public MyMessageController(MessagesService mService) {
		this.mService = mService;
	}
	
	
	@GetMapping("getMessages")
	@ResponseBody
	public List<MessagesDetails> getMessages(HttpSession session) {
		System.out.println(session.getId());
		return mService.getMessages();
	}
	
	@PostMapping("sendMesage")
	@ResponseBody
	public String sendMessage(MessagesDetails msDetails) {
		String chatHistory = null;
		List<MessagesDetails> lstMessagesDetails = mService.sendMessage(msDetails);
		for(MessagesDetails msd : lstMessagesDetails) {
			chatHistory += msd.getMessageBody() + "\n";
		}
		return chatHistory;
	}
}
