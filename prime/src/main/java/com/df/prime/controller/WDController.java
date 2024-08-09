package com.df.prime.controller;

import com.df.prime.model.WDModel;
import com.df.prime.service.WDService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class WDController {

    private static final Logger logger = LogManager.getLogger(WDController.class);

    @Autowired
    WDService service;

    @PutMapping("/select/{id}")
    public String select(@PathVariable int id){
        logger.info("Using washer and dryer if available at:{}", id);
        return service.select(id);
    }

    @GetMapping("/available")
    public List<Integer> available(){
        logger.info("Getting all available times for using washer and dryer");
        List<Integer> result= service.getAll();
        logger.debug("Returning all available times for using washer and dryer: {}",result);
        return result;
    }

    @GetMapping("/available/{id}")
    public String getAvailability(@PathVariable int id){
        logger.info("Checking if washer and dryer are available at time: {}", id);
        String result= service.getAvailability(id);
        logger.debug("Returning availability at time: {}",id);
        return result;
    }

    @GetMapping("/get/{id}")
    public WDModel get(@PathVariable int id){
        logger.info("Checking if washer and dryer are available at {} time", id);
        WDModel result = service.get(id);
        logger.debug("Returning time and its availability: {}",result);
        return result;
    }

}
