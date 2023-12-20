package com.fin.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fin.app.model.Income;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {

}
