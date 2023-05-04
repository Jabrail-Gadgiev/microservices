package net.java.departmentservice.controller;

import lombok.AllArgsConstructor;
import net.java.departmentservice.dto.DepartmentDto;
import net.java.departmentservice.entity.Department;
import net.java.departmentservice.service.DepartmentService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("api/departments")
public class DepartmentController {
    private DepartmentService departmentService;

    // Build save department REST API
    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto) {
        DepartmentDto savedDepartment = departmentService.saveDepartment(departmentDto);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }

    // Build get department REST API
    @GetMapping("{department-code}")
    public ResponseEntity<DepartmentDto> getDepartment(@PathVariable("department-code") String departmentCode) {
        DepartmentDto departmentDto = departmentService.getDepartmentByCode(departmentCode);
        return new ResponseEntity<>(departmentDto, HttpStatus.OK);
    }
}
