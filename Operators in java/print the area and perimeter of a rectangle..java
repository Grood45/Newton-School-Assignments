/*Qusetion=- Write a Java program to print the area and perimeter of a rectangle.*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter tha Width of rectangle = ");
		int w = sc.nextInt();
		System.out.print("Enter tha Height  of rectangle = ");
		int h = sc.nextInt();
		int area = w*h;
		int pet = 2*(w*h);
		System.out.println("area of rectangle=" +area);
		    System.out.println("perimeter of a rectangle=" +pet);
		
	}
}
