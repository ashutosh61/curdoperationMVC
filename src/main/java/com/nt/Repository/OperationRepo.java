package com.nt.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nt.Entity.employee;

@Repository
public interface OperationRepo extends CrudRepository<employee,Integer> {

}
