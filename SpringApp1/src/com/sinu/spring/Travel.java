package com.sinu.spring;

public class Travel 
{
	private Bus bus;


	public void setBus(Bus bus) {
		this.bus = bus;
	}
	
	public void jour()
	{
		bus.run();
	}
	

}
