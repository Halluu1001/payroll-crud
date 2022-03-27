package com.payroll.service;
//import java.util.ArrayList;
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
return payrollRepository.findById(payrollId);
}
//saving a specific record by using the method save() of CrudRepository
public Payroll saveOrUpdate(Payroll payrolls) 
{
	payrollRepository.save(payrolls);
	return payrolls;
}
//deleting a specific record by using the method deleteById() of CrudRepository
public String delete(long payrollId) 
{
	payrollRepository.deleteById(payrollId);
	return "successfully deleted";
}
//updating a record
public String update(long payrollId,Payroll payrolls) 
{
	Payroll payroll = payrollRepository.findById(payrollId);
	payroll.setEmpId(payrolls.getEmpId());
	payroll.setJobId(payrolls.getJobId());
	payroll.setLeaveId(payrolls.getLeaveId());
	payroll.setPayrollId(payrolls.getPayrollId());
	payroll.setSalaryId(payrolls.getSalaryId());
	payroll.setReport(payrolls.getReport());
	payroll.setTotalAmount(payrolls.getTotalAmount());
	payrollRepository.save(payroll);
	return  "successfully updated";
}
}