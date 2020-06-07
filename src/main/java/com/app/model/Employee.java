package com.app.model;

import java.util.List;

public class Employee {

	private int empId;
	private String empName;
	private double empSal;
	private String empGen;
	private String addr;
	private String empPrj;
	private List<String> langs;
	private List<String> locs;
	public Employee() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getEmpGen() {
		return empGen;
	}
	public void setEmpGen(String empGen) {
		this.empGen = empGen;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmpPrj() {
		return empPrj;
	}
	public void setEmpPrj(String empPrj) {
		this.empPrj = empPrj;
	}
	public List<String> getLangs() {
		return langs;
	}
	public void setLangs(List<String> langs) {
		this.langs = langs;
	}
	public List<String> getLocs() {
		return locs;
	}
	public void setLocs(List<String> locs) {
		this.locs = locs;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empGen=" + empGen
				+ ", addr=" + addr + ", empPrj=" + empPrj + ", langs=" + langs + ", locs=" + locs + "]";
	}
	
	

	
	
}
