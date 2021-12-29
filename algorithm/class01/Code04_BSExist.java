/*
 * Copyright
 */
package algorithm.class01;

/**
 * @author Bao.f
 * @version V1.0
 */
public class Code04_BSExist {
    public static boolean exist(int[] sortedArr, int num) {
        if (sortedArr==null||sortedArr.length==0)
            return false;
        int length = sortedArr.length;
        int L = 0;
        int R = length - 1;
        int mid = 0;

        //eg: 4~9  4+(9-4)/2  4+2 6
        while (L < R) {
            mid = L + ((R - L) >> 1);
            int mval = sortedArr[mid];
            if (mval==num)
                return true;
            if (num<mval)
                R = mid - 1;
            else L = mid + 1;
        }

        return sortedArr[L]==num;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 6, 7, 8, 9, 12, 24, 26, 47};
        System.out.println(exist(arr, 1));
//        System.out.println(4+((9-4)>>1));
    }
}
