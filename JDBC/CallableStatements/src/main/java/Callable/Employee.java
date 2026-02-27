package Callable;
import jdk.jfr.DataAmount;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int emp_id;
    private String emp_name;
    private double emp_sal;
    //no need to create getters and setters manually, lombok will do it for us
}
