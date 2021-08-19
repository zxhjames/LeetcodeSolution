package LeetCode;

class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int i = 0;
        int j = str.length - 1;
        int[] f = new int[2];
        while(i < j && i < str.length && j > 0) {
            if (f[0] == 0 &&  f[1] == 0) {
                while(!isContain(str[i]) && i < j) {
                    i++;
                }
                if (i >= j) {
                    break;
                }
                f[0] = 1;
                continue;
            }else if (f[0] == 1 && f[1] == 0) {
                while(!isContain(str[j]) && j > i) {
                    j--;
                }
                if (j <= i) {
                    break;
                }
                f[1] = 1;
                continue;
            }else if (f[0] == 1 &&  f[1] == 1) {
                // swap
                char tmp = '0';
                tmp = str[i];
                str[i] = str[j];
                str[j] = tmp;
                f[0] = f[1] = 0;
                i++;
                j--;
            }
        }
        return String.valueOf(str);
    }

    public static boolean isContain(char c) {
        if (c == 'a' || c == 'A'
                || c == 'e' || c == 'E'
                || c == 'i' || c == 'I'
                || c == 'o' || c == 'O'
                || c == 'u' || c == 'U'
        ) {
            return true;
        }
        return false;
    }
}

