package net.java.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.java.employeeservice.entity.Employee;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDto {
    private Employee employee;
    private DepartmentDto department;
    private OrganizationDto organization;
}
