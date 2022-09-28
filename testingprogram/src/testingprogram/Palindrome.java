package testingprogram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		System.out.println(isPalindrome(str));

	}

	private static boolean isPalindrome(String str) {
		StringBuilder sb=new StringBuilder(str)	;
		sb.reverse();
		String str2=sb.toString();
		if (str.equals(str2)) {
			return true;
		} else {
			return false;
		}
	}	    
}