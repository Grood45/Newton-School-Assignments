/*QUSETION ;- Print tha 0 to 1 Tringle.

 */
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    int n, sum;
		Scanner sc = new Scanner (System.in);
		    System.out.print("Enter the  number = ");
	           	n = sc .nextInt();
	           
	           	        // outer loop
		             for(int i = 1; i<=n ; i++){
		                 // inner loop
		                 for (int j=1;j<=i;j++){
		                     sum = i+j;
		                  // conditions i and j sum is even or add
		                  if (sum %2==0){
		                      System.out.print("1 ");
		                  }else {
		                      System.out.print("0 ");
		                 }
		               }
		                            //outer loop print witn next line (ln)
		                             System.out.println();
		                  }
	               }
}
		           
