/*
 * Copyright
 */
package algorithm.class01;

import java.util.Arrays;

/**
 * @author Bao.f
 * @version V1.0
 */
public class Code03_InsertionSort {

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; ++i) {

            //              不越界     小于前一个数
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; --j) {
                swap(arr, j, j - 1);
            }
        }
    }

    public static void swap(int arr[], int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String[] args) {
        int i = (int) (Math.random() * 100);

        int arr[] = {12, 5, 8, 222, 6, 2, 3, 7, 9};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
