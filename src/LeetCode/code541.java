package LeetCode;

/**
 * @program: fuck!Leetcode
 * @description:
 * @author: 占翔昊
 * @create 2021-08-20 09:03
 **/
class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int i = 0;
        for (;i < arr.length && i + k < arr.length; i += k * 2) {
            // 反转[i,i+k]的字符
            int n = i;
            int edx = i + k - 1;
            while (n < edx) {
                swap(arr,n++,edx--);
            }
        }
        int idx = arr.length - 1;
        while(i < idx) {
            // 反转[i,arr.length]的字符
            swap(arr,i++,idx--);
        }

        return String.valueOf(arr);
    }

    public static void swap(char[] arr,int i,int j) {
        char tmp = '0';
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
