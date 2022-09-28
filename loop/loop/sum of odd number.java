/* Qusetion ;= Write a program in Java to display the n terms of odd natural number and their sum. 
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   System.out.print("enter tha number =");
	   int n = sc.nextInt();
	    int sum = 0;
	    for (int i=1;i<=n;i=i+2)
	    {
	       sum = sum+i;
	    }
	        System.out.print("sum of odd number = " +sum);
	}
}
