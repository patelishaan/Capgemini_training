package annotation_configuration.entity;

import annotation_configuration.configuration.AppConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("${id}")
    private int id;

    @Value("${name}")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student{"+
                "id="+id+
                ", name="+name+'\''+"}";
    }
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Student stu = applicationContext.getBean(Student.class);
        System.out.println(stu);
    }
}
