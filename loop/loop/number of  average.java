/* Qusetion ;= print n number of  average 
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   System.out.print("enter tha number =");
	   int n = sc.nextInt();
	    
	    int sum = 0;
	    for (int i=1;i<=n;i++)
	    {
	        sum = sum +i;
	    }
	    int avg = sum/n;
            System.out.print("average of " + n +" "+"number ="+ avg);
	}
}
