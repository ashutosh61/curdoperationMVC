package com.nt.Service;

import com.nt.Entity.employee;

public interface IimplService {

	public Iterable<employee> getAllEmploye();
	public String RegisterEmployee(employee emp);
}
