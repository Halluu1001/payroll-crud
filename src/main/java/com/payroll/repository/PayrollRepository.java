package com.payroll.repository;
import org.springframework.data.repository.CrudRepository;

import com.payroll.model.Payroll;
public interface PayrollRepository extends CrudRepository<Payroll, Long>
{
	Payroll findById(long payrollId);
}
