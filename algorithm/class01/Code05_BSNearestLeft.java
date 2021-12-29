/*
 * Copyright
 */
package algorithm.class01;

/**
 * @author Bao.f
 * @version V1.0
 */
public class Code05_BSNearestLeft {

    /**
     * 在arr上找>=num的最左位置
     * @param arr
     * @param num
     * @return
     */
    public static int nearestLeft(int[] arr, int num) {
        int L = 0;
        int R = arr.length - 1;
        int index = -1;

        for (; L <= R; ) {
            int mid = L + ((R - L) >> 1);
            if (num <= arr[mid]) {
                R = mid - 1;
                index = mid;
            } else {
                L = mid + 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,5,6,8,8,9,9,155,555};
        System.out.println(nearestLeft(arr, 9));
    }
}
