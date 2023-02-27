package service;

import dto.Teacher;

public class TeacherService {

	
	private Teacher[] teacherArr = new Teacher[3];
	
	public TeacherService() {
		
		
		teacherArr[0] = new Teacher("최대윤", "남", 3, 5);
		teacherArr[1] = new Teacher("이준규", "남", 2, 3);
		teacherArr[2] = new Teacher("김재창", "여", 1, 7);
		
	}
	
}
