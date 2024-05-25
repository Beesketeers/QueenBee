package com.beedevelopers.service;

import com.beedevelopers.model.entity.Event;

public interface IEvent {

    Event save(Event event);

    Event findById(Long id);

    void delete(Event event);

}
