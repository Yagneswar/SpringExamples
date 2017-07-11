package com.sathya.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		MovieLister lister=(MovieLister)ctx.getBean("movieLister");
		lister.m1();
		ctx.close();

	}

}
