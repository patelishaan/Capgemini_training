package Callable;

import java.sql.CallableStatement;
import java.sql.Connection;

public class EmployeeService {
    public void InsertEmployeeS(int id,String name, double salary) throws Exception {
        String sql = "{CALL InsertEmployeeS(?,?,?)}";
        try(Connection conn = DatabaseUtil.getConnection();
            CallableStatement stmt = conn.prepareCall(sql))
        {
                stmt.setInt(1,id);
                stmt.setString(2,name);
                stmt.setDouble(3,salary);
                stmt.execute();
                System.out.println("employee inserted successfully");

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
