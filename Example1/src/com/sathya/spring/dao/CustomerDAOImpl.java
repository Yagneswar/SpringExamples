package com.sathya.spring.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sathya.spring.dto.Customer;


public class CustomerDAOImpl implements CustomerDAO 
{
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	@Override
	public int insert(Customer c)
	{
		int cid=c.getCustomerId();
		String cname=c.getCustomerName();
		String caddr=c.getCustomerAddress();
		int k=jt.update("insert into customer_table values(?,?,?)",cid,cname,caddr);
		return k;
	}
	
}
