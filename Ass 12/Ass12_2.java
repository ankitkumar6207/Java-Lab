import java.util.Arrays;
import java.util.Scanner;

class Number {
    Scanner sc = new Scanner(System.in);
    protected int[] array;
    public Number(int n) {
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();  
        }
    }


    public void displayValues() {
        System.out.println("Array elements ");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+ " ");
        }
    }
}

class OddNum extends Number {
     int[] oddArray;
    OddNum(int n) {
        super(n);
        int count = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                count++;
            }
        }
        oddArray = new int[count];
    }
    public void copyOddNumbers() {
        int index = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                oddArray[index++] = num;
            }
        }
    }
    public void displayOddNumbers() {
        System.out.println("Odd Numbers: ");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+"  ");
        }
    }
}

class PrimeNum extends OddNum {
    private int[] primeArray;
    PrimeNum(int n) {
        super(n);
        int count = 0;
        for (int num : oddArray) {
            if (isPrime(num)) {
                count++;
            }
        }
        primeArray = new int[count];
    }

    public void copyPrimeNumbers() {
        int index = 0;
        for (int num : oddArray) {
            if (isPrime(num)) {
                primeArray[index++] = num;
            }
        }
    }
    public void displayPrimeNumbers() {
        System.out.println("Prime Numbers: " + Arrays.toString(primeArray));
    }
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Ass12_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n= sc.nextInt();
        PrimeNum obj = new PrimeNum(n);
        obj.displayValues();
        obj.copyOddNumbers();
        obj.displayOddNumbers();
        obj.copyPrimeNumbers();
        obj.displayPrimeNumbers();
    }
}
