import java.util.Scanner;
public class weekdayname
{
  public static void main(String []args){
     int day;
     Scanner sc = new Scanner (System.in);
     System.out.print("Enter day number=");
     
     day = sc.nextInt();
     switch(day){
       case 1: System.out.print("monday");
       break;
        case 2: System.out.print("Tuesday");
       break;
        case 3: System.out.print("Wednesday");
       break;
        case 4: System.out.print("Thursday");
       break;
        case 5: System.out.print("Firday");
       break;
       case 6: System.out.print("Saterday");
       break;
       case 7: System.out.print("Sunday");
       break;
       default: System.out.print("not week name error");
         
     }
  }
}
