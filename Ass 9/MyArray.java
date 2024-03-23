import java.util.Scanner;

public class MyArray {
    private int[] array;
    private int size;

    // Constructor to initialize array to zero
    public MyArray(int size) {
        this.size = size;
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = 0;
        }
    }

    // Method to input elements into the array
    public void inputElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
    }

    // Method to display the array elements
    public void displayElements() {
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Method to calculate sum of elements
    public int calculateSum() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        return sum;
    }

    // Method to calculate average of elements
    public double calculateAverage() {
        int sum = calculateSum();
        return (double) sum / size;
    }

    // Method to swap max and min elements
    public void swapMaxMin() {
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < size; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        int temp = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = temp;
    }

    // Method to find occurrence of all unique elements
    public void findOccurrence() {
        System.out.println("Occurrence of unique elements:");
        int[] count = new int[size];
        for (int i = 0; i < size; i++) {
            if (count[i] == 0) {
                int num = array[i];
                int occurrence = 1;
                for (int j = i + 1; j < size; j++) {
                    if (array[j] == num) {
                        count[j] = 1;
                        occurrence++;
                    }
                }
                if(occurrence==1)
                System.out.println( "the unique number is = "+num + " occurs " + occurrence + " times");
            }
        }
    }

    // Method to make three digit numbers
   // yaha add kar de




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        MyArray myArray = new MyArray(size);

        myArray.inputElements();
        myArray.displayElements();

        System.out.println("Sum of elements: " + myArray.calculateSum());
        System.out.println("Average of elements: " + myArray.calculateAverage());

        myArray.swapMaxMin();
        System.out.println("Array elements after swapping max and min elements:");
        myArray.displayElements();

        myArray.findOccurrence();

        //int greatestNewNumber = myArray.findGreatestNewNumber();
        //System.out.println("Greatest new number: " + greatestNewNumber);
    }
}