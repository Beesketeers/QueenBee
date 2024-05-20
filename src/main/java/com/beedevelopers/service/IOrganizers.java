package com.beedevelopers.service;

import com.beedevelopers.model.entity.Organizers;

public interface IOrganizers {

    Organizers save(Organizers organizers);

    Organizers findById(Long id);

    void delete(Organizers organizers);

}
