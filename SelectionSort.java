import java.util.Scanner;

// Class to implement Selection Sort
public class SelectionSort {

    // Selection Sort Algorithm
    public static void selectionSortIterative(int[] arr) {
        int n = arr.length; // Get the length of the array

        // Outer loop to iterate through each element
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the current index as the minimum

            // Inner loop to find the minimum element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            // Display array after each iteration
            System.out.print("Array after iteration " + (i + 1) + ": ");
            printArray(arr);
        }
    }

    // Utility method to print array elements
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of elements
        System.out.println("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Create an array and accept inputs
        int[] array = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Display array before sorting
        System.out.print("Array before sorting: ");
        printArray(array);

        // Perform Selection Sort
        selectionSortIterative(array);

        // Display array after sorting
        System.out.print("Array after sorting: ");
        printArray(array);
    }
}
