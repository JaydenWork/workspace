package edu.kh.jdbc.dto;

public class Employee2 {
	//부서명, 직급명, 이름, 이메일
	private String departmentTitle;
	private String jobName;
	private String name;
	private String email;
	
	public Employee2() {};
	
	public Employee2(String departmentTitle, String jobName, String name, String email) {
		this.departmentTitle = departmentTitle;
		this.jobName = jobName;
		this.name = name;
		this.email = email;
		
	}
	public String getDepartmentTitle() {
		return departmentTitle;
	}
	public void setDepartmentTitle(String departmentTitle) {
		this.departmentTitle = departmentTitle;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
