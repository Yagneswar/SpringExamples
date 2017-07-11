package com.sathya.spring.business;

import com.sathya.spring.dao.CustomerDAO;
import com.sathya.spring.dto.Customer;

public class DemoBean {

	private CustomerDAO customerDAO;

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}
	public void insertCustomer(int cid,String cname,String caddr)
	{
		Customer c=new Customer();
		c.setCustomerId(cid);
		c.setCustomerName(cname);
		c.setCustomerAddress(caddr);
		int k=customerDAO.insert(c);
		System.out.println(k+" row inserted");
	}
	
}
