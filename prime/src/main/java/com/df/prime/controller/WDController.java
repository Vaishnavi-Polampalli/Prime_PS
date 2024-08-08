package com.df.prime.controller;

import com.df.prime.model.WDModel;
import com.df.prime.service.WDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class WDController {

    @Autowired
    WDService service;

    @PutMapping("/select/{prod_id}")
    public String select(@PathVariable int prod_id){
        return service.select(prod_id);
    }

    @GetMapping("/available")
    public List<Integer> available(){
        return service.getAll();
    }

    @GetMapping("/available/{prod_id}")
    public String getAvailability(@PathVariable int prod_id){
        return service.getAvailability(prod_id);
    }

    @GetMapping("/get/{prod_id}")
    public WDModel get(@PathVariable int prod_id){
        return service.get(prod_id);
    }

}
