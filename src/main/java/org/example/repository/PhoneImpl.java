package org.example.repository;

import org.example.configuration.Util;
import org.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class PhoneImpl implements PhoneRepo{
    private static SessionFactory connection = Util.getConnection();


    @Override
    public void save(org.example.model.Phone phone) {
        try (Session session = connection.openSession()){
            session.save(phone);
        }
    }

    @Override
    public org.example.model.Phone getById(Long id) {
        return null;
    }

    @Override
    public List getAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {
    try (Session session = connection.openSession()){
        session.beginTransaction();
        session.delete(session.get(Person.class,id));
        session.getTransaction().commit();
    }
    }

    @Override
    public void deleteAll() {

    }
}
