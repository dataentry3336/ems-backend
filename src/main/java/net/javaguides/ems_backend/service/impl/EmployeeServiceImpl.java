package net.javaguides.ems_backend.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.javaguides.ems_backend.dto.EmployeeDto;
import net.javaguides.ems_backend.entity.Employee;
import net.javaguides.ems_backend.exception.ResourceNotFoundException;
import net.javaguides.ems_backend.mapper.EmployeeMapper;
import net.javaguides.ems_backend.repository.EmployeeRepository;
import net.javaguides.ems_backend.service.EmployeeService;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl  implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		// TODO Auto-generated method stub
		Employee employee = EmployeeMapper.mapEmployee(employeeDto);
		Employee emp = employeeRepository.save(employee);
		
		return EmployeeMapper.mapEmployeeDto(emp);
	}


	@Override
	public EmployeeDto getEployeeById(Long id) {
		// TODO Auto-generated method stub
		 
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found"));
		return EmployeeMapper.mapEmployeeDto(employee);
	}


	@Override
	public List<EmployeeDto> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> employeeList = employeeRepository.findAll();
		return employeeList.stream().map(emp -> EmployeeMapper.mapEmployeeDto(emp)).collect(Collectors.toList());
	}

}
