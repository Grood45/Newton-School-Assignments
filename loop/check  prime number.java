/* Qusetion ;=Write a program to check  prime number  or not prime number .
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   System.out.print("enter the number =");
	            int  n = sc.nextInt();
	            int count= 0;
	               
                    for (int i = 1; i<=n; i++)
                       if (n%i==0){
                           count ++;
                          } if (count ==2){
                              System.out.print("prime number");
                          }else{
                              System.out.print("not prime number");
                          }
                          }
                       
	               
	
}
