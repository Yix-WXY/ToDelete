package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 2, 1, 4};
        insertionSort(nums);

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

    O(n*n) , O(n * log n)
     */
    public static void bubbleSort(int[] nums) {
        bubbleSort(nums, true);
    }

    public static void bubbleSort(int[] nums, boolean ascending) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if ((ascending && nums[j] > nums[j + 1]) ||
                        (!ascending && nums[j] < nums[j + 1])) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    /*
    315214
    135214
    1 35214
    11 5234
    112 534
    1123 54
    112345
     */
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp;
        }
    }

    /*
    3 15214
    1 35214
    13 5214
    135 214
    123 514
    1123 54
    112345
     */
    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }
}
