package com.payroll.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

import com.payroll.model.Salary;
import com.payroll.service.SalaryService;

@RestController
public class SalaryController {
	@Autowired
	private SalaryService SalarysService;
	//creating a get mapping that retrieves all the Salary detail from the database 
	@GetMapping("/Salary")
	public List<Salary> getAllSalarys() 
	{
	return SalarysService.getallSalarys();
	}
	//creating a get mapping that retrieves the detail of a specific Salary
	@GetMapping("/Salary/{salaryId}")
	public Salary getSalarys(@PathVariable("salaryId") long salaryId) 
	{
	return SalarysService.getSalarysById(salaryId);
	}
	//creating a delete mapping that deletes a specified Salary
	@DeleteMapping("/Salary/{salaryId}")
	public void deleteSalary(@PathVariable("salaryId") long salaryId) 
	{
	SalarysService.delete(salaryId);
	}
	//creating post mapping that post the Salary detail in the database
	@PostMapping("/Salarys")
	public Salary saveSalary(@Valid @RequestBody Salary Salarys) 
	{
	SalarysService.saveOrUpdate(Salarys);
	return Salarys;
	}
	//creating put mapping that updates the Salary detail 
	@PutMapping("/Salarys")
	public Salary update(@RequestBody Salary Salarys) 
	{
	SalarysService.saveOrUpdate(Salarys);
	return Salarys;
	}


}
