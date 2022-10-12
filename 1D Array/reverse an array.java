/*qusetion ;- Write a Java program to reverse an array of integer values*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	     Scanner sc= new Scanner (System.in);
	     System.out.print("Enter tha size of Array= ");
	     int sn = sc.nextInt();
	            int[] a = new int [sn];
	            for(int i =0; i<a.length; i++){
	            System.out.print("Enter tha "+i+" index value = ");
	            a[i]= sc.nextInt();
	}
	                for (int i=sn-1; i>=0; i--)
	                System.out.print( "reverse an array "+a[i]+" ");
		             
		             
		         } 
		           
	}

