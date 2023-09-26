package com.ramjava.spring3.department.service.repository;

import com.ramjava.spring3.department.service.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepository {
    private List<Department> departments = new ArrayList<>();
}
