/*qustion;- Write a program to check if a year is leap year or not..*/


import java.util.Scanner;
class Main {
   public static void main (String[] args)
   {
          Scanner scanner = new Scanner(System.in);
       System.out.print("Enter tha year =");
       int year = scanner.nextInt();
      

   if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("YES");
      else
         System.out.println("NO");
   }
}