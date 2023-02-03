package org.example.repository;

import org.example.configuration.Util;
import org.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.transaction.Transactional;
import java.util.List;

@Transactional

public class PersonImpl implements PersonRepo {
    private final SessionFactory connection = Util.getConnection();
    @Override
    public void save(Person person) {
        try (Session session = connection.openSession()){
            session.save(person);
        }
    }

    @Override
    public Person getById(Long id) {
        try (Session session = connection.openSession()){

        return session.get(Person.class,id);
        }
    }

    @Override
    public List getAll() {
        try (Session session = connection.openSession()){
        return session.createQuery("select p from Person p").getResultList();
        }
    }

    @Override
    public void deleteById(Long id) {
       try (Session session = connection.openSession()){
           session.beginTransaction();
           Person person = getById(id);
            session.delete(person);
            session.getTransaction().commit();
       }
    }

    @Override
    public void deleteAll() {
    try (Session session = connection.openSession()){
        session.beginTransaction();
        session.createQuery("delete from Person p");
        session.getTransaction().commit();
    }
    }
}
