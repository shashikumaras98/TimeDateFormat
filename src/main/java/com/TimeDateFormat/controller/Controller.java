package com.TimeDateFormat.controller;

import com.TimeDateFormat.Service.ServiceImpl;
import com.TimeDateFormat.entity.BusOperator;
import com.TimeDateFormat.payload.BusOperatorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/date_time")
public class Controller {

    @Autowired
    private ServiceImpl service;

    @PostMapping
    public BusOperatorDto save(@RequestBody BusOperatorDto busOperatorDto){

        BusOperatorDto dto = service.save(busOperatorDto);

        return dto;
    }
}
