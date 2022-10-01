/*QUSETION ;- Print tha Inverted Half pyramid  with decreasing order  .

 */
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    int a,b;
		Scanner sc = new Scanner (System.in);
		    System.out.print("Enter   number = ");
	           	a = sc .nextInt();
	           
	           	        // outer loop
		             for(int i = a; i>=1 ; i--){
		                 // inner loop
		                 for (int j=1;j<=i;j++){
		                     // inner loop print
		                     System.out.print(j);
		                     }
		                      //outer loop print witn next line (ln)
		                 System.out.println();
		                     }
		                
		             }
		             }
		           
