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

import com.payroll.model.Payroll;
import com.payroll.service.PayrollService;
//mark class as Controller
@RestController
public class PayrollController 
{
//autowire the payrollsService class
@Autowired
private PayrollService payrollsService;
//creating a get mapping that retrieves all the payrolls detail from the database 
@GetMapping("/payroll")
public List<Payroll> getAllpayrolls() 
{
return payrollsService.getallPayrolls();
}
//creating a get mapping that retrieves the detail of a specific payroll
@GetMapping("/payroll/{payrollid}")
public Payroll getpayrolls(@PathVariable("payrollid") long payrollId) 
{
return payrollsService.getpayrollsById(payrollId);
}
//creating a delete mapping that deletes a specified payroll
@DeleteMapping("/payroll/{payrollid}")
public String deletepayroll(@PathVariable("payrollid") long payrollId) 
{
return payrollsService.delete(payrollId);
}
//creating post mapping that post the payroll detail in the database
@PostMapping("/payrolls")
public Payroll savepayroll(@Valid @RequestBody Payroll payrolls) 
{
payrollsService.saveOrUpdate(payrolls);
return payrolls;
}
//creating put mapping that updates the payroll detail 
@PutMapping("/payroll/{payrollid}")
public String update(@PathVariable("payrollid") long payrollId,@RequestBody Payroll payrolls) 
{
return payrollsService.update(payrollId,payrolls);
}
}
