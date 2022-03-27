package com.payroll.repository;

import org.springframework.data.repository.CrudRepository;

import com.payroll.model.Salary;

public interface SalaryRepository extends CrudRepository<Salary, Long> 
{
	Salary findById(long salaryId);
}
