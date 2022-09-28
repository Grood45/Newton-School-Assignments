/* Qusetion ;=Write a program to print to all prime number n 1 to n number .
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   System.out.print("enter the number =");
	            int  n = sc.nextInt();
	            int count;
	             for (int i =1;i<=n;i++)
	             {
	                 count =0;
	                 for (int j=1;j<=i;j++)
	                 {
	                     if (i%j==0)
	                         count++;
	                 }
	                         if (count==2){
	                             System.out.print(i+" ");
	                         }
	                     }
	                 }
	             }
	
