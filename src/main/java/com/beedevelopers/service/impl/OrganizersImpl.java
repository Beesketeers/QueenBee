package com.beedevelopers.service.impl;

import com.beedevelopers.model.dao.OrganizersDao;
import com.beedevelopers.model.entity.Organizers;
import com.beedevelopers.service.IOrganizers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrganizersImpl implements IOrganizers {

    @Autowired
    private OrganizersDao organizersDao;

    @Transactional
    @Override
    public Organizers save(Organizers organizers) {
        return organizersDao.save(organizers);
    }

    @Transactional(readOnly = true)
    @Override
    public Organizers findById(Long id) {
        return organizersDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Organizers organizers) {
        organizersDao.delete(organizers);
    }
}
