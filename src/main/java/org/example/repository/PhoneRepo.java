package org.example.repository;

import org.example.model.Person;
import org.example.model.Phone;

import java.util.List;

public interface PhoneRepo {

    void save(Phone phone);

    Phone getById(Long id);

    List getAll();

    void deleteById(Long id);

    void deleteAll();
}
