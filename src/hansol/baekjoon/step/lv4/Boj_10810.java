package hansol.baekjoon.step.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int range = Integer.parseInt(st.nextToken());
        int cnt = Integer.parseInt(st.nextToken());

        int[] ballArr = new int[range];

        for (int i=0;i<cnt;i++){
            StringTokenizer balls = new StringTokenizer(br.readLine());
            int basket1 = Integer.parseInt(balls.nextToken());
            int basket2 = Integer.parseInt(balls.nextToken());
            int ballNum = Integer.parseInt(balls.nextToken());

            for(int j=basket1-1; j<basket2; j++ ){
                ballArr[j] = ballNum;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : ballArr){
            sb.append(num).append(" ");
        }
        System.out.println(sb);




    }
}
