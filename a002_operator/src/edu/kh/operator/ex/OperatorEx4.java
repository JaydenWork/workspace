package edu.kh.operator.ex;

import java.util.Scanner;

public class OperatorEx4 {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

	    int korea = sc.nextInt();
	    int english = sc.nextInt();
	    int math = sc.nextInt();
	    int avg = (korea+english+math)/3;
	    int point = korea + math + english;

	        System.out.println("국어 : " + korea );
	        System.out.println("영어 : " + english);
	        System.out.println("수학 : " + math);
	        System.out.println("\n");
	        System.out.println("합계 : "+ point);
	        System.out.println("평균 : "+ avg);
	        System.out.println(korea>=40 && english>=40 && math>=40 && avg>=60 ?"합격" : "불합격");
	    }
	}