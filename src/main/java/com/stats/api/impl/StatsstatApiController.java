package com.stats.api.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.api.StatsstatApi;
import io.swagger.model.Dataset;
import io.swagger.model.DatasetFieldDefinition;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-29T00:56:50.235Z[GMT]")
@RestController
public class StatsstatApiController implements StatsstatApi {

    private static final Logger log = LoggerFactory.getLogger(StatsstatApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public StatsstatApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Dataset>> getAllAvailableDatasetsGET() {
        List<Dataset> datasets = new ArrayList<>();

        long now = (System.currentTimeMillis()/1000);

        IntStream.range(0, 10).forEach(i -> {

            Dataset tmp = new Dataset();
            tmp.setDescription("This is an example of a description " + i);
            tmp.setLastUpdated((long)(now-(Math.random()*(now - 504667801))));
            tmp.setName("Mock Dataset Number: " + i);
            tmp.setRecordCount((long)(Math.random()*85000));
            List<DatasetFieldDefinition> defs = new ArrayList<>();
            IntStream.range(0, (int)(Math.random()*20)).forEach(n -> {
                DatasetFieldDefinition tmpdef = new DatasetFieldDefinition();
                if(Math.random() >= 0.5){
                    tmpdef.setDatatype("String");
                    tmpdef.setFieldName("Field number " + n + " in Dataset " + i + " of type String");
                }else{
                    tmpdef.setDatatype("Integer");
                    tmpdef.setFieldName("Field number " + n + " in Dataset " + i + " of type Integer");
                }
                defs.add(tmpdef);
            });

            tmp.setIndexableField(defs);
            datasets.add(tmp);
        });
        
        return new ResponseEntity<List<Dataset>>(datasets, HttpStatus.OK);
    }

}
