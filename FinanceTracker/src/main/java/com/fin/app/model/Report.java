package com.fin.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Report {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   
    private Long totalIncome;
    private Long totalExpense;
    private Long netIncome;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getTotalIncome() {
		return totalIncome;
	}
	public void setTotalIncome(Long totalIncome) {
		this.totalIncome = totalIncome;
	}
	public Long getTotalExpense() {
		return totalExpense;
	}
	public void setTotalExpense(Long totalExpense) {
		this.totalExpense = totalExpense;
	}
	public Long getNetIncome() {
		return netIncome;
	}
	public void setNetIncome(Long netIncome) {
		this.netIncome = netIncome;
	}

}
