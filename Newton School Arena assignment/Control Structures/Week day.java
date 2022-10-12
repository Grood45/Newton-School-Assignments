import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
   int  day;
   Scanner sc = new Scanner(System.in);
   day = sc.nextInt();
  //String dayString;
  
  if (day==1){
  System.out.println("Monday");
  }else if (day==2){
      System.out.println("Tuesday");
    }else if (day==3){
      System.out.println("Wednesday");
      
    }else if (day==4){
      System.out.println("Thursday");
    }else if (day==5){
      System.out.println("Friday");
    }else if (day==6){
      System.out.println("Saturday");
      }else if (day==7){
      System.out.println("Sunday");
      }
    }
}