package com.sathya.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


@Service
@Scope("singleton")

public class MovieLister {
	@Value("${k1}")
	private int x;
	private MovieFinder finder;
	@Autowired
	@Qualifier("id2")
	public void setFinder(MovieFinder finder)
	{
		this.finder=finder;
	}
	@PostConstruct
	public void setUp()
	{
		System.out.println("setUp called");
	}
	@PreDestroy
	public void tearDown()
	{
		System.out.println("tearDown Called");
		
	}
	
	public void m1()
	{
		System.out.println("X="+x);
		System.out.println("m1 called");
		finder.m2();

	}

	
}
