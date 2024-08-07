import java.util.*;
import java.io.*;
 public class QuickSort {

    static int partition(int[] a, int low, int high)
    {
        int pivot = a[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                 a[i] = a[j];
                 a[j] = temp;
            }
        }
        swap(a, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] a, int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static void printArr(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = a.length;
        quickSort(arr,0, N - 1);
        System.out.println("Sorted array:");
        printArr(a);
    }
}
