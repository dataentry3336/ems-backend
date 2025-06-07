package net.javaguides.ems_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.ems_backend.dto.EmployeeDto;

@Service
public interface EmployeeService {

	EmployeeDto createEmployee(EmployeeDto employeeDto);
	
	EmployeeDto getEployeeById(Long id);
	
	List<EmployeeDto> getAllEmployee();
		
}
