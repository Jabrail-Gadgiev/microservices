package net.java.departmentservice.service;

import net.java.departmentservice.dto.DepartmentDto;

import java.util.Optional;

public interface DepartmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartmentByCode(String code);
}
