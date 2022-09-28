/* Qusetion ;= Write a program that accepts three numbers from the user and prints "increasing" 
if the numbers are in increasing order, "decreasing" 
if the numbers are in decreasing order, and 
"Neither increasing or decreasing order" otherwise.
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   System.out.print("enter first number =");
	            int a = sc.nextInt();
	   System.out.print("enter second number =");
	       	   int b = sc.nextInt();
	   System.out.print("enter thared number =");
	       	   int c = sc.nextInt();
	    if (a<b&&b<c){
	        System.out.println("Increasing order");
	    }else if (a>b&&b>c){
	        System.out.println("Dicreasing order");
	    }else{
	        System.out.println("Neither increasing or decreasing order");
	    }
	    
	    
	}
}
