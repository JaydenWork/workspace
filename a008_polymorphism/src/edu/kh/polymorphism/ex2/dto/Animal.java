package edu.kh.polymorphism.ex2.dto;

//추상 클래스(abstract class)
// - 추상 메서드가 포함된 클래스
// 단, 추상 메서드가 없어도 추상 클래스가 될 수 있다!
public abstract class Animal extends Object{
					// ㄴ>>     미 작성 시 컴파일러가 자동으로 생성 

	//추상화, 캡슐화
	
	
	
	// 필드
	private String type;
	private String eatType;
	
	
	
	
	// 생성자
	public Animal() {// 기본 생성자
		super();     // 부모 생성자 호출
					 // 미작성 시 컴파일러가 자동 추가
	}
	
	
	public Animal(String type, String eatType) {   //매개 변수 생성자
		
		this.type = type;
		this.eatType = eatType;
		
	}
	
	
	// 메서드
	
	public void setType(String Type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setEatType(String EatType) {
		this.eatType = EatType;
	}
	
	public String getEatType() {
		return eatType;
	}
	
	// String Object.toString()
	// - 객체가 가지고 있는 필드를 하나의 문자열로 반환하는 용도에 메서드 
	// (자식이 오버라이딩해서 사용하길 권장)
	// - 오버라이딩 안하면 -> 패키지명+클래스명@해시코드 형태로 반환한다
	
	@Override
	public String toString() {
		return type + "/" +  eatType;
		
	}
	
	//추상 메서드(미완성된 메서드)
	// -> 상속 받은 자식 클래스에 반드시 오버라이딩 해야한다.
	// --> 추상 메서드를 포함한 클래스는 반드시 abstract class 여야만 한다.
	public abstract void breath();
	
	
	
}
