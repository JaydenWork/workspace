package dto;

public class Teacher {
	
	private String name;
	private String sex;
	private int grade;
	private int classRoom;
	
	public Teacher() {}
	
	public Teacher(String name, String sex, int grade, int classRoom) {
		
		this.name = name;
		this.sex = sex;
		this.grade = grade;
		this.classRoom = classRoom;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	@Override
	public String toString() {
		return String.format("%d학년 %d반 %성 %s", grade, classRoom, sex, name);
	
	}
	
	

}
