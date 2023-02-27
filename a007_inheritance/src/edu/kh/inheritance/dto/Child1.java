package edu.kh.inheritance.dto;

					//확장하다 (Parent의 코드를 상속 받아 Child1 확장)
public class Child1 extends Parent{

	
	private String car;
	
	// 생성자
	public Child1() {
		super();	// super()생성
		 			// -> 자식 객체 생성 시 부모 객체를 먼저 생성하게 함
		 			// ** 미작성 시 컴파일러가 자동 추가
		
		System.out.println("Child1() 기본 생성자");
	}
	
	// 매개 변수 생성자	
	public Child1(String car) {
		//super(); // super()생성
				 // -> 자식 객체 생성 시 부모 객체를 먼저 생성하게 함
				 // ** 미작성 시 컴파일러가 자동 추가
		
		
		//부모로 부터 상속받은 setter를 이용해서 부모 필드 초기화 한 것!
		//setMoney(100_000_000);
		//setLastName("김");
	
		//부모의 필드를 초기화 하는 방법이 부모 매개변수 생성자에 존재하기 떄문에
		// -> 이를 호출해서 사용( 코드길이 감소, 재사용성의 증가)
		super(200_000_000, "백");
		
		this.car = car;
		System.out.println("Child1(String) 매개변수 생성자");
	}
	
	
	// getter / setter
	public String getCar() {
		return car;
	}
	
	public void setCar(String car) {
		this.car = car;
	}
	
	public String toString() {
		
		//자신의(같은 클래스) 메서드호출 시 이름만 부르면 된다!
		//+상속 특징( 부모 필드 / 메서드를 상속 받아 자식것 처럼 사용 가능)
//		System.out.println(getCar())	;		
//		System.out.println(getMoney());
//		System.out.println(getLastName());
		
		
		// 부모의 필드 값을 간접 접근 방법으로 얻어와 하나의 문자열로 만들어줌
		//return car + "/" + getMoney() + "/" + getLastName();
		
		
		//문제점 : StackOverflowEroor 발생
		//원 인 : Child의 toString() 호출 시
		//  	 같은 toString()은 계속 반복해서 호출(==재귀 호출)
		
		// return car + "/" + toString();
		
		//해결방법 : 부모의 toString() 호출을 명시 -> super. 참조변수 이용
		
		return car + "/" + super.toString();  //내가 가진 car를 호출하고 부모가 가지고있는 toString을 이어서 호출하겠다.	
	}
	
}
