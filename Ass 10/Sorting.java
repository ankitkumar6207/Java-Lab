import java.util.Scanner;
class SortArray{
 Scanner sc = new Scanner(System.in);
   int arr[];

   SortArray(int size)
   {
     arr = new int[size];
   } 

   public void setArray(int n)
   {
     System.out.println("enter array elements:");
     for(int i=0;i<n;i++)
     {
        this.arr[i]=sc.nextInt();
     }
   }
   void display()
   {
     System.out.println("Array elements are:");
     for(int i =0;i<this.arr.length;i++)
     {
        System.out.print(arr[i]+" ");
     }
   }

   void bubbleSort()
   {
    for(int i =0;i<this.arr.length;i++)
    {
        for(int j=0;j<(this.arr.length-i-1);j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }

        }
    }
   }

   void selectionSort()
   {
    for(int i =0;i<this.arr.length;i++)
    {
        for(int j =i+1;j<this.arr.length;j++)
        {
            if(arr[i]>arr[j])
            {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
   }

   void insertionSort()
   {
    for (int i = 1; i < this.arr.length; ++i) {
            int pivot = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > pivot) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = pivot;
        }
    }

  
     static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
 
    static int partition(int[] arr, int low, int high)
    {
        
        int pivot = arr[high];
 
    
        int i = (low - 1);
 
        for (int j = low; j <= high - 1; j++) {
 
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
 
                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
 

    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
 
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);
 
            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

       
    
    void mergeSort(int sidx,int eidx)
    
    {
        if(sidx >=eidx)
        {
            return;
        }
        int mid = (sidx + eidx)/2;
        mergeSort(sidx,mid);
        mergeSort(mid+1,eidx);
        merge(sidx,eidx,mid);
    }
    void  merge(int sidx,int eidx,int mid){
        int n = this.arr.length;
        int temp[]=new int[n];
        int i = sidx;
        int j = mid+1;
        int k=0;
        
        while(i<=mid && j<=eidx)
        { 
            if(this.arr[i]<this.arr[j])
            {
                temp[k] = this.arr[i];
                i++;
                k++;
            }
            if(this.arr[j]<this.arr[i])
            {
                temp[k]=this.arr[j];
                j++;
                k++;
            }
        }
       while(i<=mid)
       {
        temp[k++]=this.arr[i++];

       }
       while(j<=eidx)
       {
        temp[k++]=this.arr[j++];
       }
       for(int p =sidx,m=0;m<temp.length;p++,m++)
       {
        this.arr[p] = temp[m];

       }

    }


   

    void afterSort()
   {
     System.out.println("\nAfter sorting, Array elements are:");
     for(int i =0;i<this.arr.length;i++)
     {
        System.out.print(arr[i]+" ");
     }
   }
}

public class Sorting{
 
    public static void main(String ar[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the size of the array");
       int n = sc.nextInt();
       SortArray obj1 = new SortArray(n);
       obj1.setArray(n);
       obj1.display();


    //    obj1.bubbleSort();
    //    obj1.afterSort();

        // obj1.selectionSort();
        // obj1.afterSort();

        obj1.insertionSort();
        obj1.afterSort();    

        // obj1.mergeSort(0,n-1);
        // obj1.afterSort(); 
         

        // obj1.quickSort();



        
    }
}