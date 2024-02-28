import java.util.Scanner;
class MyArray{
    Scanner sc = new Scanner(System.in);
    int arr[];
    int size;


public MyArray(int size)
{
      this.size = size;   
      arr = new int[size];
      System.out.println(size);
    
}

public void input()
{
    System.out.println("enter the array elements");
    for(int i=0;i<size;i++)
    {
        arr[i]=sc.nextInt();
    }
}

public void display()
{
    System.out.println("array elements are");
    for(int i=0;i<size;i++)
    {
        System.out.print(arr[i]+" ");

    }
    
}

public  int sum()
{
    int sum = 0;
    for(int i=0;i<size;i++)
    {
        sum+=arr[i];

    }
    return sum;
}

public  double avg()
{
    int sum = 0;
    for(int i=0;i<size;i++)
    {
        sum+=arr[i];

    }
    return sum/size;
}

public void swap()
{
    int index1=0;
    int index2 =0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for(int i = 0;i<size;i++)
    {
       if(arr[i]>max)
       {
        max = arr[i];
        index1 = i;
       }
       if(arr[i]<min)
       {
        min = arr[i];
        index2 =i;
       }
    }

    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2]= temp;
}

public void unique()
{
    System.out.println("unique elements are:");
    int flag =0,ele =0;
    for(int i =0;i<size;i++)
    {
        flag =0;
        for(int j =i+1;j<size;j++)
        {
            if(arr[i] == arr[j])
            {
                flag = 1;
             
            }else{
                ele = arr[i];
            }
           
        }
        if(flag ==0)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
}

public class Main{
    public static void main(String ar[])
    {

        MyArray obj1 = new MyArray(10);
        obj1.input();
        obj1.display();
        int sum = obj1.sum();
        double avg = obj1.avg();
        System.out.println("\nsum of given array is:"+sum);
        System.out.println("average of given array is:"+avg);
        obj1.swap();
        obj1.display();
        obj1.unique();



    }
}