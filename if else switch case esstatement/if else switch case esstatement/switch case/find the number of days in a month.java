/*QUESTION ;- Write a Java program to find the number of days in a month*/

import java.util.Scanner;
public class Main
{
  public static void main(String []args){
     int month ,year ;
     Scanner sc = new Scanner (System.in);
     System.out.print("Enter day manth =");
     month = sc.nextInt();
     System.out.print("Enter day year =");
     year = sc.nextInt();
     switch(month){
       case 1: System.out.print("January" + " "+ year + "have "+ " 31 days");
       break;
     case 2:
      if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
          System.out.println("February"+ " "+ year + "have "+ " 29 days");
          }else{
              System.out.println("February"+ " "+ year + "have "+ " 28 days");
          }
      
       break;
        case 3: System.out.print("March" + " "+ year + "have "+ " 31 days");
       break;
        case 4: System.out.print("April" + " "+ year + "have "+ " 30 days");
       break;
        case 5: System.out.print("May" + " "+ year + "have "+ " 31 days");
       break;
       case 6: System.out.print("June" + " "+ year + "have "+ " 30 days");
       break;
       case 7: System.out.print("July" + " "+ year + "have "+ " 31 days");
       break;
       case 8 : System.out.print("August" + " "+ year + "have "+ " 31 days");
       break;
       case 9: System.out.print("September" + " "+ year + "have "+ " 30 days");
       break;
        case 10: System.out.print("October" + " "+ year + "have "+ " 31 days");
       break;
       case 11: System.out.print("November" + " "+ year + "have "+ " 30 days");
       break;
       case 12: System.out.print("December" + " "+ year + "have "+ " 31 days");
       break;
        default: System.out.println("error"); 
     }
  }
}

