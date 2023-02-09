package edu.kh.operator.ex;

import java.util.Scanner;

public class OperatorEx3 {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

	    int num1 = sc.nextInt();

	        System.out.println("정수 입력 : " + num1);
	        System.out.println(num1 == 0 ? "0 입니다" : ((num1 < 0) ? "음수입니다" : "양수입니다"));

	    }
	}