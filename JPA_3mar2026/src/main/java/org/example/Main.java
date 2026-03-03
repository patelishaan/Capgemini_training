package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class Main {
    public static void main(String[] args){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        //--------SAVE-------
        entityTransaction.begin();
        Person p1 = new Person();
        p1.setId(7012);
        p1.setName("Rakesh");
        p1.setSalary(1.2);
        entityManager.persist(p1);

        Person person = new Person();
        person.setId(5555);
        person.setName("jethalal");
        person.setSalary(2.3);
        entityManager.persist(person);

        Person person2 = entityManager.find(Person.class,1);
        System.out.println(person2);

        List<Person> list = entityManager.createQuery("from Person", Person.class).getResultList();
        for(Person p:list){
            System.out.println(p);
        }
        entityTransaction.commit();
//        //UPDATE
//        entityTransaction.begin();
//        Person person = entityManager.find(Person.class,12);
//        person.setSalary(12.55);
//        entityManager.merge(person);
//        entityTransaction.commit();
//        //DELETE
//        entityTransaction.begin();
//        Person person1 = entityManager.find(Person.class, 13);
//        entityManager.remove(person1);
//        entityTransaction.commit();



    }

}
