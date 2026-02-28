package com.capgemini.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeeRepository {
    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_schema",
                    "root",
                    "IshaaN310#"
            );
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
