package org.example.jpa.service;

import java.util.List;

import org.example.jpa.dao.EmployeeDao;
import org.example.jpa.dmo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Transactional
    public void save(Employee person) {
        employeeDao.save(person);
    }

    @Transactional(readOnly = true)
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }


}
