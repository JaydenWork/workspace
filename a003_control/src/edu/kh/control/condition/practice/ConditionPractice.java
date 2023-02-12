package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
	int num1 = sc.nextInt();
	String res;
	
	if(num1>0 && num1 % 2 == 0) {
		System.out.println("짝수입니다");
	}else if(num1<0){
		System.out.println("양수만 입력해주세요.");
	}else 
		System.out.println("홀수입니다.");
	
}


public void practice2() {
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("국어점수 : ");
	int korea = sc.nextInt();
	
	System.out.print("수학점수 : ");
	int math = sc.nextInt();
	
	System.out.print("영어점수 : ");
	int	eng = sc.nextInt();
	
	int point = (korea + eng + math);
	double avg = point/3;
	
	if(korea>=40 && math >= 40 && eng>=40 && avg>=60) {
		System.out.println("국어 : " + korea);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + eng);
		System.out.println("합계 : " + point);
		System.out.println("평균 : "+ avg);
		System.out.println("축하합니다, 합격입니다!");
	}else {
		System.out.println("불합격입니다.");
	}
	
	
	
	
	
}
public void practice3() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("1~12 사이의 정수 입력 : ");
	int num = sc.nextInt();
	int a = 30;
	int b = 31;
	
	switch(num) {
	
	case 1: case 3: case 5: case 7: case 8: case 10: case 12: System.out.printf("%d월은 %d일까지 있습니다.",num, b); break;
	case 2: case 4:	case 6:case 9: case 11: System.out.printf("%d월은 %d일까지 있습니다.",num, a); break;
	default : System.out.printf("%d월은 잘못 입력된 달입니다.", num); 
		
	}
	
	
}
public void practice4() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("키(m)를 입력해 주세요 : ");
	double height = sc.nextDouble();
	
	System.out.print("몸무게(kg)를 입력해 주세요 : ");
	double weight = sc.nextDouble();
	
	double bmi = weight / (height * height) ;
	
	if(bmi<18.5)
		System.out.println("BMI 지수 : "+ bmi + "\n저체중");
	else if(bmi>= 18.5 && bmi<23)
		System.out.println("BMI 지수 : "+ bmi + "\n정상체중");
	else if(bmi>= 23 && bmi<25)
		System.out.println("BMI 지수 : "+ bmi + "\n과체중");
	else if(bmi>= 25 && bmi<30)
		System.out.println("BMI 지수 : "+ bmi + "\n비만");
	else if(bmi>= 30)
		System.out.println("BMI 지수 : "+ bmi + "\n고도비만");
}




public void practice5() {
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("중간 고사 점수 : ");
	int test1 = sc.nextInt();
	
	System.out.print("기말 고사 점수 : ");
	int test2 = sc.nextInt();
	
	System.out.print("과제 점수 : ");
	int point1 = sc.nextInt();
	
	System.out.print("출석 횟수 : ");
	double point2 = sc.nextDouble();
	
	double a = test1 * 0.2;
	double b = test2 * 0.3;
	double c = point1 * 0.3;
	double all = a+b+c+point2;
	
	System.out.println("================= 결과 =================");
	
	
	if(point2<=14) {
		
		System.out.printf("Fail [출석 횟수 부족 (%d/20)]",(int)point2);
	}else if(all>=70) {
		System.out.println("중간 고사 점수(20) : "+a);
		System.out.println("기말 고사 점수(30) : "+b);
		System.out.println("과제 점수      (30) : "+c);
		System.out.println("출석 점수      (20) : "+point2);
		System.out.println("총점 : "+ all);
		System.out.println("Pass");
	}else {
		System.out.println("중간 고사 점수(20) : "+a);
		System.out.println("기말 고사 점수(30) : "+b);
		System.out.println("과제 점수      (30) : "+c);
		System.out.println("출석 점수      (20) : "+point2);
		System.out.println("총점 : "+ all);
		System.out.println("Fail");
		}
	}

}
