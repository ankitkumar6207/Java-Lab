import java.util.Scanner;

class ModifyArray {
    public static void main(String args[]) {
        System.out.println("Enter the range of the elements - ");
        Scanner sc = new Scanner(System.in);
        int i, j, range = 3;
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements - ");
      
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

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
        
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}