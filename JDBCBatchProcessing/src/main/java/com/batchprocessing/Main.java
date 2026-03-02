package com.batchprocessing;
import com.batchprocessing.dao.EmployeeDAO;
import com.batchprocessing.dao.EmployeeDAOImpl;
import com.batchprocessing.entity.Employee;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        EmployeeDAO dao = new EmployeeDAOImpl();
        //INSERT
        //dao.insertEmployee(new Employee(17,"Ishaan",28000));
        //UPDATE
        dao.updateEmployee("Patel",12);
        EmployeeDAO daao = new EmployeeDAOImpl();
        List<Employee> employees = Arrays.asList(
                new Employee(14,"sanidhya",400.5),
                new Employee(15, "pratik",899),
                new Employee(16, "Thala", 777.77)
        );
        //dao.insertBatch(employees);
        //dao.deleteBatch(employees);
        dao.updateBatch(employees);
        //FETCH
        //List<Employee> employee =

    }
}
