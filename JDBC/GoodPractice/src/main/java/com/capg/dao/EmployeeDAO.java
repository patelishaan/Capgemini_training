package com.capg.dao;
import com.capg.entity.Employee;
import java.util.List;

public interface EmployeeDAO {
    void insertEmployee(Employee empy);
    void updateEmployee(String newname, int old_id);
//    void deleteEmployee(int playerId);
//    List<Employee> getAllEmployees();
}
