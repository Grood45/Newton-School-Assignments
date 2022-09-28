/* Qusetion ;= print odd number 
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   System.out.print("enter tha number =");
	   int n = sc.nextInt();
	    
	    for (int i=1;i<=n;i=i+2)
	    {
	       System.out.print(i+" ");
	    }
	       
	}
}
