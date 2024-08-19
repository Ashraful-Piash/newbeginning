package com.piashraful.newbeginning.service;

import com.piashraful.newbeginning.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartments(Department department);

    public List<Department> getAllDepartments();

    public Department fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchByDepartmentName(String departmentName);
}
