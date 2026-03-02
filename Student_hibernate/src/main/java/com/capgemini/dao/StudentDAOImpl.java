package com.capgemini.dao;

import com.capgemini.entity.Student;
import com.capgemini.repository.StudentRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

//import java.util.List;

public class StudentDAOImpl implements StudentDAO{
    @Override
    public void save(Student student){
        Session session = StudentRepository.getSession();
        Transaction tx = session.beginTransaction();
        session.persist(student);
        tx.commit();
        session.close();
    }
    @Override
    public List<Student> fetchAll(){
        Session session = StudentRepository.getSession();
        List<Student> list = session.createQuery("from Student", Student.class).list();
        session.close();
        return list;
    }

    @Override
    public Student fetchById(int id){
        Session session = StudentRepository.getSession();
        Student s = session.createQuery("from Student where id=:id",Student.class).setParameter("id",id).uniqueResult();
        session.close();
        return s;
    }
    @Override
    public void updateMarks(int id, double marks){
        Session session = StudentRepository.getSession();
        Transaction tx = session.beginTransaction();

        session.createQuery("update Student set marks=:marks where id=:id")
                .setParameter("marks",marks).setParameter("id",id).executeUpdate();;
    }
    @Override
    public List<Student> sortByMarks(){
        Session session = StudentRepository.getSession();
        List<Student> list =
                session.createQuery("from Student order by marks",Student.class).list();
        session.close();
        return list;
    }
    @Override
    public List<Student> sortByAgeDesc(){
        Session session = StudentRepository.getSession();
        List<Student> list = session.createQuery("from Student order by age desc",Student.class).list();
        session.close();
        return list;
    }
    @Override
    public List<Student> filterByDept(String dept){
        Session session = StudentRepository.getSession();
        List<Student> list = session.createQuery("from Student where dept=:d",Student.class)
                .setParameter("d",dept)
                .list();
        session.close();
        return list;
    }
    @Override
    public List<Student> nativeFetch(){
        Session session = StudentRepository.getSession();
        List<Student> list = session.createNativeQuery("SELECT * FROM student", Student.class).list();
        session.close();
        return list;
    }
    @Override
    public void nativeUpdateMarks(int id, double marks){
        Session session = StudentRepository.getSession();
        Transaction tx = session.beginTransaction();
        session.createNativeQuery("UPDATE STUDENT SET MARKS=:m where id=:id")
                .setParameter("m",marks)
                .setParameter("id",id)
                .executeUpdate();
        tx.commit();
        session.close();
    }
}
