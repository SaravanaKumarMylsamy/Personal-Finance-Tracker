package com.fin.app.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fin.app.model.Income;
import com.fin.app.repository.IncomeRepository;

@Service
public class IncomeService {

	@Autowired
    private IncomeRepository incomeRepository;

    public Income saveIncome(Income income) {
        return incomeRepository.save(income);
    }

	public List<Income> getAllIncomes() {
		// TODO Auto-generated method stub
		return incomeRepository.findAll();
	}

   
}
