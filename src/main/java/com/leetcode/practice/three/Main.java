package com.leetcode.practice.three;

public class Main {
    public static void main(String[] args) {
        String testStr1 = new String("abcabcbb");
        String testStr2 = new String("bbbbb");
        String testStr3 = new String("pwwkew");

        System.out.println(new Solution().lengthOfLongestSubstring(testStr1));
        System.out.println(new Solution().lengthOfLongestSubstring(testStr2));
        System.out.println(new Solution().lengthOfLongestSubstring(testStr3));

    }
}
