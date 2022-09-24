/*qusetion;- .Write a Java program to print the area and perimeter of a circle
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.print("Enter of redius of circle=");
	    double r = sc.nextDouble();
	   double pr = 2 * Math.PI * r;
        double area = Math.PI * r * r;
	    System.out.println("area of circle =" +area);
	        System.out.println("perimeter  of circle =" + pr);
	}
}
