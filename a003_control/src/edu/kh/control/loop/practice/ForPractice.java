package edu.kh.control.loop.practice;

import java.util.Scanner;

public class ForPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : " );
		int input = sc.nextInt();
		
		if(input == 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else
			for(int i = 1; i<= 1; i++) {
				System.out.print(i+" ");
			}
	}
	
	
	public void practice2() {
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : " );
		int input = sc.nextInt();
		
		if(input == 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else
			for(int i = input; 1 <= i ; i--) {
				System.out.print(i+" ");
			}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int result = 0;
		
		for(int i = 1; i<=input; i++) {
			result += i;
			System.out.print(i);
			
			if(i!=input) {
				System.out.print("+");
			}
		}
		
		System.out.print("="+ result);
	}
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			for(int i = num2 ; i<= num1; i++) {
				System.out.print(i+" ");
			} 
			
		if(num1<num2) {
			for(int i = num1 ; i<= num2; i++) {
				System.out.print(i+" ");
		if(num1 == 0 || num2 ==0) {
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
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", input, i, i*input);
		}
		
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		if(input>=2 && input <=9) {
			for(int i = input; i<=9; i++) {
				for(int x = 1; x<=9; x++) {
					System.out.printf("%d x %d = %d\n",input, x, input*x);
				}
				System.out.printf();
			}
			
		}else
			System.out.println(" 2~9 사이 숫자만 입력해주세요.");
		
		
	}
}
	


