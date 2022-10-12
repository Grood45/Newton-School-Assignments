import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner (System.in);
     int sn = sc.nextInt();
     int[] a = new int[sn];
        for (int i=0; i<sn;i++){
            a[i] = sc.nextInt();
        }
            int count=1;
            int max= a[0];
            for (int i=0; i<sn;i++){
                if(max<a[i]){
                    ++count;
                    max=a[i];
                }

        }
     System.out.print(count);
    }
}