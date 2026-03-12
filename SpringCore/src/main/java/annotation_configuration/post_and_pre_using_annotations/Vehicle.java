package annotation_configuration.post_and_pre_using_annotations;

import annotation_configuration.configuration.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Vehicle {
    public Vehicle(){
        System.out.println("vehicle()");
    }
    @PostConstruct
    public void moving(){
        System.out.println("vehicle is moving");
    }
    @PreDestroy
    public void accident(){
        System.out.println("thank god everyone's dead");
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Vehicle v= applicationContext.getBean(Vehicle.class);
        System.out.println(v);

    }
}
