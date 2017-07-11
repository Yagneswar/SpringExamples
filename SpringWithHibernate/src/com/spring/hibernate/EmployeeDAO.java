package com.spring.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDAO {
	HibernateTemplate template;
	public void setTemplate(HibernateTemplate template)
	{
		this.template=template;
		
	}
	public void saveEmployee(Employee e)
	{
	   template.save(e);
		
	}
	public void updateEmployee(Employee e)
	{
		template.update(e);
		
	}
	public void deleteEmployee()
	{
		
		
	}
	public Employee getById(int id)
	{
		Employee e=(Employee)template.get(Employee.class,id);
		return e;
		
	}
	public List<Employee> getEmployee()
	{
		List<Employee> list=new ArrayList<Employee>();
		list=template.loadAll(Employee.class);
		return list;
		
		
		
	}

}
