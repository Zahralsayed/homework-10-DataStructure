package com.ga.RotateArray;

public class RotateArray{

    static void rotate(int[] arr, int d, int n) {
        if (n == 0) return;

        d = d % n;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        rotate(arr1, 2, arr1.length);
        printArray(arr1);

        int[] arr2 = {10, 20, 30, 40, 50, 60};
        rotate(arr2, 8, arr2.length);
        printArray(arr2);
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}



