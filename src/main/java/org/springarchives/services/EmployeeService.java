package org.springarchives.services;

import org.springarchives.models.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee (Employee employee);
    List<Employee> getAllEmployess ();

    Employee getEmployeeById(long id);
    Employee updateEmployee(long id, Employee employee);

    void deleteEmployee(long id);
}
