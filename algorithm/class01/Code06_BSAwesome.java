/*
 * Copyright
 */
package algorithm.class01;

/**
 * @author Bao.f
 * @version V1.0
 */
public class Code06_BSAwesome {
    public static int getLessIndex(int[] arr) {

        if (arr == null || arr.length == 0) {
            return -1;
        }
        if (arr.length == 1 || arr[0] < arr[1]) {
            return 0;
        }
        if (arr[arr.length - 1] < arr[arr.length - 2]) {
            return arr.length - 1;
        }

        int left = 1;
        int right = arr.length - 2;
        int mid = 0;

        while (left < right) {
            mid = (left + right) / 2;
            if (arr[mid] > arr[mid + 1]) {
                left = mid;
            } else {

            }
        }

        return left;
    }
}
