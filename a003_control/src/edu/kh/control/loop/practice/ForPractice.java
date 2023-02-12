package edu.kh.control.loop.practice;

import java.util.Scanner;

public class ForPractice {

	public void practice1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();

		if (input == 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else
			for (int i = 1; i <= 1; i++) {
				System.out.print(i + " ");
			}
	}

	public void practice2() {

		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();

		if (input == 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else
			for (int i = input; 1 <= i; i--) {
				System.out.print(i + " ");
			}
	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int result = 0;

		for (int i = 1; i <= input; i++) {
			result += i;
			System.out.print(i);

			if (i != input) {
				System.out.print("+");
			}
		}

		System.out.print("=" + result);
	}

	public void practice4() {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}

			if (num1 < num2) {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
					if (num1 == 0 || num2 == 0) {
						System.out.println("1이상의 숫자를 입력해주세");
					}

				}
			}
		}
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int input = sc.nextInt();

		System.out.printf("==== %d단 ====\n", input);

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", input, i, i * input);
		}

	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int input = sc.nextInt();

		if (input >= 2 && input <= 9) {
			for (int dan = input; dan <= 9; dan++) {
				System.out.printf("====%d====\n", dan);
				for (int x = 1; x <= 9; x++) {
					System.out.printf("%d x %d = %d\n", dan, x, dan * x);
				}
			}

		} else
			System.out.println(" 2~9 사이 숫자만 입력해주세요.");
	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int x = 1; x <= i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void practice8() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = num; i >= 1; i--) {
			for (int x = i; x >= 1; x--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice9() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 :");
		int num = sc.nextInt();

//		for(int i = 1; i<=num; i++) {
//			for(int j = 1;j<=num;j++)
//			{
//				if(j <= num - i)
//				{
//					System.out.print(" ");
//				}
//				else 
//				{
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}

//		for(int i = 0;i<num;i++)
//		{
//			for(int j = 1;j<num - i;j++)
//			{
//				System.out.print(" ");
//			}
//			
//			for(int j = 0;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}

	}

	public void practice10() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= (num + num - 1); i++) {
			if (i <= num) {
				for (int x = 1; x <= i; x++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int x = i; x <= num + num - 1; x++) {
					System.out.print("*");
				}
				System.out.println();
			}

		}
	}

	public void practice11() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");

		int num = sc.nextInt();

//		for(int i=1; i<=num; i++) {
//			for(int x = 1; x<=(num+num)-1; x++) {
//				if(x >= num-x+1 && x <= num+x-1) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();

		for (int i = 1; i <= num; i++) {
			for (int x = 1; x <= (num + num) - 1; x++) {
				if (x >= num - i + 1 && x <= num + i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void practice12() {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i == 1 || i == num) {
				for (int x = 1; x <= num; x++) {
					System.out.print("*");
				}
			} else {
				for (int x = 1; x <= num; x++) { // 가로로 반복한다는 뜻 xxxxx ->이렇게 찍어낼
					if (x == 1 || x == num) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

}
