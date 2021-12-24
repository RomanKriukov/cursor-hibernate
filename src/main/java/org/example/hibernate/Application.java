package org.example.hibernate;

import java.util.List;

import org.example.hibernate.dao.PersonDao;
import org.example.hibernate.dmo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("org.example.hibernate");

        PersonDao personDAO = context.getBean("personDao", PersonDao.class);

        Person person = getPerson("Pankaj", "India");
        personDAO.save(person);

        Person person2 = getPerson("Ivan", "Ukraine");
        personDAO.save(person2);

        Person person3 = getPerson("Stive", "USA");
        personDAO.save(person3);


        List<Person> list = personDAO.list();

        for (Person p : list) {
            System.out.println("Person List::" + p);
        }
    }

    private static Person getPerson(String name, String country) {
        Person person = new Person();
        person.setName(name);
        person.setCountry(country);
        return person;
    }

}
