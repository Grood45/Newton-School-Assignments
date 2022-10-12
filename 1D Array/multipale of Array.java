/*qusetion ;- Write a Java program for Array multipale of Array Element , input by user  an array */
import java.util.*; 
public class Main
{
	public static void main(String[] args) {
	   int mult=1;
	     Scanner sc= new Scanner (System.in);
	     System.out.print("Enter tha size of Array= ");
	     int sn = sc.nextInt();
	            //  array
	            int[] a = new int [sn];
	           
	                   // input of Array
	                     for(int i =0; i<a.length; i++){
	                        System.out.print("Enter tha "+i+" index value = ");
	                         a[i]= sc.nextInt();
	                     } 
	                            //output Array
	                            System.out.print("Multipale of Array Element = ");
	                         for(int i =0; i<a.length; i++){
	                             mult = mult*a[i];
                    	}
	                             System.out.print(mult);
	                           
	                                    
	        }  
	                
	}           


