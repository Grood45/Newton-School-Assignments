import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                 // Your code here
   
   Scanner sc= new Scanner(System.in);
      int n = sc.nextInt();
        
      
      Switch (n);
{
      case 1: 
      System.out.println("even" + (n%2==0));
      break;
      case 2: 
      System.out.println("odd" );
      break;
      default : System.out.println("not result");
}
    }
}