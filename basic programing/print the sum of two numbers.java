/*qusetion;- Write a Java program to print the sum of two numbers.*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int a, b;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter first number = ");
		    a = sc.nextInt();
		    System.out.print("Enter second number = ");
		         b = sc.nextInt();
		         System.out.println(a+b);
	}
}
