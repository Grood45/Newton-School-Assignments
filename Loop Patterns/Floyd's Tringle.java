/*QUSETION ;- Print tha Floyd's Tringle.

 */
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    int n, num=1;
		Scanner sc = new Scanner (System.in);
		    System.out.print("Enter the  number = ");
	           	n = sc .nextInt();
	           
	           	        // outer loop
		             for(int i = 1; i<=n ; i++){
		                 // inner loop -> print space
		                 for (int j=1;j<=i;j++){
		                 System.out.print(num+" ");
		                     num++;
		                 }
		                      //outer loop print witn next line (ln)
		                 System.out.println();
		                     }
	                    }
}
		           
