package com.javatpoint;  
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {   
public static void main(String[] args) { 
	
	ApplicationContext b=new ClassPathXmlApplicationContext("applicationContext.xml");
      Object o=b.getBean("mailMail");
      MailMail m=(MailMail)o;
//Resource r=new ClassPathResource("applicationContext.xml");  
//BeanFactory b=new XmlBeanFactory(r);  
//MailMail m=(MailMail)b.getBean("mailMail");  
      
String sender="yagnesdash@gmail.com";//write here sender gmail id  
String receiver="badaldash93@gmail.com";//write here receiver id  
m.sendMail(sender,receiver,"hi","welcome");  
      
System.out.println("success");  
}  
}  
