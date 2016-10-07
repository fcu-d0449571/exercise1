package exeee;

import java.util.Scanner;

public class StringComparator {
	public static void main(String[] args) {
		String a , b;
		System.out.println("Enter the first string:");
		Scanner scan = new Scanner(System.in);
		a = scan.nextLine();
		System.out.println("Enter the second string:");
		Scanner scan1 = new Scanner(System.in);
		b = scan1.nextLine();
		if( a.equals(b))
		System.out.printf("The two strings are the same.");
		else System.out.printf("The two strings are not the same.");
			
		
}
}

