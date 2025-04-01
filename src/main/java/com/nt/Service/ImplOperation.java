package com.nt.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Entity.employee;
import com.nt.Repository.OperationRepo;
@Service
public class ImplOperation implements IimplService {
	
	@Autowired
	private OperationRepo repo;

	@Override
	public Iterable<employee> getAllEmploye() {
       
		return repo.findAll();
	}

	@Override
	public String RegisterEmployee(employee emp) {
		return "employee is saved with id value:"+repo.save(emp).getEmpno();
		
	}

}
