package edu.kh.array.ex;

import java.awt.Menu;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx1 {

	// 배열 기본 사용법 1
	public void ex1() {

		// 배열 선언
		int[] arr;
		// - int 배열을 참조할 공간 할당하고 이를 arr 이라고 부르겠다.

		// * 기본 자료형 8개를 제외한 나머지는 "참조형" 이라고 한다.

		int a;
		char c;
		double b;

		// 배열 할당
		arr = new int[4];
		// - 새롭게 int형 변수 4개짜리 배열을 생성하고
		// 이를 arr에 대입한
		// -> arr이 해당 배열을 참조
		// -> 해당 배열을 부를 때 arr 이라고 부르면 됨.

		// 배열 이용

		// 1) 배열 각 요소에 값 대입

		arr[0] = 10;
		arr[1] = 30;
		arr[2] = 20;
		arr[3] = 40;

		// 2) 배열 각 요소의 값 얻어오기

		int sum = 0;
		for (int i = 0; i < 4; i++) {
			System.out.printf("arr[%d] : %d \n", i, arr[i]);

			sum += arr[i];
		}

		System.out.println(sum);

	}

	// 배열 기본 사용법2 : 초기
	public void ex2() {

		// 배열 : 같은 자료형의 변수를 하나의 묶음으로 다루는

		// 1) 3) 2)
		int[] numbers = new int[4];
		// 1) Stack 영역에 int배열을 참조하기 위한 변수
		// numbers를 선언

		// 2) Heap 영역에 새롭게 int 4칸짜리 배열 할당
		// -> index 번호 추가, 기본값(0)으로 초기화
		// + 시작주소 부여 ex) 0x5123

		// 3) Heap 영역에 생성된 배열의 시작 주소(0x5123)를
		// Stack 영역 참조 변수 numbers에 대입한다.
		// -> numbers가 배열을 참조

		// 1. 정말 numbers 주소가 저장 되었을까?
		System.out.println(numbers); // [I@251a69d7 -> 정확히 말하면 주소는 아님...주소를 가지고 만든 암호?(해시코드)
										// -> 지금은 주소로 봐도 무

		// 2. 정말 기본값(0)으로 초기화 되었을까?
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		// -> 컴파일러가 0으로 초기화 하였음을 확인

		System.out.println();
		System.out.println("===============================");

		// 배열 초기화
		// 1) 인덱스를 이용한 초기화
		numbers[0] = 100;
		numbers[1] = 5;
		numbers[2] = 300;
		numbers[3] = 99;

		// breakpoint : debug모드로 실행 시 해당 줄의 코드가 수행되기 전에 멈춤
		System.out.println("-----------------------------------");

		// for문을 이용한 초기화

		// ** 배열명.length : 배열의 길이(칸 수)를 반환
		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = i * 10 + 1;
		}

		System.out.println("-----------------------------------");

		// 선언과 동시에 초기화
		int[] numbers2 = { 100, 200, 300, 400, 500, 600 };
		// new 구문 생성

		System.out.println("-----------------------------------");

	}

	// 배열 기본 사용법 3
	public void ex3() {
		// 3명의 키를 입력 받아 평균 구하기

		// 1번 키 입력 : 170.5
		// 2번 키 입력 : 165.7
		// 3번 키 입력 : 180.4

		// 입력 받은 키 : 170.5 165.7 180.4
		// 평균 키 : 172.20cm

		Scanner sc = new Scanner(System.in);

		double[] heightArray = new double[3]; // 0.0 0.0 0.0 로 초기화 되어있음.

		for (int i = 0; i < heightArray.length; i++) { // 3

			System.out.printf("%d번 키 입력 : ", i + 1); // 1 2 3 출력
			heightArray[i] = sc.nextDouble();

		}

		System.out.println();

		System.out.printf("입력 받은 키 : ");

		double sum = 0.0; // 키 합계 저장용 변수

		for (int i = 0; i < heightArray.length; i++) {
			System.out.print(heightArray[i] + " ");

			sum += heightArray[i]; // 키 누적
		}

		System.out.printf("\n평균 키 : %.2fcm", sum / 3);
	}

	public void ex4() {
		// 오늘의 점심 메뉴 뽑기

		// String[] menuArr = new String[10];

		String[] menuArr = { "김밥+라면", "서브웨이", "KFC", "맘터", "순대국", "뼈해장국", "닭갈비", "마라탕", "우육면", "파슽타", "샐러드" };

		// 0부터 배열 길이의 범위 내에서 난수 발
		int index = (int) (Math.random() * menuArr.length);

		System.out.println("오늘의 점심 메뉴 !! : " + menuArr[index]);

	}

	// 배열 사용 시 주의 사항!!!!
	public void ex5() {

		// 배열의 범위를 넘어선 index를 참조하는 경

		int[] arr = { 10, 30, 50, 70, 90 };

		// arr에 저장된 값 모두 출력

		for (int i = 0; i <= arr.length; i++) {

			System.out.println(arr[i]);

			// Array Index OutOfBounds Exception : Index 5 out of bounds for length 5
			// 배열 인덱스 범위 초과 예외(에러) :
			// : 인덱스 5번은 길이 5짜리 배열의 범위를 초과했다.

			// 문제점 : for문의 조건식에서 i의 범위가
			// arr 배열의 인덱스 범위를 초과하는 값까
			// 증가하도록 작성되어
			// 실행 시 ArrayIndexOutOfBoundsException이 발생함.
			// 해결 방법 : 조건식을 i < arr.length로 수정하여
			// i가 배열의 인덱스 범위를 초과하지 않도록 함.

		}

	}

	public void ex6() {
		int sum = 0;
		int num = 0;

		for (num = 0; sum < 100; num++) {
			sum += num;
		}
		System.out.println("num : " + sum);
	}

	// 배열 내 데이터 검
	public void ex7() {
		// 입력 받은 정수가 배열에 존재하면 몇 번 인덱스에 있는지 출력
		// 없으면 " 존재하지 않습니다" 출력

		int[] arr = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		// 1) 초기값을 인덱스 범위에 포함되지 않는 값을 작성한다.
//			int index = -1;
//			
//			
//			for(int i=0; i<arr.length; i++) {
//				
//				//입력값과 현재 인덱스 값이 같으면
//				if(input == arr[i]) {
//					index = i;
//				}
//			}
//			
//			if(index < 0) { // 일치하는 결과가 없음
//				System.out.println("존재하지 않습니다.");
//			}else {
//				System.out.println(index);
//			}

		// 2 flag 변수를 이용하는 방법
		int index = 0;

		boolean flag = true; // 신호 용도의 변수
		// 검색 for문 종료 후
		// flag가 true : 검색 결과 없음
		// flag가 false : 검색 결과 존재

		for (int i = 0; i < arr.length; i++) {

			if (input == arr[i]) { // 입력값과 일치하는 값이 존재하는 경우
				index = i;
				flag = false;
				break; // 일치하는 값을 찾은 경우 더 이상 반복하지 않음(성능 개선)

			}
		}
		if (flag) { // if문의 조건식이 true일때만 실행됨 => 검색 결과 없는걸 뜻한다
			System.out.println("존재하지 않습니다");
		} else {
			System.out.println(index);
		}
	}

	// 얕은 복사 / 깊은 복
	public void ex8() {

		// 얕은 복사
		// -참조 하는 배열/ 객체의 주소만을 복사하여
		// 서로 다른 참조 변수가 하나의 배열/객체를 참조함.(공유하는 개념)

		// 깊은 복사

		int[] arr1 = { 10, 20, 30, 40, 50 };

		int[] copyArr1 = arr1; // arr1에 저장된 배열 주소값을 복사
								// arr1, copyArr1이 같은 배열을 참조한다.

		// 얕은 복사 확인
		// 1)참조하는 주소가 같은가?
		System.out.println("arr1: " + arr1);
		System.out.println("copyArr1 : " + copyArr1);

		// 2)복사본의 값을 변경할 경우 원본이 변하는가?
		copyArr1[0] = 9999;

		// toString() : 저장된 값을 하나의 문자열로 만든다
		System.out.println("arr1 : " + Arrays.toString(arr1));

		System.out.println("------------------------------------");

		// 깊은 복사 확인
		int[] arr2 = { 5, 6, 7, 8 };

		// 깊은 복사를 진행할 arr2 배열과 같은 크기의 배열을 준비
		int[] copyArr2 = new int[arr2.length];

		// for문을 이용해서 깊은 복사
		for (int i = 0; i < arr2.length; i++) {
			copyArr2[i] = arr2[i];

			// System.arraycopy()를 이용한 깊은 복사
			// Shift + 12

			// System.arraycopy(원본배열명,
			// 원본 배열 복사 시작 인덱스
			// 복사 배열명,
			// 복사 배열의 삽입 시작 인덱스,
			// 복사 길이);

			System.arraycopy(arr2, 0, copyArr2, 0, 4);

			// 1)참조하는 주소가 같은가?
			System.out.println("arr2 : " + arr2);
			System.out.println("copyArr2 : " + copyArr2);

			// 2)복사본의 값을 변경할 경우 원본이 변하는가?
			copyArr2[0] = 9999;

			System.out.println("arr2 : " + Arrays.toString(arr2));
			System.out.println("copyArr2 : " + Arrays.toString(copyArr2));

		}

	}
}
