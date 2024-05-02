import java.util.Scanner;
class SortArray{
 Scanner sc = new Scanner(System.in);
   int arr[];

   SortArray(int size)
   {
     arr = new int[size]; //creating the array
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

    void quickSort()
    {

       
    }
    void mergeSort(this.arr,int sidx,int eidx)
    
    {
        if(sidx >=eidx)
        {
            return;
        }
        int mid = (sidx + eidx)/2;
        mergeSort(this.arr,sidx,mid);
        mergeSort(this.arr,mid+1,eidx);
        merge(this.arr,sidx,eidx,mid);
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

        // obj1.insertionSort();
        // obj1.afterSort();    

        obj1.mergeSort(0,n-1);
        obj1.afterSort();                                            


        
    }
}
