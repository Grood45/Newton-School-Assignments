import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
   
   int a,b;
   Scanner sc = new Scanner(System.in);
      a = sc.nextInt();
      b = sc.nextInt();

      if (a<=10 && b>=10){
        System.out.print("true" +   " ");
      }else {
      System.out.print("false" +   " ");
    } if (a%2==0 || b%2==0){
   System.out.print("true" +   " ");
    }else {
        System.out.print("false" +  " ");
} if(a!=b){
 System.out.print("true" +  " ");
}else {
        System.out.print("false" +   " ");
    }
    }
}