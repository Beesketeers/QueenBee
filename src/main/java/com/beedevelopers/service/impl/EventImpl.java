package com.beedevelopers.service.impl;

import com.beedevelopers.model.dao.EventDao;
import com.beedevelopers.model.entity.Event;
import com.beedevelopers.service.IEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EventImpl implements IEvent {

    @Autowired
    private EventDao eventDao;

    @Transactional
    @Override
    public Event save(Event event) {
        return eventDao.save(event);
    }

    @Transactional(readOnly = true)
    @Override
    public Event findById(Long id) {
        return eventDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Event event) {
        eventDao.delete(event);
    }
}
