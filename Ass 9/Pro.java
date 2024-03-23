import java.util.Scanner;
public class Pro{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];
        for(int i =0;i<6;i++)
        {
            arr[i] = sc.nextInt();
        }

        int k = 1;
        int sum =0;
        for(int i =0;i<6;i+=3)
        {
            sum =0;
            for(int j = i ;j<3*k;j++)
            {
                sum = sum*10 + arr[j];
            }
            arr[k-1] = sum;
            k++;
        }  
        int range = arr.length/3;
        for(int i =range;i<arr.length;i++)
        {
            arr[i] = 0;

        }

          for(int i =0;i<6;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}