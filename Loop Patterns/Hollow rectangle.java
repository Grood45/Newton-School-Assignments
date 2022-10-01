/*QUSETION ;- Print tha Hollow rectangle.

 */
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    int a,b;
		Scanner sc = new Scanner (System.in);
		    System.out.print("Enter  first number = ");
	           	a = sc .nextInt();
	           	System.out.print("Enter second number = ");
	           	b = sc .nextInt();
	           	        // outer loop
		             for(int i = 1; i<=a ; i++){
		                 // inner loop
		                 for (int j=1;j<=b;j++){
		                     //conditions of i and j
		                     if (i==1 ||j == 1 || i==a||j==b){
		                         System.out.print("*");
		                     }else{
		                         System.out.print(" ");
		                     }
		                     }
		                 //outer loop print witn next line (ln)
		                 System.out.println();
		             }
		             }
	}	           
