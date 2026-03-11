package iocwithxml;

import dependencyinjection.Book;
import dependencyinjection.Library;
import dependencyinjection.Library1;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App {
    public static void main(String[] args) {
        BeanFactory beanFactory1 = new XmlBeanFactory(new ClassPathResource("beans_configuration_1.xml"));
        Employee e2 = (Employee) beanFactory1.getBean("emp01");
        System.out.println(e2);

        BeanFactory beanFactory2 = new XmlBeanFactory(new ClassPathResource("beans_configuration_1.xml"));
        Employee e3 = (Employee) beanFactory2.getBean("emp02");
        System.out.println(e3);

        BeanFactory beanFactory3 = new XmlBeanFactory(new ClassPathResource("dependency_injection.xml"));
        Book book1 = (Book) beanFactory3.getBean("B1");
        System.out.println(book1);

        BeanFactory beanFactory4 = new XmlBeanFactory(new ClassPathResource("list_dependency_injection.xml"));
        Library1 Lib1 = (Library1) beanFactory4.getBean("Lib1");
        System.out.println(Lib1);


//        Employee emp2 = (Employee) beanFactory1.getBean("bean_id");
//        System.out.println(emp2);
//
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans_configuration_1.xml");
//        Employee emp3 = (Employee) context.getBean("bean_id");
//        System.out.println(emp3);

    }
}
