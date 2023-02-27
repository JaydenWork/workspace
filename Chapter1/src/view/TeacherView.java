package view;

import java.util.Scanner;

import dto.Teacher;
import service.TeacherService;

public class TeacherView {

	private Scanner sc = new Scanner(System.in);
	
	private TeacherService service = new TeacherService();

	public void displayMenu() {

		int input = 0;

		do {

			System.out.println("1. 선생님 전체 조회");
			System.out.println("0. 종료");
			System.out.println("--------------------------");

			System.out.print("메뉴 선택 : ");
			input = sc.nextInt();

			System.out.println();

			switch (input) {
			case 1:
				viewAll();
				break;

			case 0:
				System.out.println("[프로그램이 종료됩니다.]");
				break;
			default:
				System.out.println("[잘못 입력 하셨습니다.]");

			}

			System.out.println();

		} while (input != 0);

	}

	private void viewAll() {

		System.out.println("선생님 전체 조회");

		Teacher[] teacherList = service.
	}
}
