import java.util.*;
public class PrimeFactors{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num,i,fact,prime;
    System.out.print("Enter the numbers : ");
    num = sc.nextInt();
    System.out.println("Prime factors");
   
    for(i=1;i<num;i++)
    {
      if(num%i==0)
      {
        fact = i;
        int c = 0;
        for(int j = 1;j<=fact;j++)
        {
           if(fact%j==0)
           {
              c++;
           }
        }
        if(c==2)
        {
           System.out.println(fact);
        }
      }
      
    }
    
  }
}