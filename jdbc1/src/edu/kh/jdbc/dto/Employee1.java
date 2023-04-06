package edu.kh.jdbc.dto;

//DTO (Data Transfer Object) : 값 전달용 객체 -> DAO에서 꺼낸 값들(한 행에 있는 쿼리 결과 정보)을 example3로 다시 전달해주는 객체
public class Employee1 {

	private String empId;
	private String empName;
	private int salary;
	private String departmentTitle;
	
	
	
	public Employee1() {} 
	
	public Employee1(String empId, String empName, int salary, String departmentTitle) {
		
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.departmentTitle = departmentTitle;
	}

	
	
	// getter / setter
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartmentTitle() {
		return departmentTitle;
	}

	public void setDepartmentTitle(String departmentTitle) {
		this.departmentTitle = departmentTitle;
	}
	
	
	
	
	
}
