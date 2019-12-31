package com.mphasis.bean;

public class Employee {
	private int id;
	private String name;
	private int empId;
	private String date;
	private String inTime;
	private String outTime;
	
	public Employee() {}
	
	public Employee(String name, int empId, String date, String inTime, String outTime) {
		super();
		this.name = name;
		this.empId = empId;
		this.date = date;
		this.inTime = inTime;
		this.outTime = outTime;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", date=" + date + ", inTime=" + inTime + ", outTime="
				+ outTime + "]";
	}
	
	
}
