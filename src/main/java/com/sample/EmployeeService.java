package com.sample;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface EmployeeService {
	
	@WebMethod
	public boolean createEmployee(Employee emp);
	
	@WebMethod
	public Employee getEmployee(String name);

}
