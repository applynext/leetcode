package com.leetcode.practice.four;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(new Solution().findMedianSortedArrays(nums1, nums2));//期望值2.0

        int[] nums1_test = {1, 2};
        int[] nums2_test = {3, 4};
        System.out.println(new Solution().findMedianSortedArrays(nums1_test, nums2_test));// 期望值2.5
    }
}
