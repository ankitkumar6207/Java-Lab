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
    return (double) sum / size;
}

public void swap()
{
    System.out.println("array elements after swapping: ");
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
    System.out.println("\nOccurrence of unique elements:");
        int[] count = new int[size];
        for (int i = 0; i < size; i++) {
            if (count[i] == 0) {
                int num = arr[i];
                int occurrence = 1;
                for (int j = i + 1; j < size; j++) {
                    if (arr[j] == num) {
                        count[j] = 1;
                        occurrence++;
                    }
                }
                if(occurrence==1)
                System.out.println( "unique number is "+num + " occurs " + occurrence + " times");
            }
        }
}


public void ModifyArray()
{
     System.out.println("three digits number combined from array");
    
        int i, j, range = 3;
        int n = arr.length;
        int k = 1;
        for (i = 0; i < n - (n % 3); i += 3) {

            int sum = 0;
            for (j = i; j < (range * k); j++) {
                if (arr[j] > 9) 
                {
                    int temp = arr[j];
                    int sum1 = 0;
                    while (temp != 0) 
                    {
                        int rem = temp % 10;
                        sum1 += rem;
                        temp /= 10;
                    }
                    arr[j] = sum1;
                    if (sum1 > 9) 
                    {
                        int sum2 = 0;
                        while (sum1 != 0) 
                        {
                            int rem1 = sum1 % 10;
                            sum2 += rem1;
                            sum1 /= 10;
                        }
                        arr[j] = sum2;
                    }
                }
                sum = ((sum * 10) + arr[j]);

            }
            arr[k - 1] = sum;
            k += 1;
        }
       
        int sum3 = 0;
        for (i = n - (n % 3); i <= n - 1; i++) {
            if (arr[i] > 9) 
            {
                int temp = arr[i];
                int sum1 = 0;
                while (temp != 0) 
                {
                    int rem = temp % 10;
                    sum1 += rem;
                    temp /= 10;
                }
                arr[i] = sum1;
                if (sum1 > 9) 
                {
                    int sum2 = 0;
                    while (sum1 != 0) 
                    {
                        int rem1 = sum1 % 10;
                        sum2 += rem1;
                        sum1 /= 10;
                    }
                    arr[i] = sum2;
                }
            }
         
            if ((range - (n % 3) == 2)) 
            {
                sum3 = arr[i] * 100;

            } else 
            {
                sum3 = sum3 * 10 + arr[i];
                if (sum3 > 9) 
                {
                    sum3 *= 10;

                }

            }
        }
       

        arr[k - 1] = sum3;
     
        if(n%3==0)
        {
            n/=3;
        }
        else
        {
            n=(n/3)+1;
        }
     

       int max = Integer.MIN_VALUE;
        for (i = 0; i < n; i++) {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            System.out.println(arr[i]);
        }

        System.out.print("greatest number in the array is "+max);
 
}
}


public class Main{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array:");
        int n = sc.nextInt();
        MyArray obj1 = new MyArray(n);
        obj1.input();
        obj1.display();
        int sum = obj1.sum();
        double avg = obj1.avg();
        System.out.println("\nsum of given array is:"+sum);
        System.out.println("average of given array is:"+avg);
        obj1.swap();
        obj1.display();
        obj1.unique();
        obj1.ModifyArray();



    }
}