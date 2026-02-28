package Stream;

import java.util.*;

public class Employee {

    private int id;
    private String name;
    private String department;
    private String jobTitle;
    private int age;
    private int yearsOfExperience;
    private double salary;
    private int performanceRating;
    private int joining_date;
    private int jobid;

    public Employee(int id, String name, String department, String jobTitle, int age,
                    int yearsOfExperience, double salary, int performanceRating, int joining_date, int jobid){
        this.id = id;
        this.name = name;
        this.department = department;
        this.jobTitle = jobTitle;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
        this.performanceRating = performanceRating;
        this.joining_date = joining_date;
        this.jobid = jobid;
    }

    public String getName() { return name; }
    public String getJobTitle() { return jobTitle; }
    public double getSalary() { return salary; }
    public int getYearsOfExperience() { return yearsOfExperience; }
    public int getPerformanceRating() { return performanceRating; }
    public int getJoining_date(){ return joining_date;}

    public int getJobid() {
        return jobid;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"ravi","IT","Manager",30,5,30000,9,20260113,1234));

        //TASK 1 METHOD

    }
}
