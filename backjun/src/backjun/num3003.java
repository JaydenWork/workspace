package backjun;

import java.util.Scanner;

public class num3003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] pieceCounts = new int[6];
		int[] requiredCounts = { 1, 1, 2, 2, 2, 8 }; // 킹, 퀸, 룩, 비숍, 나이트, 폰 각각 필요한 개수
		for (int i = 0; i < 6; i++) {
			pieceCounts[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < 6; i++) {
			int diff = requiredCounts[i] - pieceCounts[i];
			System.out.print(diff + " ");
		}

	}
}
