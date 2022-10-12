/*qusetion ;- Write a Java program to find the frequency 
 of the number , input by user  an array */
import java.util.*; 
public class Main
{
	public static void main(String[] args) {
	    int count=0;
	     Scanner sc= new Scanner (System.in);
	     System.out.print("Enter tha size of Array= ");
	     int sn = sc.nextInt();
	        
	        System.out.print("Enter tha number of frequency= ");
	         int fn = sc.nextInt();
	         
	            int[] a = new int [sn];
	            // input of array
	            for(int i =0; i<a.length; i++){
	            System.out.print("Enter tha "+i+" index value = ");
	            a[i]= sc.nextInt();
	}                       
                          // output for frequency of tha numnber
	                    for (int i=0; i<a.length; i++){
	                        
	                            if(a[i]==fn)
	                               count= count+1;
	                            }
	                                System.out.print("frequency of tha "+fn+"= "+count);
	                            
	                    }
	                
	}           
	

