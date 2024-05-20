package com.beedevelopers.model.dao;

import com.beedevelopers.model.entity.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationDao extends CrudRepository<Location, Long> {

}
