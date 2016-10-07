
package exeee;		
import java.util.Scanner;
public class KeyboardScanner {

	public static void main(String[] args) {
		int abc = 0;
		float a =0;
		String b ;
		System.out.println("Enter a integer:");
		Scanner scan = new Scanner(System.in);
		abc = scan.nextInt();
		System.out.println("Enter a float point number:");
		Scanner scan1 = new Scanner(System.in);
		a = scan1.nextFloat();
		System.out.println("Enter a name:");
		Scanner scan2 = new Scanner(System.in);
		b = scan2.nextLine();

		 System.out.printf("Hi %s, the multiplication of %d and %f is %4.2e",b ,abc ,a,abc*a);
		 
		
	}

}	
