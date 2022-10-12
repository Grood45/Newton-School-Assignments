/*qusetion ;- Write a Java program to Array copy into other Array , input by user  an array */
import java.util.*; 
public class Main
{
	public static void main(String[] args) {
	   
	     Scanner sc= new Scanner (System.in);
	     System.out.print("Enter tha size of Array= ");
	     int sn = sc.nextInt();
	            // first array
	            int[] a = new int [sn];
	            // second array
	            int [] b = new int [sn];
	       
	                   // input of Array
	                     for(int i =0; i<a.length; i++){
	                        System.out.print("Enter tha "+i+" index value = ");
	                         a[i]= sc.nextInt();
	                     } 
	                         // output first Array
	                         System.out.print("first array = ");
	                            for (int i = 0; i<a.length; i++){
	                                
	                               System.out.print(a[i] +" ");
	                            }
	                            //ouput first Array copy into second Array
	                           System.out.print("\nsecond (first copy) Array = ");
	                           for (int i = 0; i<b.length; i++){
	                               b[i]=a[i];
	                               System.out.print(b[i]+" ");
	                           }
	        }  
	                
	}           


