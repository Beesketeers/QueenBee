package com.beedevelopers.service.impl;

import com.beedevelopers.model.dao.LabelsDao;
import com.beedevelopers.model.entity.Labels;
import com.beedevelopers.service.ILabels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LabelsImpl implements ILabels {

    @Autowired
    private LabelsDao labelsDao;

    @Transactional
    @Override
    public Labels save(Labels labels) {
        return labelsDao.save(labels);
    }

    @Transactional(readOnly = true)
    @Override
    public Labels findById(Long id) {
        return labelsDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Labels labels) {
        labelsDao.delete(labels);
    }
}
