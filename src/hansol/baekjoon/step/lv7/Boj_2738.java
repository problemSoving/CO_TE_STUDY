package hansol.baekjoon.step.lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2738 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] numArr = new int[n*2][m];
        for (int i=0 ; i<n*2; i++){
            int[] num = new int[m];
            st = new StringTokenizer(br.readLine()," ");
            for (int j=0; j<m; j++) num[j] = Integer.parseInt(st.nextToken());
            numArr[i] = num;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n;i++){
            for (int j=0; j<m; j++) sb.append(numArr[i][j] + numArr[i+n][j]).append(" ");

            sb.append("\n");
        }

        System.out.println(sb);
        br.close();

    }
}
