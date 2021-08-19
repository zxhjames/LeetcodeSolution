package LeetCode;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

/**
 * @program: fuck!Leetcode
 * @description: 二进制中1的个数
 * @author: 占翔昊
 * @create 2021-06-23 10:58
 **/
public class Day_623 {
    public static void main(String[] args) {
        int[] nums = {1,2};
//        Map<Integer,Integer> maps = new HashMap<>();
//        List<Integer> lists = new ArrayList<>();
//        for (int i=0;i<nums.length;++i){
//            if (maps.get(nums[i]) > 0) {
//                for(Integer k : maps.keySet())
//            }
//            maps.put(nums[i],maps.get(nums[i]));
//        }
//        while(maps.get(1) == 0) {
//
//        }
        System.out.println(getIndex(nums,0,-1));
    }

    public static int getIndex(int[] arr,int cur,int move){
        int l = arr.length;
        cur = cur + move;
        if (cur < l && cur >=0 ) {
            return arr[cur];
        }else if(cur >= l) {
            return arr[cur - l];
        }
        return arr[l + cur];
    }
}
