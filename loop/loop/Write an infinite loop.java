/* Qusetion ;= Write an infinite loop.
A inifinte loop never ends. Condition is always true. .
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   System.out.print("enter the number =");
	            int  n = sc.nextInt();
	            
	    for (int i = 1 ;i<=n;i--){
	       
	        System.out.print(i);
	    }
	    
	}
}
