import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
   
   int temp;
   Scanner sc = new Scanner(System.in);
      temp = sc.nextInt();
    temp = ((temp - 32)*5)/9;
    System.out.println(temp);
    
    }
}