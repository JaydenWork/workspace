package edu.kh.operator.ex;

import java.util.Scanner;

public class OperatorEx1 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int peopleNum = sc.nextInt();
        int candyNum = sc.nextInt();

        System.out.println("인원 수 : " + peopleNum);
        System.out.println("사탕 개수 : " + candyNum);

        System.out.println("1인당 사탕 개수 : " + candyNum / peopleNum);
        System.out.println("남는 사탕 개수 : " + candyNum % peopleNum);

    }
}
