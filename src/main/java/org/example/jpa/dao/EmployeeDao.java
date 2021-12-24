package org.example.jpa.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.example.jpa.dmo.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Employee employee) {
        entityManager.persist(employee);
    }

    public Employee getById(Long id) {
        return entityManager.find(Employee.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Employee> getAll() {
        return entityManager.createQuery("SELECT e FROM Employee e").getResultList();
    }

}
