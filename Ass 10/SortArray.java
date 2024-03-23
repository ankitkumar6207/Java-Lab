import java.util.Scanner;

class SortArray {
    private int[] array;
    private int n;

    public SortArray(int size) {
        n = size;
        array = new int[n];
    }

    public void setInput() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
    }

    public void display() {
        System.out.print("Array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void bubbleSort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public void insertionSort() {
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public void mergeSort() {
        mergeSortHelper(0, n - 1);
    }

    private void mergeSortHelper(int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSortHelper(low, mid);
            mergeSortHelper(mid + 1, high);
            merge(low, mid, high);
        }
    }

    private void merge(int low, int mid, int high) {
        int[] temp = new int[n];
        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = array[i++];
        }

        while (j <= high) {
            temp[k++] = array[j++];
        }

        for (k = low; k <= high; k++) {
            array[k] = temp[k];
        }
    }

    public void quickSort() {
        quickSortHelper(0, n - 1);
    }

    private void quickSortHelper(int low, int high) {
        if (low < high) {
            int partitionIndex = partition(low, high);
            quickSortHelper(low, partitionIndex - 1);
            quickSortHelper(partitionIndex + 1, high);
        }
    }

    private int partition(int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        SortArray sortArray = new SortArray(size);
        sortArray.setInput();
        System.out.println("Original array:");
        sortArray.display();

        sortArray.bubbleSort();
        System.out.println("Sorted array using Bubble Sort:");
        sortArray.display();

        sortArray.setInput();
        sortArray.selectionSort();
        System.out.println("Sorted array using Selection Sort:");
        sortArray.display();

        sortArray.setInput();
        sortArray.insertionSort();
        System.out.println("Sorted array using Insertion Sort:");
        sortArray.display();

        sortArray.setInput();
        sortArray.mergeSort();
        System.out.println("Sorted array using Merge Sort:");
        sortArray.display();

        sortArray.setInput();
        sortArray.quickSort();
        System.out.println("Sorted array using Quick Sort:");
        sortArray.display();
    }
}
