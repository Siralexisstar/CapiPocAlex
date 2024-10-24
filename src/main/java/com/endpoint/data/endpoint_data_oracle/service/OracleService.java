package com.endpoint.data.endpoint_data_oracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endpoint.data.endpoint_data_oracle.model.Reports;
import com.endpoint.data.endpoint_data_oracle.repository.OracleRepository;

@Service
public class OracleService {

    @Autowired
    public OracleRepository oracleRepository;


    public List<Reports> findAll() {
        return oracleRepository.findAll();
    }

    public List<Reports> findByRegion(String region) {
        return oracleRepository.findByRegion(region);
    }

    
}
