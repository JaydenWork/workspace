package edu.kh.collection.list.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.list.dto.Student;
import edu.kh.collection.list.service.StudentService;

public class StudentView {

	private Scanner sc = new Scanner(System.in);					
	private StudentService service = new StudentService(); // --->> [ 이 코드의 의미 ]
	//																이 코드에서 private StudentService service = new StudentService();은
	//																StudentView 클래스 내부에서 StudentService 클래스의 인스턴스를 생성하고, 
	//																이를 service 필드에 할당하는 것을 의미합니다. 이렇게 함으로써 StudentView 클래스 내부에서 
	//																StudentService 클래스의 메소드를 호출하여 학생 정보를 
	//																추가, 조회, 수정, 삭제 등의 작업을 수행할 수 있게 됩니다. 
	//																즉, StudentService 클래스의 기능을 StudentView 클래스에서 사용할 수 있도록 
	//																인스턴스를 생성하고 참조하는 것입니다.

	public void displayMenu() {
		int input = 0;

		do {
			try {
				System.out.println("\n---학생 관리 프로그램---\n");
				System.out.println("1. 학생 정보 추가");
				System.out.println("2. 학생 정보 조회");
				System.out.println("3. 학생 정보 수정");
				System.out.println("4. 학생 정보 제거");
				System.out.println("5. 학생 이름 검색");
				System.out.println("6. 학생 주소 검색");
				System.out.println("7. 학년별 조회");
				System.out.println("8. 성별 조회");
				System.out.println("9. 성적 순서 조회");
				System.out.println("0. 프로그램 종료");
				System.out.println();

				System.out.print("메뉴 선택 >> ");

				input = sc.nextInt();
				sc.nextLine();

				System.out.println();

				switch (input) {

				case 1:
					addStudent();
					break;
				case 2:
					selectAll();
					break; // 전체를 선택해서 보겠다(조회하겠다)
				case 3:
					updateStudent();
					break;
				case 4:
					removeStudent();
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;
				case 0:
					System.out.println("[ 프로그램 종료 ]");
					break;
				default:
					System.out.println("[ 잘못 입력하셨습니다. ] ");

				}

			} catch (InputMismatchException e) {
				System.out.println("[ 잘못된 형식의 입력입니다.] ");
				sc.nextLine(); // 입력 버퍼에 잘못 입력된 내용 제거
				input = -1; // 반복문이 종료되는 것을 방지
			}

			System.out.println();
		} while (input != 0);
	}

	private void addStudent() {
		System.out.println("\n 학생 정보 추가");

		// 학생 정보 입력 메서드 호출 후 결과 반환 받기
		Student std = inputStudent();
		

		
		
		if (service.addstudent(std)) {
			System.out.println("[ 학생 정보가 추가되었습니다. ]");
		}

	}

	/**
	 * 전체 학생 조회
	 */
	private void selectAll() {
		System.out.println("\n--- 전체 학생 조회 ---");

		List<Student> list = service.selectAll();

		// 향상된 for문
		for (Student s : list) {

			// System.out.println(s.toString());
			System.out.println(s);

			// print 관련 메서드에서
			// 참조변수를 출력하고자 매개변수로 전달하면
			// 자동으로 .toString()을 붙여서 호출 (컴파일러가 해줌)

		}
	}

	/**
	 * 학생 정보 수정
	 */
	private void updateStudent() {
		System.out.println("\n--- 학생 정보 수정 --- \n");

		System.out.println("<수정할 학생 정보 입력> ");
		
		Student std = inputStudent();
		
		
		System.out.println("---------------------------");
		System.out.print("수정할 학생의 index : ");
		int index = sc.nextInt();
		
		
		Student s = service.updateStudent(index, std);
		// s== 수정되기 전 학생 정보가 반환됨
		
		System.out.println(s.getName()+ "의 정보가 수정 되었습니다.");
		
	}
	

	/**
	 * 학생 전체 정보를 입력 받아 Student 객체로 반환하는 메서드
	 * 
	 * @return std : Student
	 */

	private Student inputStudent() {

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("학년 : ");
		int grade = sc.nextInt();

		System.out.print("반 : ");
		int classRoom = sc.nextInt();

		System.out.print("번호 : ");
		int number = sc.nextInt();

		System.out.print("주소 : ");
		String address = sc.next();

		System.out.print("성별( M / F ) : ");
		char gender = sc.next().toUpperCase().charAt(0);

		System.out.print("성적 : ");
		int score = sc.nextInt();

		Student std = new Student(name, grade, classRoom, number, address, gender, score);

		return std;
	}
	
	private void removeStudent() {
		System.out.println("\n --- 학생 정보 제거 ---\n");
		System.out.print("삭제할 학생의 인덱스 입력 : ");
		
		int index = sc.nextInt();
		
		
		// ** 제거되기 전 학생 정보가 반환됨 **
		Student s = service.removeStudent(index);
		
		System.out.println(s.getName() + "학생 정보가 제거되었습니다. ");
	}
}
