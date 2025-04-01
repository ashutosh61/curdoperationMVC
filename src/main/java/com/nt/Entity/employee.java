package com.nt.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name="emp")
public class employee {
@Id
@SequenceGenerator(name="gen1",sequenceName="emp_id_seq", initialValue=1,allocationSize=1)
@GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
private Integer empno;
@Column(name="ename")
private String ename;
@Column(name="job")
private String job;
@Column(name="salary")
private int salary;
@Column(name="department")
private String department;
public Integer getEmpno() {
	return empno;
}
public void setEmpno(Integer empno) {
	this.empno = empno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
@Override
public String toString() {
	return "employee [empno=" + empno + ", ename=" + ename + ", job=" + job + ", salary=" + salary + ", department="
			+ department + "]";
}



}
