package com.fin.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fin.app.model.Expense;
import com.fin.app.model.Income;
import com.fin.app.model.Report;
import com.fin.app.repository.ReportRepository;

@Service
public class ReportService {

	@Autowired
	private ReportRepository reportRepository;

	@Autowired
	private IncomeService incomeService;

	@Autowired
	private ExpenseService expenseService;

	public Report generateFinancialReport() {
		Report report = new Report();

		// Calculate total income
		List<Income> incomes = incomeService.getAllIncomes();
		long totalIncome = incomes.stream().mapToLong(Income::getAmount).sum();
		report.setTotalIncome(totalIncome);

		// Calculate total expense
		List<Expense> expenses = expenseService.getAllExpenses();
		long totalExpense = expenses.stream().mapToLong(Expense::getAmount).sum();
		report.setTotalExpense(totalExpense);

		// Calculate net income
		report.setNetIncome(totalIncome - totalExpense);

		return report;
	}

	public Report saveReport(Report report) {
		return reportRepository.save(report);
	}

	public Optional<Report> getReportById(Long id) {
		return reportRepository.findById(id);
	}

	public List<Report> getAllReports() {
		return reportRepository.findAll();
	}
}
