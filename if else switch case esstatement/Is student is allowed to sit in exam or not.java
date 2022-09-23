/* Qustion;-A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/

import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter  class held  =");
	       int n = sc.nextInt();
	       System.out.print("enter  class attend  =");
	       int x = sc.nextInt();
	       float pf = (n/x)*100;
	       
	      if(pf>=75){
                System.out.println("eligible:"+pf);
            }else{ 
                System.out.println(" not eligible:"+pf);
}
}
}
