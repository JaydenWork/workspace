package edu.kh.control.loop.practice;

import java.util.Scanner;

public class ForPractiveRun {

	public static void main(String[] args) {

		ForPractice fp = new ForPractice();

		Scanner sc = new Scanner(System.in);

		System.out.print("실행한 예제의 번호를 입력해주세요 : ");
		int number = sc.nextInt();

		switch (number) {
		case 1:
			fp.practice1();
			break;
		case 2:
			fp.practice2();
			break;
		case 3:
			fp.practice3();
			break;
		case 4:
			fp.practice4();
			break;
		case 5:
			fp.practice5();
			break;
		case 6:
			fp.practice6();
			break;
		case 7:
			fp.practice7();
			break;
		case 8:
			fp.practice8();
			break;
		case 9:
			fp.practice9();
			break;
		case 10:
			fp.practice10();
			break;
		case 11:
			fp.practice11();
			break;
		case 12:
			fp.practice12();
			break;

		}
	}
}
