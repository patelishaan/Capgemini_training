package com.capgemini.repository;

import com.capgemini.entity.Student;
import org.hibernate.SessionFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class StudentRepository {
    private static SessionFactory sessionFactory;
    static {
        Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
        sessionFactory = config.buildSessionFactory();
    }
    public static Session getSession(){
        return sessionFactory.openSession();
    }
}
