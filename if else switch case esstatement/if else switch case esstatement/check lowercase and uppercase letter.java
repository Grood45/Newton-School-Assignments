/*qustion;- Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).*/
/* ASCII table 
capital letter (A-Z = 65-90)
SMALL LATTER (a-b = 97 - 122)*/

import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("enter tha character=");
		char ch = sc.next().charAt(0);
		if (ch>=65 && ch<=90){
		    System.out.println(ch +" "+"is CAPITAL LETTER");
		}else{
		    System.out.println(ch +" "+"is SMALL LETTER");
		}
	}
}
