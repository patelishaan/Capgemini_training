package com.batchprocessing;
import com.batchprocessing.dao.EmployeeDAO;
import com.batchprocessing.dao.EmployeeDAOImpl;
import com.batchprocessing.entity.Employee;

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
