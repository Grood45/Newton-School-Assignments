/*QUESTION;- Take three numbers from the user and print the greatest number*/

import java .util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the fist number =");
		a = sc .nextInt();
		System.out.print("Enter the seccond number =");
			b = sc .nextInt();
			System.out.print("Enter the third number =");
				c = sc .nextInt();
				if (a>b && a>c){
				    System.out.println("a is greatest number ");
				}else if (b>a && b>c){
				    System.out.println("b is greatest number ");
				}else{
				    System.out.println("c is greatest number ");
				}
				
	}
}
