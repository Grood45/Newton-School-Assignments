/* Qusetion ;= print n number of "Hello world" */
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   System.out.print("enter tha number =");
	   int n = sc.nextInt();
	    for (int i=1;i<=n;i++)
	    {
	        System.out.println("Hello world");
	    }

	}
}
