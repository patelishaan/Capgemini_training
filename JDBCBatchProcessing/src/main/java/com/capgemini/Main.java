package com.capgemini;
import com.capgemini.dao.EmployeeDAO;
import com.capgemini.dao.EmployeeDAOImpl;
import com.capgemini.entity.Employee;

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
