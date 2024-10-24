package com.endpoint.data.endpoint_data_oracle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.endpoint.data.endpoint_data_oracle.model.Reports;

@Repository
public interface OracleRepository extends JpaRepository<Reports, Long> { 

    @Query(value = "select from reports where region = ?1")
    List<Reports> findByRegion(String region);

    
}
