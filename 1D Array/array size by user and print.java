/*QUESTION = write a program  take a size of array by user than print array */

import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    int size;
	    Scanner sc = new Scanner (System.in);
	    System.out.print("Enter size of Array  = ");
	     size = sc. nextInt();
	     int [] a= new int [size];
	     // input save array value loop
	         for (int i = 0; i<size; i++){
	         System.out.print("Enter " +i+ " index array value = ");
	         a[i] = sc.nextInt();
	         }
	         // print Array loop
	         for (int i = 0; i<size; i++){
	         System.out.print(a[i] +" ");
	    
	        }  
	}               
    
}
	       
	    
	   
	 
	 
	 
