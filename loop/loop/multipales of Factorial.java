/* Qusetion ;= multipales of Factorial of any number n is represented by .
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   System.out.print("enter the number =");
	            int  n = sc.nextInt();
	            int fuct=1;
	    for (int i = n ;i>=1;i--){
	        fuct = fuct*i;
	        
	    }
	    System.out.print("multipal result of "+n+ " number facter " +fuct);
	}
}
