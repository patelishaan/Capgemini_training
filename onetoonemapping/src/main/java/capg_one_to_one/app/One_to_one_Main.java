package capg_one_to_one.app;

import capg_one_to_one.entity.Pan;
import capg_one_to_one.entity.Person1;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class One_to_one_Main{
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.setId(1);
        p1.setName("Ishaan");

        Pan pan = new Pan();
        pan.setPanNumber(1);
        pan.setPanAddress("noida");

        p1.setPan(pan);
        pan.setPerson1(p1);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(pan);
        entityManager.persist(p1);
        entityTransaction.commit();
    }
}
