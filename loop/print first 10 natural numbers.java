/* Qusetion ;= Write a program in Java to display the first 10 natural numbers 
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
	        System.out.print(i +" ,");
	    }
	}
}
