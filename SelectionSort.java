import java.util.Scanner;

public class SelectionSort {

    public static void selectionSortIterative(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        printArray(arr); // Final sorted output only
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        selectionSortIterative(array);
    }
}
