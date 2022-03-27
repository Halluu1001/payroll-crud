package com.payroll.service;

//import java.util.ArrayList;
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
	return JobdeptRepository.findById(jobId);
	}
	//saving a specific record by using the method save() of CrudRepository
	public Jobdept saveOrUpdate(Jobdept Jobdepts) 
	{
		JobdeptRepository.save(Jobdepts);
		return Jobdepts;
	}
	//deleting a specific record by using the method deleteById() of CrudRepository
	public String delete(long jobId) 
	{
		JobdeptRepository.deleteById(jobId);
		return "successfully deleted";
	}
	//updating a record
	public String update( long jobId,Jobdept Jobdepts) 
	{
		Jobdept job = JobdeptRepository.findById(jobId);
		job.setJobDept(Jobdepts.getJobDept());
		job.setName(Jobdepts.getName());
		job.setDescription(Jobdepts.getDescription());
		job.setSalaryRange(Jobdepts.getSalaryRange());
		JobdeptRepository.save(job);
		return  "successfully updated";
	}

}
