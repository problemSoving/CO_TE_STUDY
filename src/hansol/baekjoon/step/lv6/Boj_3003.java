package hansol.baekjoon.step.lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] chessArr = {1,1,2,2,2,8};
        StringBuilder sb = new StringBuilder();

        for (int chess : chessArr){
            int input= Integer.parseInt(st.nextToken());
            sb.append(chess-input).append(" ");
        }

        System.out.println(sb);
        br.close();
    }
}
