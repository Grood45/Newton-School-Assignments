/*qusetion ;- Write a Java program for Array Find tha duplicate  number in array, input by user  an array */
import java.util.*; 
public class Main
{
	public static void main(String[] args) {
	    
	   Scanner sc = new Scanner (System.in);
	   System.out.print("Enter the size of Array = ");
	   int sn = sc.nextInt();
	        int[] a= new int [sn];
	        //input
	        for(int i=0 ;i<sn;i++){
	            System.out.print("Enter the "+i+"  index value = ");
	            a[i]= sc.nextInt();
	        }
	                    // ouput
	                    System.out.print("dublicate number are  = ");
	                    for(int i=0; i<a.length-1; i++)
	                    {
	                        
	                        for(int j=i+1; j<a.length; j++)
	                        {
	                        if((a[i]==a[j]) && (i!=j))
	                        {
	                            System.out.print(a[j]+" ");
	                           
	                        }
	                        } 
	                    }                                      
	}
}
