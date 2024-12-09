package application;

import entities.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Person person = em.find(Person.class, 2);

        System.out.println(person);

        System.out.println("Ready!");

        em.close();
        emf.close();
    }
}
