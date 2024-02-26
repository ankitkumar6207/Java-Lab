import java.util.*;
public class PrintNumber{
   public static void main(String args[]){
     int i,num,sum=0,rem,org,org1;
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number : ");
     num = sc.nextInt();
     org = num;
     org1 = num;
     while(num>0)
     {
       rem = num%10;
       sum+=rem;
       num/=10;
     }
     System.out.println("Sum of digits of "+org+" : "+sum);
     int count ;
     
    
     while(sum>0){
       int digit = sum%10;
         org1 = org;
         count =0;
         int y=0;
      while(org1>0){
         y = org1%10;
       if(y==digit){
          count++;
          
       }
      
      org1/=10;

     }
sum/=10;
System.out.print(digit + " ");
     System.out.println("\n Number of times "+digit+" comes "+count);  
   }
  }
}