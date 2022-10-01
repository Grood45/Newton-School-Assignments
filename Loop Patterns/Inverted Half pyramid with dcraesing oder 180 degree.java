/*QUSETION ;- Print tha Inverted Half pyramid with dcraesing oder 180 degree  (RotTED BY 180 DEG).

 */
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    int n;
		Scanner sc = new Scanner (System.in);
		    System.out.print("Enter the  number = ");
	           	n = sc .nextInt();
	           
	           	        // outer loop
		             for(int i = n; i>=1 ; i--){
		                 // inner loop -> print space
		                 for (int j=1;j<=n-i;j++){
		                 System.out.print(" ");
		                     
		                 }
		                     // inner loop -> print star
		                     for(int j =1 ; j<=i; j++){
		                     System.out.print("*");
		                     }
		                      //outer loop print witn next line (ln)
		                 System.out.println();
		                     }
	                    }
		             }
		           
