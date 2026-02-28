package com.batchprocessing.dao;
import com.batchprocessing.entity.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {
    void insertEmployee(Employee empy);
    void updateEmployee(String newname, int old_id);
    void insertBatch(List<Employee> emps) throws SQLException;
//    void deleteBatch(List<Employee> emps);
//    List<Employee> fetchAll() throws SQLException;

//    void deleteEmployee(int playerId);
//    List<Employee> getAllEmployees();
}
