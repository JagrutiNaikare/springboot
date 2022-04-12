package com.example.demo.service;

import com.example.demo.Error.DepartmentNotFoundException;
import com.example.demo.entity.Department;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

   public Department fetchDepartmetById(Long id) throws DepartmentNotFoundException;

   public void deleteDepartmentById(Long id);

   public Department updateDepartment(Long id, Department department);

   public Department fetchDepartmentByName(String departmentName);
}
