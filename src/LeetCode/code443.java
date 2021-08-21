package LeetCode;

/**
 * @program: fuck!Leetcode
 * @description: 压缩字符串
 * @author: 占翔昊
 * @create 2021-08-21 08:57
 **/
public class code443 {
    class Solution {
        public int compress(char[] chars) {
            if(chars == null) {
                return -1;
            }
            int len = chars.length;
            if(len == 1) {
                return 1;
            }
            int k = 0;
            String flag = String.valueOf(chars[0]);
            int count = 0;
            //构建第二条字符串
            for(int i =0;i<len;i++) {
                if(chars[i] != chars[k]) {
                    flag+=(count==1?"":count);
                    flag+=String.valueOf(chars[i]);
                    count = 1;
                    k = i;
                    continue;
                }count++;
            }
            flag+=(count==1?"":count);
            char ans[] = flag.toCharArray();
            int newlen = ans.length;
            for(int i=0;i<newlen;i++) {
                chars[i] = ans[i];
            }
//		 System.out.println(flag);
            return newlen;
        }
    }
}
