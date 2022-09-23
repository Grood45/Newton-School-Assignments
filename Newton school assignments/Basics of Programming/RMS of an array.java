import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        double  ans = 0.0, temp=0.0;
        int arr [] = new int [n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            temp+=arr[i]*arr[i];
        }
        temp/=n;
        ans=Math.sqrt(temp);
        System.out.printf("%.6f",ans);

        }
    }