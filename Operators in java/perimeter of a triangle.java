/*question ;-Write a program to calculate the perimeter of a triangle  take a input by user .*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.print("Enter tha first aram of triangle = ");
	        int aram1 =sc. nextInt();
	            System.out.print("Enter tha second aram of triangle = ");
	                int aram2 =sc.nextInt();
	                    System.out.print("Enter tha thared aram of triangle = ");
	                        int aram3 = sc.nextInt();
	                    int pra = aram1+aram2+aram3;
	            System.out.println("perimeter of a triangle = "+pra);
	               
	}
}
