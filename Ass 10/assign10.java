import java.util.*;
class SortArray{
    int size;
    int arr[];

    SortArray(int n)
    {
       size = n;
       arr = new int[size];
    }

    void set(SortArray sa)
    {
      System.out.print("\nEnter the elements in array : ");
      Scanner sc = new Scanner(System.in);
      int i =0;
      while(sa.size>i)
      {
        sa.arr[i] = sc.nextInt();
        i++;
      }
      
    }
    
    void show()
    {
      System.out.print("\nDisplay the elements of array : ");
      for(int i =0;i<this.size;i++)
       {
          System.out.println(arr[i]);
       }
    }
   
    void bubble_sort(SortArray sa)
    {
        for (int i = 0; i < this.size - 1; i++) 
            for (int j = 0; j < this.size - i - 1; j++) 
                if (sa.arr[j] > sa.arr[j + 1]) { 
                    // swap temp and arr[i] 
                    int temp = sa.arr[j]; 
                    sa.arr[j] = sa.arr[j + 1]; 
                    sa.arr[j + 1] = temp; 
                } 
    }
    
    void selection_sort(SortArray sa)
    {
        for (int i = 0; i < this.size - 1; i++) { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i + 1; j < this.size; j++) { 
                if (sa.arr[j] < sa.arr[min_idx]) 
                    min_idx = j; 
            } 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = sa.arr[min_idx]; 
            sa.arr[min_idx] = sa.arr[i]; 
            sa.arr[i] = temp; 
        } 
    }

    void insertion_sort(SortArray sa)
    {
       for (int i = 1; i < this.size; ++i) { 
            int key = sa.arr[i]; 
            int j = i - 1; 
  
            // Move elements of arr[0..i-1], that are 
            // greater than key, to one position ahead 
            // of their current position 
            while (j >= 0 && sa.arr[j] > key) { 
                sa.arr[j + 1] = sa.arr[j]; 
                j = j - 1; 
            } 
            sa.arr[j + 1] = key; 
        } 
    }
   
    void merge_sort(int si, int ei)
    {
      if (si >= ei) 
        { return;
	}
            // Find the middle point 
            int m = (si + ei) / 2; 
  
            // Sort first and second halves 
            merge_sort( si, m); 
            merge_sort( m + 1, ei); 
  
            // Merge the sorted halves 
            merge( si, m, ei); 
        } 
    

    void merge( int si, int m, int ei) 
    { 
        int temp[] = new int[ei - si + 1]; 
        int k=0,i=si,j=m+1; 
 
        while(i<=m && j<=ei) 
        {
           if(arr[i]<arr[j])
            {
              temp[k] = arr[i];
              i++;
              k++;
            }
           
           if(arr[j]<arr[i])
            {
              temp[k] = arr[j];
              j++;
              k++;
            }
        }
        
        while(i<=m)
        {
          temp[k] = arr[i];
          k++;
          i++;
        }

        while(j<=ei)
        {
          temp[k] = arr[j];
          k++;
          j++;
        }

        for(i=si,k=0;k<temp.length;k++,i++)
         {
           arr[i] = temp[k];
         }
    } 

    void quickSort(int si, int ei){
        if(si>=ei){
            return;
        }
        int pIdx = partition(si,ei);
        quickSort(si, pIdx - 1);
        quickSort(pIdx+1, ei);
    }
    int partition(int si, int ei){
        int pivot = arr[ei];
        int i = si - 1;
        for(int j = 0; j<ei ; j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }


}

class assign10{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of array : ");
      int n = sc.nextInt();
      SortArray sa = new SortArray(n);
      // initialize the array for n elements
      // to input n numbers into the array using getter method
      sa.set(sa);
      // to show the values stored in array
      sa.show();
      // to arrange them in ascending order
      System.out.println("\nSorting : ");
      System.out.println("1. Bubble Sort ");
      System.out.println("2. Selection Sort ");
      System.out.println("3. Insertion Sort ");
      System.out.println("4. Merge Sort ");
      System.out.println("5. Quick Sort ");
      System.out.println("Enter your choice : ");
      int choice = sc.nextInt();
      switch(choice)
      {
         case 1:
                 System.out.println("Sorting using Bubble sort : ");
                 sa.bubble_sort(sa);
                 sa.show();
                 break;
         case 2:
                 System.out.println("Sorting using Selection sort : ");
                 sa.selection_sort(sa);
                 sa.show();
                 break;
         case 3:
                 System.out.println("Sorting using Insertion sort : ");
                 sa.insertion_sort(sa);
                 sa.show();
                 break;
         case 4:
                 System.out.println("Sorting using Merge sort : ");
                 sa.merge_sort(0, n- 1);
                 sa.show();
                 break;
         case 5:
                 System.out.println("Sorting using Quick sort : ");
                 sa.quickSort(0,n-1);
                 sa.show();
                 break;
         default:
                  System.out.println("Enter valid choice ");

      }
      
}
}