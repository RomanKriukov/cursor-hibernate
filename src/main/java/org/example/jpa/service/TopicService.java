package org.example.jpa.service;

import java.util.List;

import org.example.jpa.dao.TopicDao;
import org.example.jpa.dmo.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TopicService {

    @Autowired
    private TopicDao topicDao;

    @Transactional
    public void save(Topic topic) {
        topicDao.save(topic);
    }

    @Transactional
    public void getById(Long id) {
        topicDao.getById(id);
    }

    @Transactional(readOnly = true)
    public List<Topic> getAll() {
        return topicDao.getAll();
    }


}
