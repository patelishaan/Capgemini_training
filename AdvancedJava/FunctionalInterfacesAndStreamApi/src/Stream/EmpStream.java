package Stream;

import java.time.Year;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class EmpStream {
    public static List<Integer> task2(List<Employee> employees){
        int curr_year = Year.now().getValue();
        return employees.stream()
                .filter(e->(curr_year-e.getJoining_date()>=5
                && e.getPerformanceRating()<8
                && e.getSalary()>=60000
                && e.getSalary()<=120000))
                .sorted(Comparator.comparing(Employee::getSalary).thenComparing(Comparator.comparing(Employee::getYearsOfExperience).reversed()))
                //COLLECT
                .map(e->e.getJobid()*10)
                //.map(Employee::getName)
                .collect(Collectors.toList());
    }

    public static List<String> task1(List<Employee> employees){
        int curr_year = Year.now().getValue();
        return employees.stream()
                .filter(emp->emp.getJobTitle().equalsIgnoreCase("Manager"))
                .filter(emp->emp.getSalary()>100000)
                .filter(emp->(curr_year-emp.getJoining_date())<=3)

                //sort by experience in descending then performance ascending
                .sorted(Comparator.comparing((Employee e)->e.getYearsOfExperience()).reversed().thenComparing(e->e.getPerformanceRating()))

                //REVERSE AND CONVERT TO UPPERCASE
                .map(e->new StringBuilder(e.getName())
                        .reverse()
                        .toString()
                        .toUpperCase())
                //collect
                .collect(Collectors.toList());

    }
}
