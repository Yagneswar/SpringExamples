package com.sathya.aop.aspect;

import org.aspectj.lang.JoinPoint;

public class MyAdvices {
	public void before(JoinPoint jp)
	{
		String methodName=jp.getSignature().getName();
		Object args[]=jp.getArgs();
		System.out.println("I am before advice to: "+methodName);
		System.out.println("It's arguments values are: "+args[0]+" ,"+args[1]);
	}
	public void afterReturning(JoinPoint jp,Object result)
	{
		String methodName=jp.getSignature().getName();
		Object args[]=jp.getArgs();
		System.out.println("I am after returning advice to: "+methodName);
		System.out.println("It's arguments values are: "+args[0]+" ,"+args[1]);
		System.out.println("The result of this method is: "+result);
	}

}
