package net.java.employeeservice.service;

import net.java.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);
}
