/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author KR
 */
public class OptimizedQuickSort {

    public static void quickSort(int[] arr, int low, int high) {

        while (low < high) {

            int pivot = partition(arr, low, high);

            // Sort smaller part first to reduce recursion depth
            if (pivot - low < high - pivot) {

                quickSort(arr, low, pivot - 1);
                low = pivot + 1;

            } else {

                quickSort(arr, pivot + 1, high);
                high = pivot - 1;
            }
        }
    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void printArray(int[] arr) {

        for (int num : arr)
            System.out.print(num + " ");

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.println("Before Sorting:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting:");
        printArray(arr);
    }
}
