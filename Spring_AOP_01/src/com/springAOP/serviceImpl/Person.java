package com.springAOP.serviceImpl;

import org.springframework.stereotype.Service;

import com.springAOP.service.IPerson;

@Service
public class Person implements IPerson {

	@Override
	public void doSomething() {
		
		System.out.println("person do something!!!");

	}

}
