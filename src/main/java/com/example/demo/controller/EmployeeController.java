package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @PostMapping
    public ResponseEntity addEmployee(){
        System.out.println("--------- add employee ------------");
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public String getEmployee() {
        return"--------- get Employee ------------";
    }
}
