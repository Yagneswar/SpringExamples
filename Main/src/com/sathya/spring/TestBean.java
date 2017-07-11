package com.sathya.spring;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class TestBean 
{
	private JavaMailSenderImpl mailSender;

	public void setMailSender(JavaMailSenderImpl mailSender) {
		this.mailSender = mailSender;
	}
    public void sendEmail()
    {
    	try{
    		 SimpleMailMessage smm=new SimpleMailMessage();
    		 smm.setTo("rana.rustam199@yahoo.com");
    		 smm.setSubject("mail from spring");
    		 smm.setText("mail from rustam");
    		 mailSender.send(smm);
    		 System.out.print("MESSAGE SEND SUCCESSFULLY----");
    	}catch(Exception e)
    	{
    		System.out.print(e);
    	}
    }

}
