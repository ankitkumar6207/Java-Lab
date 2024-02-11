class Pattern1{
  public static void main(String args[]){
    int r = 5;
    int c = 5;
    int n = 5;
    int i,j;
    for(i=0;i<r;i++)
    {
       for(j=0;j<c;j++)
       {
          if(i==j || i==n-1-j)
           {
             System.out.print("1 ");
           }
          else
           {
             System.out.print("0 ");
           }
        }
        System.out.println();
     }
   }
}