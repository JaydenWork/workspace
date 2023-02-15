package edu.kh.control.loop.ex;

import java.util.Scanner;

public class WhileEx {
	
	public void ex1() {
		// 0 이입력될 때까지의 입력된 모든 정수의 합 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // 합계 저장용 변수
		
		int input = -1;
		
		while(input != 0) { // input이 0이면 종료하겠다는 
			System.out.println("정수 입력 : ");
			input = sc.nextInt();
			
			sum += input; // 누적
			System.out.println("현재 합계 : " + sum);
			
		}
		System.out.println("최종 결과 : " + sum);
		
	}
	
	
	public void ex2() {
		
		// 분식집 주문 프로그램
		
		//----메뉴----
		// 1. 떡볶이(5000원)
		// 2. 김밥(3000원)
		// 3. 라면(4000원)
		// 9. 주문 완료
		//메뉴 선택 >>2
		
		//----메뉴----
		// 1. 떡볶이(5000원)
		// 2. 김밥(3000원)
		// 3. 라면(4000원)
		// 9. 주문 완료
		//메뉴 선택 >>9
		//
		// 떡볶이 김밥 을 주문하셨습니다.
		// 총 가격은 8000원 입니다.
		
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // 기갹 힙계 저장용 변수
		
		String menu = "";
		
		int input = 0; // 메뉴 번호를 입력 받을 변수
		// input의 값은 while 조건이 false가 되지 않는 값을 작성하면 된다!
		// -> 보통 자료형 범위의 중간값인 0을 사용하고 이를 기본값이라고 한다.
		
		
		while(input !=9 ) {
			System.out.println("----메 뉴----");
			System.out.println("1. 떡볶이(5000원)");
			System.out.println("2. 김밥(5000원)");
			System.out.println("3. 라면(4000원)");
			System.out.println("9. 주문완료");
			
			System.out.print(" 메뉴 선택 >> ");
			input = sc.nextInt();
			System.out.println();
			
			switch(input) {
			
			case 1 :  
				sum += 5000;
				menu += "떡볶이 ";
				break; 
			case 2 :  
				sum += 3000;
				menu += "김밥 ";
				break;
			case 3 :  
				sum += 4000;
				menu += "라면 ";
				break;
			case 9 :  break;
			default : System.out.println("잘못 입력 하셨습니다.");
				
			} // switch 
			
		}//while 끝 
		
		System.out.println(menu + "을/를 주문 하셨습니다");
		System.out.println("총 가격은 " + sum + "원 입니다");
		

	}
	//do ~ while 문 기초 사용
	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int input = 0;
		
		 do { //일단 1회를 시행하고 나서 조건을 따져본 후 ~
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			sum += input;
			System.out.println("현재 합계 : "+sum);
		} while(input != 0);
		
		System.out.println("최종 결과 : "+ sum);
	}
	
	
	public void ex4() {
		
		// 1부터 10까지 반복해서 출력
		// 1 2 3 4 5 6 7 8 9 10
		
		// for 문
		
		for(int i = 1; i<=10; i++) {
			System.out.print(i+" ");
		}
	
		System.out.println(" ---- ---- ---- ----");
		
		// while 문
		int i=0;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		
	}
}
