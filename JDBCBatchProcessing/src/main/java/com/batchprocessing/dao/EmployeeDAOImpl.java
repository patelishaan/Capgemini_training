package com.batchprocessing.dao;
import com.batchprocessing.entity.Employee;
import com.batchprocessing.repository.EmployeeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO{
    public void insertEmployee(Employee emp){
        String sql = "INSERT INTO employees VALUES (?,?,?)";
        try(Connection conn= EmployeeRepository.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql)){
            pst.setInt(1,emp.getEmp_id());
            pst.setString(2,emp.getEmpName());
            pst.setDouble(3,emp.getEmpSal());
            pst.executeUpdate();
            System.out.println("player inserted");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void updateEmployee(String newname, int old_id){
        String sql = "UPDATE EMPLOYEES SET emp_name = ? WHERE emp_id=?";
        try(Connection conn= EmployeeRepository.getConnection();
            PreparedStatement st1 = conn.prepareStatement(sql)){
            st1.setString(1,newname);
            st1.setInt(2,old_id);
            st1.executeUpdate();
            System.out.println("employee updated");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void insertBatch(List<Employee> emps) throws SQLException {
        Connection connection = EmployeeRepository.getConnection();
        String insertQuery = "INSERT INTO employees VALUES(?,?,?)";
        PreparedStatement st = connection.prepareStatement(insertQuery);
        for(Employee e:emps){
            st.setInt(1,e.getEmp_id());
            st.setString(2,e.getEmpName());
            st.setDouble(3,e.getEmpSal());
            st.addBatch();
        }
        int[] result = st.executeBatch();
        System.out.println("Inserted Rows:"+result.length);
        connection.close();

    }
}
