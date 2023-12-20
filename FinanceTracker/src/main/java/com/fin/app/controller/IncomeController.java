package com.fin.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fin.app.model.Income;
import com.fin.app.service.IncomeService;

@RestController
@RequestMapping("/api/incomes")
public class IncomeController {
	
	@Autowired
    private IncomeService incomeService;

    @PostMapping
    public ResponseEntity<Income> addIncome(@RequestBody Income income) {
        Income savedIncome = incomeService.saveIncome(income);
        return new ResponseEntity<>(savedIncome, HttpStatus.CREATED);
    }

    
}
