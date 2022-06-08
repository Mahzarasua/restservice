package com.mahzarasua.restservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Slf4j
@RequestMapping(value = "/api/v1/service", produces = MediaType.APPLICATION_JSON_VALUE)
public class Restcontroller {

    public static final String WELCOME_MSG = "Welcome to this beautiful service";

    @GetMapping(value = {""})
    @ResponseStatus(HttpStatus.OK)
    public String getHello(){
        log.info("getHello method started: " + LocalDateTime.now());
        return WELCOME_MSG;
    }

    @GetMapping(value = "/{name}")
    @ResponseStatus(HttpStatus.OK)
    public String getHelloPath(@PathVariable String name){
        log.info("getHelloPath method started: " + LocalDateTime.now());
        if(name == null) throw new RuntimeException("Name must be provided");
        return "Hi " + name + " " + WELCOME_MSG;
    }

    @GetMapping(value = "/")
    @ResponseStatus(HttpStatus.OK)
    public String getHelloQuery(@RequestParam(required = false) String name){
        log.info("getHelloQuery method started: " + LocalDateTime.now());
        if(name == null) return getHello();
        return "Hi " + name + " " + WELCOME_MSG;
    }

}
