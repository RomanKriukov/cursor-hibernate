package org.example.jpa.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.example.jpa.dmo.Comment;
import org.springframework.stereotype.Component;

@Component
public class CommentDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Comment comment) {
        entityManager.persist(comment);
    }

    public Comment getById(Long id) {
        return entityManager.find(Comment.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Comment> getAll() {
        return entityManager.createQuery("SELECT c FROM Comment c").getResultList();
    }


}
