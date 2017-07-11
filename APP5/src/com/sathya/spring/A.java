package com.sathya.spring;

import java.util.List;

public class A {

	private int x;
	private List theList;
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setTheList(List theList) {
		this.theList = theList;
	}

	public void show()
	{
		System.out.println("x= "+x);
		System.out.println(theList);
	}
}
