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

import com.payroll.model.Jobdept;
import com.payroll.service.JobdeptService;

@RestController
public class JobdeptController {
	@Autowired
	private JobdeptService JobdeptsService;
	//creating a get mapping that retrieves all the Jobdept detail from the database 
	@GetMapping("/Jobdept")
	public List<Jobdept> getAllJobdepts() 
	{
	return JobdeptsService.getallJobdepts();
	}
	//creating a get mapping that retrieves the detail of a specific Jobdept
	@GetMapping("/Jobdept/{jobId}")
	public Jobdept getJobdepts(@PathVariable("jobId") long jobId) 
	{
	return JobdeptsService.getJobdeptsById(jobId);
	}
	//creating a delete mapping that deletes a specified Jobdept
	@DeleteMapping("/Jobdept/{jobId}")
	public void deleteJobdept(@PathVariable("jobId") long jobId) 
	{
	JobdeptsService.delete(jobId);
	}
	//creating post mapping that post the Jobdept detail in the database
	@PostMapping("/Jobdepts")
	public Jobdept saveJobdept(@Valid @RequestBody Jobdept Jobdepts) 
	{
	JobdeptsService.saveOrUpdate(Jobdepts);
	return Jobdepts;
	}
	//creating put mapping that updates the Jobdept detail 
	@PutMapping("/Jobdepts")
	public Jobdept update(@RequestBody Jobdept Jobdepts) 
	{
	JobdeptsService.saveOrUpdate(Jobdepts);
	return Jobdepts;
	}
}
