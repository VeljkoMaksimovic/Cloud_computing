package com.example.demo.controllers;

import com.example.demo.model.Counter;
import com.example.demo.repository.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RequestMapping("/hi")
@Controller
public class HiController {

    @Autowired
    CounterRepository counterRepository;

    @GetMapping()
    public ResponseEntity<String> hiMethod(){
        Counter counter = counterRepository.findAll().get(0);
        Integer number = counter.getNumber();
        counter.setNumber(number+1);
        counterRepository.save(counter);
        return new ResponseEntity<>("Hi " + number, HttpStatus.OK);
    }
}
