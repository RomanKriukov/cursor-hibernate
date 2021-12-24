package org.example.jpa.service;

import java.util.List;

import org.example.jpa.dao.CommentDao;
import org.example.jpa.dmo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class CommentService {

    @Autowired
    private CommentDao commentDao;

    @Transactional
    public void save(Comment comment) {
        commentDao.save(comment);
    }

    @Transactional(readOnly = true)
    public List<Comment> getAll() {
        return commentDao.getAll();
    }

}
