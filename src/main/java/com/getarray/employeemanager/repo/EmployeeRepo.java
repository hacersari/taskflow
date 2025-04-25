package com.getarray.employeemanager.repo;

import com.getarray.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// long is the type of primary key "id"
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
