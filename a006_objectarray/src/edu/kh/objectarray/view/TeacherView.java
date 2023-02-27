package edu.kh.objectarray.view;

import java.util.Scanner;

import edu.kh.objectarray.dto.Teacher;
import edu.kh.objectarray.service.TeacherService;

public class TeacherView {
	
	Scanner sc = new Scanner(System.in);
	


	public void displayMenu() {
		
		int input = 0;
		
		do {
			System.out.println("---- [선생님 관리 프로그램] ----");
			System.out.println("1. 선생님 정보 조회");
			
			System.out.println("0. 종료");
			System.out.println("--------------------------");
			
			System.out.print("메뉴 선택 : ");
			input = sc.nextInt();
			
			System.out.println();
			
			switch(input) {
			case 1 : viewTeacher(); break; 
			case 0 : System.out.println("[프로그램이 종료됩니다.]");break; 
			default : System.out.println("[잘못 입력 하셨습니다.]");
			
			}
		
			System.out.println();
			
		}while(input != 0);
		
	}

	private void viewTeacher() {
		
		System.out.println("선생님 정보");
		
	}
}
