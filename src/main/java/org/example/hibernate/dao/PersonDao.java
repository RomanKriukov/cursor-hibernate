package org.example.hibernate.dao;

import java.util.List;

import org.example.hibernate.dmo.Person;

public interface PersonDao {

    void save(Person p);

    List<Person> list();

}
