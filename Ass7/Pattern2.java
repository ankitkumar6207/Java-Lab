class Pattern2{
   public static void main(String args[]){
     int n = 5;
     int i,j;
     for(i=0;i<5;i++)
     {
       for(j=n;j>0;j--)
       {
          System.out.print(j+" ");
       }
       n--;
       System.out.println();
     }
   }
}