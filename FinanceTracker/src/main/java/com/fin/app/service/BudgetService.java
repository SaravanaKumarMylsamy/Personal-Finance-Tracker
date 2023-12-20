package com.fin.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fin.app.model.Budget;
import com.fin.app.repository.BudgetRepository;

@Service
public class BudgetService {
	
	@Autowired
    private BudgetRepository budgetRepository;

    public Budget saveBudget(Budget budget) {
        return budgetRepository.save(budget);
    }


    public List<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }

}
