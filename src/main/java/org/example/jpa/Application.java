package org.example.jpa;

import java.util.List;

import org.example.jpa.config.ApplicationConfiguration;
import org.example.jpa.dmo.Comment;
import org.example.jpa.dmo.Employee;
import org.example.jpa.dmo.Topic;
import org.example.jpa.service.EmployeeService;
import org.example.jpa.service.TopicService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ApplicationConfiguration.class);

//        EmployeeService employeeService = context.getBean(EmployeeService.class);

//        employeeService.save(new Employee("Sunil", "Bora", "suni.bora@example.com"));
//        employeeService.save(new Employee("David", "Miller", "david.miller@example.com"));
//        employeeService.save(new Employee("Sameer", "Singh", "sameer.singh@example.com"));
//        employeeService.save(new Employee("Paul", "Smith", "paul.smith@example.com"));

//        List<Employee> employees = employeeService.getAll();
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }

        Topic topic = new Topic();
        topic.setTitle("TEST TITLE");

        Comment comment1 = new Comment();
        comment1.setText("TEST COMMENT 1");
        topic.addComment(comment1);

        Comment comment2 = new Comment();
        comment2.setText("TEST COMMENT 2");
        topic.addComment(comment2);

        Comment comment3 = new Comment();
        comment3.setText("TEST COMMENT 3");
        topic.addComment(comment3);

        Comment comment4 = new Comment();
        comment4.setText("TEST COMMENT 4");
        topic.addComment(comment4);

        Comment comment5 = new Comment();
        comment5.setText("TEST COMMENT 5");
        topic.addComment(comment5);

        Comment comment6 = new Comment();
        comment6.setText("TEST COMMENT 6");
        topic.addComment(comment6);

        TopicService topicService = context.getBean(TopicService.class);
        topicService.save(topic);

        topicService.getById(1L);


        context.close();
    }

}
