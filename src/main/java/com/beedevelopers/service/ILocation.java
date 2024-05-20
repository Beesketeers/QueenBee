package com.beedevelopers.service;

import com.beedevelopers.model.entity.Location;

public interface ILocation {

    Location save(Location location);

    Location findById(Long id);

    void delete(Location location);

}
