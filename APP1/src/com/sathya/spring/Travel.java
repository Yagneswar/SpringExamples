package com.sathya.spring;

public class Travel {
	private Car car;

	public void setCar(Car car) {
		this.car = car;
		
	}
	public void journy()
	{
		car.start();
	}
	

}
