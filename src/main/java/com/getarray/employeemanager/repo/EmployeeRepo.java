package com.getarray.employeemanager.repo;

import com.getarray.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// long is the type of primary key "id"
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id); // query naming convention, it will delete the employee by matching the id (spring)

    Optional<Employee> findEmployeeById(Long id);
}
