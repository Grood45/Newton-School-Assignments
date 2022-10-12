import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    int a ,b, c,d,e;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
     b = sc.nextInt();
      c = sc.nextInt();
       d = sc.nextInt();
       e  = sc.nextInt();
       int arg = (a+b+c+d+e)/5;

      
        if( arg>=80){
           System .out.print('A');
        }else if (arg<80 && arg>=60){
            System .out.print('B');
    } else if  (arg<60 && arg>=40){
         System .out.print('C');
         }else{
             System .out.print('D');
         }
    }
}