package edu.kh.control.condition.ex;

import java.util.Scanner;

public class ConditionEx {

	public void test1() {
		System.out.println("test1() 수행");
	}
	public void test2() {
		System.out.println("test1() 수행");
	}
	public void test3() {
		System.out.println("test1() 수행");
	}
	
	
	
	// if 예시 1번
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		/*조건식*/
		if(input > 0 ) {
			// 조건식이 true인 경우에만 if문 {}내부 코드가 수행된다!
			System.out.println("양수 입니다.");
			System.out.println("ex1() 종료");
		}
		if(input < 0) {
			System.out.println("음수 입니다.");
			System.out.println("ex1() 끝!!");
		}
		
		
		//if 예시 2번 (if - else)
	
		
		//홀수, 짝수, 0
		if(input == 0) {
			System.out.println("0은 홀/짝수를 구분할 수 없습니");
		} else if( Math.abs(input)%2==1) {// 홀수
				//절대값
			System.out.println("홀수 입니다.");
		
		} else {
			System.out.println("짝수 입니다.");
		}
	}
		// if 예시 4
	public void ex4() {
			
		Scanner sc = new Scanner(System.in);
			
		System.out.println("계절을 알고싶은 달(월)을 입력해주세요 : ");
		int input = sc.nextInt();
			
		//조건문 결과를 저장할 문자열 변수 선언
		String result;
			
		if(input >= 3 && input <= 5) {
			//(input == 3 || input == 4 || input == 5)
			result = "봄";
			
		} else if(input >= 6 && input <= 8) {//6,7,8
			result = "여름";
			
		} else if(input >=9 && input <= 11) {
			result = "가을";	
			
		} else if(input == 12 || input ==1 || input == 2) {//12,1,2
			result = "겨울";
			
		} else {
			result = "해당하는 계절이 없습니다.";
		}
		// if- else if - else를 거치게 되면 
		// 무조건 result에 값이 하나 저장되어 있다!
		System.out.println(result);
		
	}
	
		// if 예시 5번
	public void ex5() {
		//나이를 입력 받아 
		//13세 이하면 "어린이"
		//13세 초과 19세 이하면 "청소년"
		// 19세 초과 "성인" 출력
		//0세 이하는 생각하지 않음
		
		Scanner sc = new Scanner(System.in);	

		System.out.print("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		String result;
		
		if(age <= 13) 
		result = "어린이";
		
		 else if(age > 13 && age <= 19) 
		result = "청소년";
		
		 else 
		result = "성인";
		
		
		System.out.println(result);

	}
	
	
	//if 예시 6번
	public void ex6() {
		//놀이기구 탑승 제한 검사
		//나이가 12세 이상, 키 140.0cm 이상일 경우에만 탑승 가능
		//나이가 12세 미만 : "적정 연력이 아닙니다"
		//키 140.0cm 미만 : "적정 키가 아닙니다."
		//나이를 0세 미만 또는 100세 초과 입력 시 : "잘못 입력하셨습니다"
		
		//[실행 화면]
		//나이 입력 : 15
		//키 입력 : 170.5
		//탑승 가능
		
		//[나이 제한]
		//나이 입력 : 10
		//키 입력 : 150.6
		//적정 연력이 아닙니다.
		
		//[키 제한]
		//나이 입력 : 12
		//키 입력 : 135.3
		//적정 키가 아닙니다.
		
		//나이 0 미만 또는 100 초
		//나이 입력 : 12
		//키 입력 : 135.3
		//잘못 입력 하셨습니다.
	
		
		
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		String result;
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		
		
		if(age < 0 || age > 100)
			result = "잘못 입력하셨습니다";
		else if(age < 12)
			result = "적정 연력이 아닙니다";
		else if(height < 140.0)
			result = "적정 키가 아닙니다";
		else
			result = "탑승가능";	
		
		System.out.println(result);
		
		//안되는 것부터 조건 설정하고 else는 탑승 가능한 사람들만 남게~~
		
			
	}
	
	public void ex7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		if(age < 0 || age > 100) {
			result = "잘못 입력하셨습니다";
		} else if(age < 12) {
			result = "적정 연령이 아닙니다";
		} else
			
		System.out.println("키 입력 : ");
		double height = sc.nextDouble();
		
		if (height<100 || height > 220) {
			
			result = "잘못 입력하셨습니다";
		} else if (height < 140) {
			result = "적정 키가 아닙니다";
			
		} else {
			result = "탑승 가능";
		}
		
		System.out.println(result);
		
					
	} 
	
		//switch 예시 2
	public void ex2() {
		//랜덤 팀 배정 프로그램
		//(백팀 0, 청팀 1, 홍팀2) -> 각 팀별로 숫자 지정 (0,1,2)
		
		// * Java 에서 랜덤한 수 (난수) 발생시키는 방법 *
		
		// Math.random() : 난수 발생
		// 1) 난수 발생 범위 : 0.0 <= random < 1.0
		// 2) 발생한 난수의 자료형 : double
		//+실수 -> 정수 강제 형변환 : 소수점 버림
		
		//Math.random() //0.0 <= random < 1.0
		//Math.random() * 3 // 0 <= random * 3 < 3.0
		int random = (int)(Math.random() * 3); // 0<= (int)Math.random() * 3 < 3
		// 0,1,2 중 하나를 무작위 발생
		
		String result;
		switch(random) {
		case 0 : result = "백팀"; break;
		case 1 : result = "청팀"; break;
		default : result = "홍팀";
				
		System.out.println(result);
		
		}
		
	}
		
		
		
}




	
	
	
	
	



	
	
	
	
	
