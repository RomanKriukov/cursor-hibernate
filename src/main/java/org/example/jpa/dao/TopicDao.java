package org.example.jpa.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.example.jpa.dmo.Topic;
import org.springframework.stereotype.Component;

@Component
public class TopicDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Topic topic) {
        entityManager.persist(topic);
    }

    public Topic getById(Long id) {
        return entityManager.find(Topic.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Topic> getAll() {
        return entityManager.createQuery("SELECT t FROM Topic t").getResultList();
    }


}
