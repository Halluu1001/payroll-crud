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
@Table(name = "salary")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Salary {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long salaryId;
    private long jobId;
    private double amount;
    private double annual;
    private double bonus;
}
