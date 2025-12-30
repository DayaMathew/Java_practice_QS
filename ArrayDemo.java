import java.util.Scanner;

public class ArrayDemo {

    // Display entire array
    public static void displayArray(int[] arr) {
        System.out.print("Array elements: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Modify array elements (multiply by 2)
    public static void modifyArray(int[] arr) {
        System.out.println("\nModifying array elements (multiplying by 2)...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }

    // Display individual element
    public static void displayElement(int element, int index) {
        System.out.println("Element at index " + index + ": " + element);
    }

    // Calculate sum of array
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Demonstrate passing entire array
        System.out.println("\n1. Display entire array:");
        displayArray(numbers);

        // Demonstrate passing individual elements
        System.out.println("\n2. Display individual elements:");
        for (int i = 0; i < numbers.length; i++) {
            displayElement(numbers[i], i);
        }

        // Demonstrate passing array to calculate sum
        System.out.println("\n3. Sum of array elements:");
        System.out.println("Sum: " + calculateSum(numbers));

        // Demonstrate modifying array by reference
        System.out.println("\n4. Modifying array by reference:");
        System.out.println("Before modification:");
        displayArray(numbers);
        modifyArray(numbers);
        System.out.println("After modification:");
        displayArray(numbers);

        sc.close();
    }
}
