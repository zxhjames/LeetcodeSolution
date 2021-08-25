package LeetCode;

import java.util.Arrays;

/**
 * @program: fuck!Leetcode
 * @description: 1646. 获取生成数组中的最大值
 * @author: 占翔昊
 * @create 2021-08-23 08:54
 **/
public class code1646 {

    class Solution {
        public int getMaximumGenerated(int n) {
            if (n < 2) {
                return n;
            }
            int[] arr = new int[n+1];
            Arrays.fill(arr,-1);
            arr[0] = 0;
            arr[1] = 1;
            for (int i=0;i<n+1;++i) {
                if (i * 2 >= 2 && i * 2 <= n) {
                    arr[i * 2] = arr[i];
                }
                if (i * 2 + 1 >= 2 && i * 2 + 1 <= n) {
                    arr[i * 2 + 1] = arr[i] + arr[i+1];
                }
            }
            int max = Integer.MIN_VALUE;
            for (int i=0;i<n+1;++i) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }
    }
}
