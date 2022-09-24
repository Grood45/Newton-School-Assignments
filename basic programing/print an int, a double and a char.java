/*question ;-Write a Java program input take by user print an int, a double and a char on screen..*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.print("Enter tha int value = ");
	        int a =sc. nextInt();
	            System.out.print("Enter tha doublr value= ");
	                double d = sc.nextDouble();
	                    System.out.print("Enter tha char value= ");
	                    char ch = sc.next().charAt(0);
		               System.out.println("int value = "+a);
	               System.out.println("double value =" +d);
                System.out.println("char value= " +ch);
	}
}
