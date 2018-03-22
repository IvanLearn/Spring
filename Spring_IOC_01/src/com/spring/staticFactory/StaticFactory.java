package com.spring.staticFactory;

import com.spring.ioc.SpringIOC;

public class StaticFactory {
	
	public StaticFactory() {
		System.out.println("StaticFactory=========");
	}
	
	public static SpringIOC getInstance() {
		return new SpringIOC();
	}
	
	public SpringIOC getInstance1() {
		return new SpringIOC();
	}
	
	public void say() {
		System.out.println(this.getClass().getName() + " say=========");
	}
	
}
