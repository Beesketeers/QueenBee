package com.beedevelopers.model.dao;

import com.beedevelopers.model.entity.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EventDao extends CrudRepository<Event, Long> {

}
