/* Qusetion ;=Calculate the sum of digits of a number given by user. E.g.-
INUPT : 123        OUPUT : 6
INUPT : 12345        OUPUT : 15
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   System.out.print("enter the number =");
	            int  n = sc.nextInt();
	                int sum= 0;
	                    while (n>0){
	                int temp =n%10;
	               sum=sum+temp;
	            n=n/10;
	            }
	   System.out.println(sum);
	    
	}
}
