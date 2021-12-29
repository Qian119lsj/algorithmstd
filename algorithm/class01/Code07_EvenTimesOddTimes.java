/*
 * Copyright
 */
package algorithm.class01;

/**
 * @author Bao.f
 * @version V1.0
 */
public class Code07_EvenTimesOddTimes {
    // arr中，只有一种数，出现奇数次
    public static void printOddTimesNum1(int[] arr) {
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }
        System.out.println(eor);
    }

    // arr中，两种数，出现奇数次 设分别为a,b 则eor = a^b!=0 ->某位上有1 假设在第8位上为1 -> 说明a和b在第8位上不同
    // ->数组分为第8位1的和第8位0的两部分, a和b分别处于两部分;->异或第一部分得到eor~为a或b,则另一个为eor^eor~;
    public static void printOddTimesNum2(int[] arr) {
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }
        //找最右侧1   N&((zN)+1)
        int r = eor & ((~eor) + 1);

        int eorl = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((r & arr[i]) != 0) {
                eorl ^= arr[i];
            }
        }
        System.out.println(eorl+" "+(eorl^eor));
    }

    public static void countbit1(int n) {

        int count = 0;
        while (n != 0) {
            int r = n & ((~n) + 1);
            count++;

            //001010
            //110101
            //110110
            //000010
            //001000
            n ^= r;
        }


        System.out.println(count);

    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,4,4,5,5,6,6,7,7,9};
        int arr2[] = {1,1,1,1,4,5,5,6,6,7,7,9};
        printOddTimesNum1(arr);
        printOddTimesNum2(arr2);

        countbit1(102312);
        System.out.println(Integer.toBinaryString(102312));
    }
}
