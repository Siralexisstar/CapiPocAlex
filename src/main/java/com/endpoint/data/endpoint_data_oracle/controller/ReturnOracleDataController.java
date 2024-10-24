package com.endpoint.data.endpoint_data_oracle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.endpoint.data.endpoint_data_oracle.model.Reports;
import com.endpoint.data.endpoint_data_oracle.service.OracleService;

@RestController
@RequestMapping("/returnData")
public class ReturnOracleDataController {

    @Autowired
    public OracleService oracleService;

    @GetMapping("/AllData")
    public ResponseEntity<List<Reports>> returnAllData() {

        List<Reports> all = oracleService.findAll();

        return new ResponseEntity<>(all, HttpStatus.OK);

    

    @GetMapping("/region/{region}")
    public ResponseEntity<List<Reports>> returnDataByRegion(@PathVariable String region) {

        List<Reports> byRegion = oracleService.findByRegion(region);

        return new ResponseEntity<>(byRegion, HttpStatus.OK);
    }

}
