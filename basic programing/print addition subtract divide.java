/*qusetion;- .Write a Java program to print the sum (addition), multiply, subtract, 
divide and remainder of two numbers.
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int num1, num2;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter first number = ");
		    num1 = sc.nextInt();
		    System.out.print("Enter second number = ");
		         num2 = sc.nextInt();
		         System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		            System.out.println(num1 + " - " + num2 + " = " + (num1 -num2));
		               System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	}
}
