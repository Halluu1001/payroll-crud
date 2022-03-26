package com.payroll.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "payroll")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Payroll {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long payrollId;
    private long empId;
    private long jobId;
    private long salaryId;
    private long leaveId;
    private String date;
    private String report;
    private double totalAmount;
}