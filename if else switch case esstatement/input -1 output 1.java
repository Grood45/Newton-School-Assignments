/* Qustion;-Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1*/

import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter  inpu  =");
	       int n = sc.nextInt();
	       if (n<0){
	       System.out.print( (+(-1*n)));
	       }else{
	           System.out.println(n);
	       
}
}
}

