package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: fuck!Leetcode
 * @description: 剑指offer38字符串的排列
 * @author: 占翔昊
 * @create 2021-06-22 20:49
 **/
public class Day_622 {
    public static void main(String[] args) {

    }

    static List<String> rec;
    boolean[] vis;

    public String[] permutation(String s) {
        // 递归
        int n = s.length();
        rec = new ArrayList<>();
        vis = new boolean[n];
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuffer perm = new StringBuffer();
        backtrack(arr,0,n,perm);
        int size = rec.size();
        String[] recArr = new String[size];
        for (int i=0;i<size;++i) {
            recArr[i] = rec.get(i);
        }
        return recArr;
    }

    public void backtrack(char[] arr,int i,int n,StringBuffer perm) {
        if (i == n) {
            rec.add(perm.toString());
            return;
        }

        for (int j=0;j<n;j++) {
            if (vis[j] || (j > 0 && !vis[j-1] && arr[j-1] == arr[j])) {
                continue;
            }
            vis[j] = true;
            perm.append(arr[j]);
            backtrack(arr,i+1,n,perm);
            perm.deleteCharAt(perm.length() - 1);
            vis[j] = false;
        }
    }

}
