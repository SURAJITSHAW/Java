package com.dsa.sorting;

import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        cyclic(arr);
    }

    static void cyclic(int[] arr) { // index = value - 1
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i+1) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
