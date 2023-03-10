package edu.kh.exception.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionService {

	public void ex1() throws IOException {
		// 해당 메서드 내에서 IOException이 발생할 것을
		// 대비한 예외처리 코드

		// 예외(Exception) 확인하기

		// 키보드 입력을 효율적으로 읽어오는 객체
		// Scanner보다 기능은 부족하지만 속도는 빠름
		BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

		System.out.println("입력 : ");
		String input = br.readLine();
		// readLine() : 한 줄 읽어오기 (엔터까지)
		// 왜 빨간줄이 뜰까?
		// - readLine() 메소드는 IOException 이라고 하는 예외를
		// 발생시킬(던질) 가능성이 있기 때문에
		// 그 상황에 대한 대비책(예외처리)를 하라고 경고하는 것

		System.out.println("입력값 : " + input);

		// Checked Exception
		// 컴파일 단계에서 예외가 발생할 가능성이 있는지
		// 반드시 확인해야하는 예외

		// -> 공식 API 문서의 메서드 설명에
		// throws 000Exception 으로 작성 되어있는 메서드가 있으면
		// 해당 코드 사용 시 문제가 발생할 것이다 라고 생각하고
		// 그 상황에 대한 예외 처리 코드를 꼭 작성한다.

		// Unchecked Exception :
		// 컴파일 단계에서 예외가 발생할 가능성이 있는지
		// 확인하지 않은 예외

		// -> 개발자의 부주의로 나타나는 예외
		// --> 대부분 쉽게 해결 (if)

		// --> 치명적인 문제는 아님

		System.out.println(5 / 0);

	}

	public void ex2() {
		// 예외(Exception) : 코드 수정으로 해결 가능한 에러
		// 예외 처리 : 예외를 처리할 수 있는 구문
		
		// [예외처리 1] try = catch ~ finally
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
		
		
		System.out.print("입력 : ");
		String input = br.readLine();
		// public String readLine() throws IOException
		// -> IOException이라는 Checked Exception을 발생 시키는 메서드
		//    -> Exception이 발생할 경우에 대비해서 예외처리 구문 작성(강제)
		
		/* 예외 강제 발생 */
		// -> 예외 객체를 새로 만들어서 던짐	
		throw new IOException();
		
		
		} catch(IOException e) {
			// catch : try 구문 내에서 던져진 예외가 있을 경우
			// 	       해당 예외 객체를 잡아채서 catch구문을 수행해 처리
			
			// catch의 매개 변수에는
			// 던져진 예외 객체를 저장할 수 있는 참조 변수를 작성
			
			System.out.println("키보드 문제로 입력을 진행할 수 없습니다.");
			
			// 발생된 예외가 처리된 후
			// 프로그램이 종료되지 않고 다음 코드가 수행됨
		}
		
		System.out.println("try-catch 수행되도 프로그램이 종료되지 않음 ");
		
	}
	
	public void ex3() {
		// 입력 받은 두 정수 나누기
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("입력 1 : ");
			int num1 = sc.nextInt();
			
			System.out.println("입력 2 : ");
			int num2 = sc.nextInt();
			
			System.out.printf("%d / %d = %d \n", num1, num2, num1/num2);
		
		}catch(ArithmeticException e){
			//산술적 예외를 잡아 처리하겠다
			System.out.println("0으로 나눌 수 없습니다.");
		
		} finally { 
			// finally : 마지막으로
			// try-catch 구문이 끝난 후 마지막으로 수행
			// 예외가 발생 하든 말든 무조건 실행하곘다.
			System.out.println("프로그램 종료");
		}
	}

	public void ex4() {
		
		
	}
}
