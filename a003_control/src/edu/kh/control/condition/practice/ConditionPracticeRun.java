package edu.kh.control.condition.practice;

import java.util.Scanner;

import edu.kh.control.condition.ex.ConditionEx;

public class ConditionPracticeRun {
	
	public static void main(String[] args) {
		
		ConditionPractice cp = new ConditionPractice();
		
		//cp.practice1();
	//	cp.practice2();
	//	cp.practice3();
	//	cp.practice4();
		//cp.practice5();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("실행할 예제 번호 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : cp.practice1();break;
		case 2 : cp.practice2();break;
		case 3 : cp.practice3();break;
		case 4 : cp.practice4();break;
		case 5 : cp.practice5();break;
		}
		
	}
}
