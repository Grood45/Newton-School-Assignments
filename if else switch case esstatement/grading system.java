/* Qustion;- A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.*/

import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your grad =");
	       int grad = sc.nextInt();
	 if (grad<25){
	       System.out.println("F");
	}else if (grad >25 && grad<=45) {
		   System.out.println("E");
	}else if (grad >45 && grad<=50){
	        System.out.println("D");
	}else if (grad >50 && grad<=60){
	        System.out.println("C");
	}else if (grad >60 && grad<=80){
	         System.out.println("B");
	}else{
	         System.out.println("A");
	} 
}
}


