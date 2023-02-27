package edu.kh.objectarray.service;

import edu.kh.objectarray.dto.Teacher;

public class TeacherService {


	private Teacher teachers[];
	private int curTeacherCounts;
	
	public TeacherService()
	{
		curTeacherCounts = 5;
		teachers = new Teacher[curTeacherCounts];
		
		
	}
	
	public void CreateTeacher(Teacher newTeacher)
	{
		
	}
	
}
