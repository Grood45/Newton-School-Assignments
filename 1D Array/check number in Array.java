/*QUESTION = Write a program  to check number in Array */

import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    int size;
	    boolean isarray = true;
	    
	    Scanner sc = new Scanner (System.in);
	    // input size of array 
	    System.out.print("Enter array size = ");
	     size = sc.nextInt();
	     
	     // input chexk number present in array
	      System.out.print("check index value = ");
	         int num = sc.nextInt();
	         
	         // input array value
	     int[] a= new int [size];
	         for (int i = 0 ; i<size; i++){
	             System.out.print("Enter "+ i+ " index Array value = ");
	             a[i] = sc.nextInt();
	         }
	         
	         // check value of array
	         for (int i = 0 ; i<size; i++){
	             
	              if (num == a[i]){
	                    isarray = true;
	         break;
	              }
	        }  
	        
	        // print yas and not
	         if (isarray){
	             System.out.print(num " "+ "This value is present in array");
	         }else{
	             System.out.print(num " "+"This value is present in array" );
	         }
	         }
	             
	         
	        
	         
	        
	}  
	               
    

	    
	   
	 
	 
	 
