package edu.kh.array.practice;

public class ArrayPractice {

	
	public void practice1() {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			sum+= arr[i];
			if(arr[i] %2 == 0) {
				System.out.println(sum);
			} 
				
			
		}
		
		
	}
}
