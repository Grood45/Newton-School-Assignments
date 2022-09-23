import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
   int a,b,c;
   Scanner sc = new Scanner(System.in);
   a = sc.nextInt();
   b = sc.nextInt();
   c= sc.nextInt();

   if (a>b && a>c){
       System.out.println(a);
      } else if (b>a && b>c){
          System.out.println(b);
      }else{
          System.out.println(c);

   

      }
    }
}