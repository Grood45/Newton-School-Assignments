import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
  
  Scanner sc=new Scanner(System.in);
        int P=sc.nextInt();
        int Q=sc.nextInt();
        int R=sc.nextInt();
        int S=sc.nextInt();
        if(!chk(P) || !chk(Q) || !chk(R) || !chk(S)) return;
        int marks=0;
        if(marks<P) marks=P;
        if(marks<Q) marks=Q;
        if(marks<R) marks=R;
        if(marks<S) marks=S;
        System.out.println(marks);
    }
    public static boolean chk(int aa){
        return (aa>=0 && aa<=100)?true:false;

    }
}