static char Race(int A,int B,int C){
 int disS = Math.abs(C-B);
 int disN = Math.abs(C-A);
   if (disS == disN){
       return 'D';
   }else if (disN > disS){
       return 'S';
   }else {
       return 'N';
}
}