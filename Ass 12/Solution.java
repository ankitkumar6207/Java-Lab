import java.util.Scanner;

class Number{
    int arr[];
    Number()
    {

    }
    Number(int n)
    {
        Scanner sc = new Scanner(System.in);
        arr = new int[n];
        System.out.println("enter "+n +" array elements");
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    public int  count()
    {
        int count =0;
       
        for(int i = 0;i<this.arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                count+=1;

            }
          

        }

        return count;
    }


    public void display()
    {
        System.out.println("array elements are");
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }



}

class OddNum extends Number{
    int array[];
   

   
    OddNum()
    {
        int n = count();
        array = new int[n];
        System.out.println("hello");
    }

    public void copy()
    {
        int m =0;
        for(int i =0;i<arr.length;i++)

        {
            if(arr[i]%2!=0)
            {
                array[m]=arr[i];
                m++;
            }
        }
    }
    public void display()
    {
        System.out.println("odd array elements are");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }




}

// class PrimeNum extends OddNum{
//     int ar[];

// }
public class Solution {
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
    
        int n= sc.nextInt();
        Number obj = new Number(n);
        obj.display();
        obj.count();
        OddNum obj1 = new OddNum();
        obj1.copy();
        obj1.display();
     


    }
  

}
