package com.sathya.spring;

public abstract class MySingleton {

	public abstract MyPrototype createPrototype();
	public MySingleton()
	{
		System.out.println("i am Mysingleton constructor");
	}
	public void m1()
	{
		System.out.println("m1 called");
		createPrototype().m2();
	}
	
}
