/*QUESTION = SUM OF ARRAY*/

import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	int size, sum= 0;
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter tha array size = ");
	size = sc.nextInt();
	int a[]= new int [size];
	
	for (int i =0 ; i<size; i++){
	    System.out.print("enter tha number =");
	    a[i]= sc.nextInt();
	}
	    for (int i= 0; i<size;i++)
	      sum= sum+a[i];
	      System.out.print("sum of ARRAY "+sum);
	    
	 }
}