package com.beedevelopers.service;

import com.beedevelopers.model.entity.Labels;

public interface ILabels {

    Labels save(Labels labels);

    Labels findById(Long id);

    void delete(Labels labels);

}
