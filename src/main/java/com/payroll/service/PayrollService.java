package com.payroll.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payroll.model.Payroll;
import com.payroll.repository.PayrollRepository;
//defining the business logic
@Service
public class PayrollService 
{
@Autowired
private PayrollRepository payrollRepository;
//getting all payrolls record by using the method findaAll() of CrudRepository
public List<Payroll> getallPayrolls() 
{
//List<Payroll> payrolls = new ArrayList<Payroll>();
//payrollRepository.findAll().forEach(payrolls1 -> payrolls.add(payrolls1));
//return payrolls;
	return (List<Payroll>) payrollRepository.findAll();
}
//getting a specific record by using the method findById() of CrudRepository
public Payroll getpayrollsById(long payrollId) 
{
return payrollRepository.findById(payrollId).get();
}
//saving a specific record by using the method save() of CrudRepository
public Payroll saveOrUpdate(Payroll payrolls) 
{
	payrollRepository.save(payrolls);
	return payrolls;
}
//deleting a specific record by using the method deleteById() of CrudRepository
public void delete(long payrollId) 
{
	payrollRepository.deleteById(payrollId);
}
//updating a record
public void update(Payroll payrolls, long payrollId) 
{
	payrollRepository.save(payrolls);
}
}