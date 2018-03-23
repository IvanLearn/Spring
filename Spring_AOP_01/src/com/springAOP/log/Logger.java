package com.springAOP.log;

import org.springframework.stereotype.Component;

@Component
public class Logger {
	public void beforeMethod() {
		System.out.println("beforeMethod============");
	}
	
	public void afterMethod() {
		System.out.println("afterMethod============");
	}
}
