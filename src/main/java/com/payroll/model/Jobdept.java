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
@Table(name = "jobdept")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Jobdept {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long jobId;
    private String jobDept;
    private String name;
    private String description;
    private String salaryRange;
}
