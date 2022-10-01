/*QUSETION ;- Print tha Inverted Half pyramid with increasing oder (RotTED BY 180 DEG).

 */
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    int n;
		Scanner sc = new Scanner (System.in);
		    System.out.print("Enter   number = ");
	           	n = sc .nextInt();
	           
	           	        // outer loop
		             for(int i = 1; i<=n ; i++){
		                 // inner loop -> print space
		                 for (int j=1;j<=n-i;j++){
		                 System.out.print(" ");
		                     
		                 }
		                     // inner loop -> print star
		                     for(int j =1 ; j<=i; j++){
		                     System.out.print(j);
		                     }
		                      //outer loop print witn next line (ln)
		                 System.out.println();
		                     }
	                    }
		             }
		           
