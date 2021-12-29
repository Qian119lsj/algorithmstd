/*
 * Copyright
 */
package algorithm.class01;

import java.util.Arrays;

/**
 * @author Bao.f
 * @version V1.0
 */
public class Code01_SelectionSort {

    public static void selectionSort(int [] arr) {
        for (int i = 0; i < arr.length; ++i) {
            int max=0;
            for (int j = 1; j < arr.length - i; ++j) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            swap(arr, max, arr.length-1-i);
        }
    }

    public static void swap(int [] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 8, 4, 6, 2, 3, 7, 9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
