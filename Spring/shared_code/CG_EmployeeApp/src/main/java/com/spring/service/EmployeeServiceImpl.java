package com.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.EmployeeEntity;
import com.spring.json.Employee;
import com.spring.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public Employee createEmployee(Employee employee) {
		EmployeeEntity employeeEntity = 
				employeeRepo.save(new EmployeeEntity(employee.getName(), employee.getSal()));
		return new Employee(employeeEntity.getEmployeeId(), employeeEntity.getName(), employeeEntity.getSal());
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<EmployeeEntity> employeeEntityList = employeeRepo.findAll();
		List<Employee> employees = new ArrayList<Employee>();
		for(EmployeeEntity employeeEntity: employeeEntityList) {
			employees.add(new Employee(employeeEntity.getEmployeeId(), employeeEntity.getName(), employeeEntity.getSal()));
		}
		return employees;
	}

}
