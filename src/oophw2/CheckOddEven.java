package exeee;
import java.util.Scanner; 
public class CheckOddEven {

	public static void main(String[] args) {
		 int enternumber; 
		 Scanner input = new Scanner(System.in); 
		 System.out.println("please intput the Number:"); 
		 enternumber = input.nextInt(); 
		 if(enternumber%2==0)
		 System.out.printf("The input integer is Even Number",enternumber); 
		 else System.out.printf("The input integer is Odd Number",enternumber); 
		 } 
	}
