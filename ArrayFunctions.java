import java.util.Scanner;

public class ArrayFunctions{

    // 1. Function to read and return an array
    public static int[] readArray() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    // 2. Function to display an array
    public static void displayArray(int[] arr) {
        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 3. Function to sort array using Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Array after Bubble Sort:");
        displayArray(arr);
    }

    // 4. Function to search an element - Linear Search
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;  // return index when found
            }
        }
        return -1; // element not found
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array
        int[] array = readArray();

        // Display array
        displayArray(array);

        // Sort array
        bubbleSort(array);

        // Searching in sorted array
        System.out.print("Enter value to search: ");
        int value = sc.nextInt();

        int index = search(array, value);

        if (index == -1)
            System.out.println("Value NOT found in array.");
        else
            System.out.println("Value found at index: " + index);

        sc.close();
    }
}
