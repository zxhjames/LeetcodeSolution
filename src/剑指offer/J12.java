package 剑指offer;

/**
 * @program: fuck!Leetcode
 * @description:
 * @author: 占翔昊
 * @create 2021-09-24 18:10
 **/
public class J12 {
        // dfs
        public boolean exist(char[][] board, String word) {

            int bx = -1;
            int be = -1;
            char[] arr = word.toCharArray();
            for (int i=0;i<board.length;++i) {
                for (int j=0;j<board[0].length;++j) {
                    if (board[i][j] == arr[0]) {
                        bx = i;
                        be = j;
                        //System.out.println(i+" "+j);
                    }
                }
            }
            if (bx == -1 && be == -1) {
                return false;
            }

            int[][] dir = {
                    {-1,0},{1,0},{0,-1},{0,1}
            }; // 0,1,2,3代表上下所有
            int t = 1;
            while (true) {
                // 如果越界 bx >= 0 && bx < board.length && be >=0 && be < board[0].length
                if (t == arr.length) {
                    return true;
                }
                boolean f = false;
                for (int k=0;k<4;++k) {
                    int posx = bx + dir[k][0];
                    int posy = be + dir[k][1];
                    if (posx < 0 || posx == board.length || posy < 0 || posy == board[0].length) {
                        continue;
                    }
                    if (board[posx][posy] == arr[t]) {
                        bx = posx;
                        be = posy;
                        t++;
                        f = true;
                        break;
                    }
                }
                if (!f) {
                    return false;
                }
            }

        }
}
