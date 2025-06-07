package net.javaguides.ems_backend.mapper;

import net.javaguides.ems_backend.dto.EmployeeDto;
import net.javaguides.ems_backend.entity.Employee;

public class EmployeeMapper {

	public static EmployeeDto mapEmployeeDto(Employee employee) {
		EmployeeDto dto = new EmployeeDto();
		dto.setEmail(employee.getEmail());
		dto.setId(employee.getId());
		dto.setFirstName(employee.getFirstName());
		dto.setLastName(employee.getLastName());
		
		return dto;
}
	
	public static Employee mapEmployee(EmployeeDto employee) {
		Employee dto = new Employee();
		dto.setEmail(employee.getEmail());
		dto.setId(employee.getId());
		dto.setFirstName(employee.getFirstName());
		dto.setLastName(employee.getLastName());
		
		return dto;
	}
}
