package com.dao;

import java.util.List;

import com.bean.Employee;

public interface EmpDAO {
Long addEmployee(Employee e);
List<Employee> getAllEmployees();
void updateEmployee(long id,int newsalary);
List<Employee> getEmployeeBySalary(int sal);
void deleteEmp(long id);
}
