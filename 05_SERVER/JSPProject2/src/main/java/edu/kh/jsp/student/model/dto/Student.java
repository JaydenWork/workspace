package edu.kh.jsp.student.model.dto;

public class Student {

	private String studentNo;			//학번
	private String studentName;		//이름
	private String studentAddress;	//주소
	private String departmentName;	//학과

	public Student() {}

	public Student(String studentNo, String studentName, String studentAddress, String departmentName) {
		super();//부모생성
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.departmentName = departmentName;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "학번" + studentNo + ", 이름" + studentName + ", 주소" + studentAddress
				+ ", 전공" + departmentName;
	}
	
	
	
}
