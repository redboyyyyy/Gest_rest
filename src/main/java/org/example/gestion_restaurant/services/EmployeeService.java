package org.example.gestion_restaurant.services;

import org.example.gestion_restaurant.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    void deleteEmployeeById(Long id);

    void deleteAllEmployees();

    Optional<Employee> getEmployeeById(Long id);

    List<Employee> getAllEmployees();
}
