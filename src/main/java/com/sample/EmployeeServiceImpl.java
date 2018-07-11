package com.sample;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

@WebService(endpointInterface = "com.sample.EmployeeService", serviceName="EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

	private Map<String, Employee> empMap = new HashMap<String, Employee>();

	public boolean createEmployee(Employee emp) {
		empMap.put(emp.getName(), emp);
		return true;
	}

	public Employee getEmployee(String name) {
		Employee emp = null;

		if (empMap.containsKey(name)) {
			emp = empMap.get(name);
		}

		return emp;
	}

}
