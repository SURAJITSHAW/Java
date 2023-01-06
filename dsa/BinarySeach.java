package com.dsa;

public class BinarySeach {
    public static void main(String[] args) {
        int[] arr = {11, 23, 44, 99, 4333};
        int target = 99;

        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

     static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // calculate mid
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
