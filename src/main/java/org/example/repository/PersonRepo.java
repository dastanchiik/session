package org.example.repository;

import org.example.model.Person;

import java.util.List;

public interface PersonRepo {

    void save(Person person);

    Person getById(Long id);

    List getAll();

    void deleteById(Long id);

    void deleteAll();
}
