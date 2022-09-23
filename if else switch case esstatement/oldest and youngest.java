/* Qustion;-Take input of age of 3 people by user and determine oldest and youngest among them.*/

import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter  A age =");
	       int a = sc.nextInt();
	       System.out.print("enter  B age =");
	       int b = sc.nextInt();
	       System.out.print("enter  C age =");
	       int c = sc.nextInt();
	 if (a>b && a>b){
	       System.out.println("a is oldest ");
	}else if (b>a && b>c) {
		   System.out.println("b is oldest");
	}else{
	         System.out.println("c is oldest");
	} 
	 if (a<b && a<b){
	       System.out.println("a is youngest ");
	}else if (b<a && b<c) {
		   System.out.println("b is youngest");
	}else{
	         System.out.println("c is youngest");
	} 
}
}


