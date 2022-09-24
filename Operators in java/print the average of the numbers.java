/*qusetion;- .Write a Java program that takes three numbers as input to calculate 
and print the average of the numbers
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.print("Enter tha first number=");
	    int a = sc.nextInt();
	     System.out.print("Enter tha second number=");
	        int b = sc.nextInt();
	        System.out.print("Enter tha thared number=");
	            int c = sc.nextInt();
	                int avg = (a+b+c)/3;
	        System.out.println(avg);
	}
}
