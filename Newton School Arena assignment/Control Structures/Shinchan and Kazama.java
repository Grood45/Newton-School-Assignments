import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
   
   int A,B,S;
   Scanner sc = new Scanner (System.in);
     A =sc.nextInt();
   B =sc.nextInt();
   S =sc.nextInt();
   int D = A-B;
   
if (D/S>0) {
System.out.print(D/S);
}else{
  System.out.print(D/S - 2*(D/S));


}
    }
}