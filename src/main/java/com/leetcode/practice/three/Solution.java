package com.leetcode.practice.three;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        //当前处理的开始位置(即：记录重复字符个数)
        int start = 0;
        //无重复字符串最终长度
        int result = 0;

        //创建一个HashMap集合，用来存放遍历的字符和对应位置
        Map<Character, Integer> map = new HashMap<Character, Integer>(s.length());

        //循环遍历字符串，判断是否有重复字符ch，可以用Map中的containsKey()方法判断
        for (int i =0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            //如果HashMap中包含该字符并且该字符的位置要大于start记录位置，就将start值增加1
            if (map.containsKey(ch) && map.get(ch) >= start) {
                start = map.get(ch) + 1;
            }
            //如果不包含该字符，就将result结果增加(但是要去掉重复的字符个数，即：i - start + 1)
            else {
                result = Math.max(result, i - start + 1);
            }
            //将该字符和位置放入HashMap中
            map.put(ch, i);
        }
        return result;
    }
}