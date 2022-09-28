/* Qusetion ;= Write a program in Java to display the cube of the number upto given an integer
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   System.out.print("enter tha number =");
	   int n = sc.nextInt();
	    
	    for (int i=1;i<=n;i++)
	    {
	        System.out.println("Number is " +i+" and cube of " +i+" is = "+(i*i*i));
	    }
	    
	}
}
