package com.capgemini.dao;
import com.capgemini.entity.Employee;

public interface EmployeeDAO {
    void insertEmployee(Employee empy);
    void updateEmployee(String newname, int old_id);
//    void deleteEmployee(int playerId);
//    List<Employee> getAllEmployees();
}
