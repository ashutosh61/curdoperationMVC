package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.Entity.employee;
import com.nt.Service.IimplService;
@Controller
@RequestMapping("/yo")
public class EmployeOperation {

	@Autowired
	private IimplService service;
	
	@GetMapping("/get")
	public String getHome() {
		return "home";
	}
	
	@GetMapping("/getAll")
	public String getAllemployee(Map<String,Object>map){
		Iterable<employee> impl=service.getAllEmploye();
		map.put("emplist", impl);
		return "show_employee_report";
	}
	
	@GetMapping("/emp_add")
	public String showFormforSave(@ModelAttribute("emp") employee emp) {
		return "register_employee";
	}
	
	
	  @PostMapping("/emp_add") 
	  public String showFormForSaveEmployee(@ModelAttribute("emp") employee emp,Map<String,Object>map) {
	  String ResultMsg=service.RegisterEmployee(emp);    
	  Iterable<employee> listEmp=service.getAllEmploye(); 
	  map.put("msg",ResultMsg ); 
	  map.put("lEmp",listEmp); 
	  return "show_employee_report"; }
	 
}
