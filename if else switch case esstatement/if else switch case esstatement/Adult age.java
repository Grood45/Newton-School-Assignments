/*check the age Adult */
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
	        age = sc.nextInt();
	
		
		if (age>18){
		    System.out.print("Adult");
		}else{
		    System.out.print("not Adult");
		}
		}
}


