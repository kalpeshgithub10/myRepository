package com.cg.MyMavenProject;

public class Employee {

	private int eid;
	private String ename;
	private int salary;
	
	
	public Employee() {
		
	}
	
	public Employee(int eid, String ename,int salary)
	{
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", salary=" + salary + "]";
	}
	
	
}

