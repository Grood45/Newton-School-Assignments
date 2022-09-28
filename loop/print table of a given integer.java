/* Qusetion ;= print n number of table by loop */
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   System.out.print("enter tha number");
	   int n = sc.nextInt();
	    for (int i=1;i<=10;i++)
	    {
	        System.out.println(n+"*"+i+"="+(n*i));
	    }

	}
}
