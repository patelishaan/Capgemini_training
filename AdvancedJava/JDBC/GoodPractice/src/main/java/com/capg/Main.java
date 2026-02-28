package com.capg;
import com.capg.dao.EmployeeDAO;
import com.capg.dao.EmployeeDAOImpl;
import com.capg.entity.Employee;

import java.util.List;

public class Main {
    public static void main(String[] args){
        EmployeeDAO dao = new EmployeeDAOImpl();
        //INSERT
        dao.insertEmployee(new Employee(17,"Ishaan",28000));
        //UPDATE
        dao.updateEmployee("Patel",12);
        //FETCH
        //List<Employee> employee =

    }
}
