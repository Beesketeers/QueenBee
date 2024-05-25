package com.beedevelopers.service.impl;

import com.beedevelopers.model.dao.LocationDao;
import com.beedevelopers.model.entity.Location;
import com.beedevelopers.service.ILocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LocationImpl implements ILocation {

    @Autowired
    private LocationDao locationDao;

    @Transactional
    @Override
    public Location save(Location location) {
        return locationDao.save(location);
    }

    @Transactional(readOnly = true)
    @Override
    public Location findById(Long id) {
        return locationDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Location location) {
        locationDao.delete(location);
    }
}
