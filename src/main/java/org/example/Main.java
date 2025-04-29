package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 2, 1, 4};
        bubbleSort(nums);

        System.out.println(Arrays.toString(nums));
    }

    /*
    31 5214 - 135214
    1 35 214 - 135214
    13 52 14 - 132514
    132 51 4 - 132154
    1321 54 - 132145

    13 214 (5)
    1 32 14
    12 31 4
    121 34

    12 13
    1 21 3
    11 23

    112

    O(n * log n)
     */
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
