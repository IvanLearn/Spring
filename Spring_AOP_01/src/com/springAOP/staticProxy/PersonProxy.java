package com.springAOP.staticProxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springAOP.service.IPerson;

@Component
public class PersonProxy {
	
	@Autowired
	private IPerson person;

	public PersonProxy(IPerson person) {
		super();
		this.person = person;
	}
	
	public void doSomething() {
		person.doSomething();
	}
}
