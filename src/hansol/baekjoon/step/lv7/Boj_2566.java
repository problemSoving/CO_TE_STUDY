package hansol.baekjoon.step.lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2566 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] numArr = new int[9][9];
        for (int i=0 ; i<9; i++){
            int[] num = new int[9];
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for (int j=0; j<9; j++) num[j] = Integer.parseInt(st.nextToken());
            numArr[i] = num;
        }


        int max = numArr[0][0];
        String locate="1 1";
        for (int i=0 ; i<9; i++){
            for (int j=0; j<9; j++){
                if (max<numArr[i][j]) {
                    max = numArr[i][j];
                    locate=(i+1)+" "+(j+1);
                }
            }
        }

        System.out.println(max);
        System.out.println(locate);

        br.close();
    }
}
