package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {

		int[] arr = new int[9];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			if (i % 2 == 0) {
				sum += arr[i];
			}
			System.out.print(arr[i] + " ");

		}
		System.out.println("\n" + sum);

	}

	public void practice2() {

		int[] arr = new int[9]; // 길이가 9인 배열 생성
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 9 - i; // 9부터 1까지의 값을 배열에 대입
			System.out.print(arr[i] + " ");

			if (i % 2 == 1) { // 홀수 번째 인덱스의 값인 경우
				sum += arr[i]; // 합산
			}
		}

		System.out.println("\n홀수 번째 인덱스 값의 합: " + sum);
	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수 : ");
		int input = sc.nextInt();

		int[] arr = new int[input];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice4() {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("입력 %d : ", arr[i]);
			arr[i] = sc.nextInt();
		}
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();

		boolean index = false;

		for (int i = 0; i < arr.length; i++) {
			if (search == arr[i]) {
				System.out.printf("배열의 %d 번째 인덱스에 일치하는 값이 있습니다", i);
				index = true; // 찾았는지 못 찾았는지 초기화 해줘야함
			}
		}
		if (!index) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}

	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자 : ");
		String input = sc.next();

	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println("\n총 합 : " + sum);
	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("주민등록번호(-포함) : ");

		String str = sc.next();
		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			if (i >= 8) {
				arr[i] = '*';
			} else {
				arr[i] = str.charAt(i);
				;
			}
			System.out.print(arr[i]);
		}

	}

	public void practice8() {

//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 : ");
//		int input = sc.nextInt();
//		int[] arr = new int[input];
//		
//		if(input < 3 || input % 2 == 0) {
//
//			System.out.println("다시 입력하세요.");
//		}
//		else {
//			for(int i=0; i<input;i++) {
//				if(i < arr.length/2+1) {
//					arr[i]=i+1;
//				}
//				else {
//					arr[i]= arr[i-1]-1;
//				}
//				if(i==input-1) {
//					System.out.print(arr[i]);
//				}
//				else {
//					System.out.print(arr[i]+",");
//				}
//			}
//		}
//		Scanner sc = new Scanner(System.in);
//		int input;
//
//		do {
//			System.out.print("정수: ");
//			input = sc.nextInt();
//			if (input < 3 || input % 2 == 0) {
//				System.out.println("다시 입력하세요.");
//			}
//		} while (input >= 3 || input % 2 != 0);
//
//		int[] arr = new int[input];
//		for (int i = 0; i < arr.length; i++) {
//			if (i + 1 < arr.length / 2 + 1) {
//				arr[i] = i + 1;
//			} else {
//				arr[i - 1] = i - 1;
//			}
//			System.out.print(arr[i]);

		Scanner sc = new Scanner(System.in);

		int input = 0;
		int num = 1;

		do {
			System.out.print("정수 : ");
			input = sc.nextInt();
			if (input < 3 || input % 2 == 0) {
				System.out.println("다시 입력하세요.");
			}

		} while (input < 3 || input % 2 == 0);

		int[] arr = new int[input];
		for (int i = 0; i < arr.length; i++) {
			if (i < input / 2) {
				arr[i] = num;
				num++;
			} else {
				arr[i] = num;
				num--;
			}
			if (i == input - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}
		}

	}

	public void practice9() {

		int[] arr = new int[10];

		System.out.print("발생한 난수 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}

	}

	public void practice10() {

//		int[] arr = new int[10];
//		System.out.print("발생한 난수 : ");
//		
//	
//		int max=0;
//		int min=10;
//		
//		for(int i=0; i<arr.length; i++) {
//			
//			arr[i] = (int)(Math.random()*10+1);
//			
//			if(arr[i]>max) {
//				max = arr[i];
//			}
//			if(arr[i]< min) {
//				min = arr[i];
//			}
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println("\n최대값 : "+max);
//		System.out.println("최소값 : "+min);
//	}

		int max = 0;
		int min = 10;

		int[] arr = new int[10];

		System.out.println("발생한 난수 : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
			System.out.print(arr[i] + " ");

		}
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

	public void practice11() {

//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
//		[실행 화면]
//		4 1 3 6 9 5 8 10 7 2

		int[] arr = new int[10];

		int a = arr[0];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);

		}
	}

//	public void practice12() {
//
////		로또 번호 자동 생성기 프로그램을 만들기.
////		(중복 값 없이 오름차순으로 정렬하여 출력하세요.)
////		[실행 화면]
////		3 4 15 17 28 40	
//
//		int[] lotto = new int[6];
//		boolean flag = false;
//		int num = (int) (Math.random() * 50 + 1);
//		int min = 50;
//
//		for (int i = 0; i < lotto.length; i++) {
//			if (num == lotto[i]) {
//				flag = true;
//				break;
//			}
//			if (flag) {
//				System.out.print(lotto[i] + " ");
//			}
//
//		}
//	}
	public void practice13() {

//		문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고 문자의 개수와 함께 출력하세요. (중복 제거)
//		[실행 화면]
//		문자열 : application
//		문자열에 있는 문자 :a,p,l,i,c,t,o,n 문자 개수 : 8

		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = scanner.nextLine();

		char[] charArray = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			charArray[i] = str.charAt(i);
		}

	}

	public void practice14() {

//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("배열의 크기를 입력하세요 : ");
//		int input = sc.nextInt();
//		sc.nextLine();
//
//		String[] arr = new String[input];
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print((i + 1) + "번째 문자열 : ");
//			String inputLetter = sc.nextLine();
//		}
//
//		while (true) {
//			System.out.print("더 값을 입력하시겠습니까? (Y/N)");
//			if (arr.equals("Y")) {
//
//				System.out.print("더 입력하고 싶은 개수 : ");
//				int afterInput = sc.nextInt();
//				input += afterInput;
//				String[] letter = new String[input];
//				for (int i = 0; i < arr.length; i++) {
//					if (arr.length > i) {
//						arr[i] = letter[i];
//					} else {
//						System.out.printf("%d번째 문자열 : ", (i + 1));
//						letter[i] = sc.nextLine();
//					}
//				}
//				break;
//
//			}
//			if (arr.equals("N")) {
//				for (int i = 0; i < arr.length; i++) {
//
//				}
//			}
//		}
//
//	}
		Scanner sc = new Scanner(System.in);

		String[] array = null;
		String[] newArray = null;
		int size;
		char moreInput;
		int moreInputCount = 0;

		System.out.print("배열의 크기를 입력하세요 : ");
		size = sc.nextInt();
		sc.nextLine();

		array = new String[size];

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d번째 문자열 : ", i + 1);
			array[i] = sc.nextLine();
		}

		while (true) {

			System.out.print("더 값을 입력하시겠습니까? (Y/N) : ");
			moreInput = sc.next().charAt(0);

			if (moreInput == 'N' || moreInput == 'n')
				break;

			if (moreInput == 'Y' || moreInput == 'y') {

				System.out.print("더 입력하고 싶은 개수 : ");
				moreInputCount = sc.nextInt();
				sc.nextLine();

				newArray = new String[array.length + moreInputCount];

				System.arraycopy(array, 0, newArray, 0, array.length);

				for (int i = array.length; i < newArray.length; i++) {
					System.out.printf("%d 문자열 : ", i + 1);
					newArray[i] = sc.nextLine();
				}
				array = newArray;
			}
		}
		if (newArray == null)
			System.out.println(Arrays.toString(array));
		else
			System.out.println(Arrays.toString(newArray));

	}

	public void practice15() {

		String[][] array = new String[3][3];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = "(" + i + "," + j + ")";
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	public void practice16() {

		int[][] array = new int[4][4];
		int count = 1;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = count++;
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice17() {

		int[][] array = new int[4][4];
		int count = 16;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = count--;
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice18() {

		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				if (i != arr.length && j != arr.length) {
					arr[i][j] = (int) (Math.random() * 10 + 1);

					System.out.print(arr[i][j] + " ");
				} else if (i == 0 && j == 2) {
					arr[0][2] += arr[i][j];
				} else if (i == 1 && j == 2) {
					arr[1][2] += arr[i][j];
				} else if (i == 2 && j == 2) {
					arr[2][2] += arr[i][j];
				} else if (i == 2 && j == 0) {
					arr[2][0] += arr[i][j];
				} else if (i == 2 && j == 1) {
					arr[2][1] += arr[i][j];
				} else {
					arr[2][2] += arr[i][j];
				}
			}
			System.out.println();
		}

	}

	public void practice19() {

		Scanner sc = new Scanner(System.in);

		int rowSize;
		int colSize;
		char[][] array;

		while (true) {

			System.out.print("행 크기 : ");
			rowSize = sc.nextInt();

			if (rowSize < 1 || rowSize > 10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			} else
				break;
		}

		while (true) {

			System.out.print("열 크기 : ");
			colSize = sc.nextInt();

			if (colSize < 1 || colSize > 10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			} else
				break;
		}

		array = new char[rowSize][colSize];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (char) (Math.random() * ('Z' - 'A' + 1) + 'A');
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice20() {

		Scanner sc = new Scanner(System.in);

	

		System.out.print("행의 크기 : ");
		int rowCount = sc.nextInt();
		
		char[][] arr = new char[rowCount][];
		for (int i = 0; i < rowCount; i++) {
			System.out.print(i + " 열의 크기 : ");
			int colCount = sc.nextInt();
			arr[i] = new char[colCount];
		}
		
		int index = 0;
		
		for(int i = 0; i < rowCount; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char)(Math.random() * ('Z' - 'A' + 1) + 'A');
				System.out.print(arr[i][j] + " ");
				index++;
			}
			System.out.println();
		}
		
		

	}

}
