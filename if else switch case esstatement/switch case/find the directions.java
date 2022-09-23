/*QUESTION ;- Write a Java program to find the directions*/

import java.util.Scanner;
public class Main
{
  public static void main(String []args){
     Scanner sc = new Scanner (System.in);
     System.out.print("Enter day direction first letter =");
     char ch = sc.next().charAt(0);
     switch(ch){
         case 'E': System.out.println("East");
         break;
         case 'W': System.out.println("West");
         break;
         case 'N': System.out.println("North");
         break;
         case 'S': System.out.println("South");
         break;
        default: System.out.println("not direction");
     }
  }
}

