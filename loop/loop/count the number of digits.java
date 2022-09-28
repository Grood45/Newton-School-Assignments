/* Qusetion ;= Write a Java program that 
count the number of digits in  the number .
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   System.out.print("enter the number =");
	            int  n = sc.nextInt();
	    int count=0;
	    while(n>0){
	        n=n/10;
	        count++;
	    }
	    System.out.print(count);
	}
}
