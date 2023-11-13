package com.example.test.services;

import org.springframework.stereotype.Service;

import com.example.test.modals.Alien;

@Service
public class AlienServices {
	public Alien getAlienDetails() {
		return new Alien();
	}
}
