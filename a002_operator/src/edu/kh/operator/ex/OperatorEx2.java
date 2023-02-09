package edu.kh.operator.ex;

import java.util.Scanner;

public class OperatorEx2 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);


        int grade = sc.nextInt();
        int ban = sc.nextInt();
        int num1 = sc.nextInt();
        String name1 = sc.next();
        String sex = sc.next();
        double point = sc.nextDouble();

        System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다",
                grade, ban, num1, name1, sex, point);


    }
}