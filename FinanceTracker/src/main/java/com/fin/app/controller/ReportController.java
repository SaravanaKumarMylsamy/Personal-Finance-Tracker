package com.fin.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fin.app.model.Report;
import com.fin.app.service.ReportService;

@RestController
@RequestMapping("/api/reports")
public class ReportController {
    @Autowired
    private ReportService reportService;

    @GetMapping
    public ResponseEntity<List<Report>> getAllReports() {
        List<Report> reports = reportService.getAllReports();
        return new ResponseEntity<>(reports, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Report> generateFinancialReport() {
        // Generate and save the report
        Report generatedReport = reportService.generateFinancialReport();
        return new ResponseEntity<>(reportService.saveReport(generatedReport), HttpStatus.CREATED);
    }
}

