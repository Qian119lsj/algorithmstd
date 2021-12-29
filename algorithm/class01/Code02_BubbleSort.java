/*
 * Copyright
 */
package algorithm.class01;

import java.util.Arrays;

/**
 * @author Bao.f
 * @version V1.0
 */
public class Code02_BubbleSort {
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = 0; j < arr.length -1 - i; ++j) {
                if (arr[j]>arr[j+1])
                    swap(arr, j, j + 1);
            }
        }
    }

    public static void swap(int arr[], int i, int j) {
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i]=arr[i]^arr[j];
    }

    public static void main(String[] args) {

        int arr[] = {12, 5, 8, 222, 6, 2, 3, 7, 9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
