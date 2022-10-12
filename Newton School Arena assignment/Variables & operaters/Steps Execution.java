import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
  Scanner sc =new Scanner(System.in);

int n = sc.nextInt ();

int p= 8;

int number= ((n+p)/3);

int number2 =(number%5)*5;

System.out.println(number2);
    }
}