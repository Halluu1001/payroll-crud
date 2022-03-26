package com.payroll.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payroll.model.Jobdept;
import com.payroll.repository.JobdeptRepository;
//defining the business logic
@Service
public class JobdeptService {
	@Autowired
	private JobdeptRepository JobdeptRepository;
	//getting all Jobdepts record by using the method findaAll() of CrudRepository
	public List<Jobdept> getallJobdepts() 
	{
	//List<Jobdept> payrolls = new ArrayList<Payroll>();
	//payrollRepository.findAll().forEach(payrolls1 -> payrolls.add(payrolls1));
	//return payrolls;
		return (List<Jobdept>) JobdeptRepository.findAll();
	}
	//getting a specific record by using the method findById() of CrudRepository
	public Jobdept getJobdeptsById(long jobId) 
	{
	return JobdeptRepository.findById(jobId).get();
	}
	//saving a specific record by using the method save() of CrudRepository
	public Jobdept saveOrUpdate(Jobdept Jobdepts) 
	{
		JobdeptRepository.save(Jobdepts);
		return Jobdepts;
	}
	//deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(long jobId) 
	{
		JobdeptRepository.deleteById(jobId);
	}
	//updating a record
	public void update(Jobdept Jobdepts, long jobId) 
	{
		JobdeptRepository.save(Jobdepts);
	}

}
