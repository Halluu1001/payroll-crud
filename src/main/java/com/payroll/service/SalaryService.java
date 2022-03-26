package com.payroll.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payroll.model.Salary;
import com.payroll.repository.SalaryRepository;
//defining the business logic
@Service
public class SalaryService {
	@Autowired
	private SalaryRepository SalaryRepository;
	//getting all Salarys record by using the method findaAll() of CrudRepository
	public List<Salary> getallSalarys() 
	{
	//List<Salary> payrolls = new ArrayList<Payroll>();
	//payrollRepository.findAll().forEach(payrolls1 -> payrolls.add(payrolls1));
	//return payrolls;
		return (List<Salary>) SalaryRepository.findAll();
	}
	//getting a specific record by using the method findById() of CrudRepository
	public Salary getSalarysById(long salaryId) 
	{
	return SalaryRepository.findById(salaryId).get();
	}
	//saving a specific record by using the method save() of CrudRepository
	public Salary saveOrUpdate(Salary Salarys) 
	{
		SalaryRepository.save(Salarys);
		return Salarys;
	}
	//deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(long salaryId) 
	{
		SalaryRepository.deleteById(salaryId);
	}
	//updating a record
	public void update(Salary Salarys, long salaryId) 
	{
		SalaryRepository.save(Salarys);
	}


}
