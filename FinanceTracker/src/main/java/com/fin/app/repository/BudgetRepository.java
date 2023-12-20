package com.fin.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fin.app.model.Budget;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long> {

}
