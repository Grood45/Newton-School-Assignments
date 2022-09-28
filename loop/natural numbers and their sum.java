/* Qusetion ;= Write a program in Java to display n terms of natural numbers and their sum.
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   System.out.print("enter tha number =");
	   int n = sc.nextInt();
	    int sum =0;
	    for (int i=1;i<=n;i++)
	    {
	        System.out.println(i);
	        sum = sum +i;
	    }
	    System.out.println("sum of "+n+" natural number =" +sum);
	}
}
