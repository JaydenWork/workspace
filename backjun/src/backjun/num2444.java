package backjun;

import java.util.Scanner;

public class num2444 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("정수 입력 : ");

	int num = sc.nextInt();

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
	for (int i= num+1; i<=num+num-1;i++) {
		for(int x = 1; x > (num + num) - 1; x++) {
			if (x < num - i + 1 && x > num + i - 1) {
				System.out.print("*");
		}else {
			System.out.print(" ");
			
	}

}
	}
}
}