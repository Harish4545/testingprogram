package testingprogram;

import java.util.Scanner;

public class SecondLorgestNumber {

	public static void main(String[] args) {
		
		/*
		 * Scanner sc=new Scanner(System.in);
		 * 
		 * System.out.println("Enter the number of elements");
		 * 
		 * int n=sc.nextInt();
		 * 
		 * int arr[]=new int[n];
		 * 
		 * for (int i = 0; i <n; i++) { arr[i]=sc.nextInt(); }
		 */
int arr[]= {44,66,77,663,44,665};
		int temp;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
			
		}
		System.out.println(arr[arr.length-2]);
	}
}

