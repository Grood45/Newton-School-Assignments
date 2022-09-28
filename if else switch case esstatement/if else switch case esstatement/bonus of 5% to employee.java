/* Qustion;- A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount..*/

import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your service year =");
	       int year = sc.nextInt();
	       
		
    if(year>5){
      System.out.println("congratulation of 5% bouns on your salary " );
      
      System.out.println("enter you salary");
      int sal = sc .nextInt();
      System.out.println("you boun is"+ " =" +sal*0.05);
      System.out.println("total salary with 5% bouns =" + " "+(sal+(sal*0.05)));
    }
    else{
      System.out.println("No discount");
}
}
}


