package com.piashraful.newbeginning.controller;


import com.piashraful.newbeginning.entity.Department;
import com.piashraful.newbeginning.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")

    public Department saveDepartments(@Valid @RequestBody Department department) {
        return departmentService.saveDepartments(department);

    }

    @GetMapping("/departments")

    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/department/{id}")

    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
        LOGGER.info("Inside fetch department By Id");
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/department/{id}")

    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Department with id" + departmentId + " deleted successfully";
    }

    @PutMapping("/department/{id}")

    public Department updateDepartment(@PathVariable("id") Long departmentId,
                                       @RequestBody Department department) {
        return departmentService.updateDepartment(departmentId, department);
    }

    @GetMapping("/department/name/{name}")

    public Department fetchByDepartmentName(@PathVariable("name") String departmentName) {
        return departmentService.fetchByDepartmentName(departmentName);
    }

    @GetMapping("/department/code/{code}")
    public Department fetchDepartmentByCode(@PathVariable("code") String departmentCode) {
        return departmentService.fetchDepartmentByCode(departmentCode);
    }




}

