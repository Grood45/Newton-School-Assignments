// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt();
        int[] alpha=new int[]{a,b,c,d};
        if(chkNumber(alpha)){
            int cal=(a+b+c+d)/4;
            System.out.println(cal);
        }
    }
    public static boolean chkNumber(int[] aa){
        for(int x=0; x<4;x++){
            if(aa[x]<1 && aa[x]>100){
                return false;
            }
        }
        return true;
    }
}