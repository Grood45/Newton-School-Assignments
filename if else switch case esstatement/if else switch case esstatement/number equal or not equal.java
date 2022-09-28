/* Qusetion ;= Write a Java program that accepts three numbers and prints 
"All numbers are equal" if all three numbers are equal,
"All numbers are different" if all three numbers are different and 
"Neither all are equal or different" otherwise.
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
	    if (a==b&&b==c){
	        System.out.println("All numbers are equal");
	    }else if (a!=b&&b!=c){
	        System.out.println("All numbers are different");
	    }else{
	        System.out.println("Neither all are equal or different");
	    }
	    
	    
	}
}
