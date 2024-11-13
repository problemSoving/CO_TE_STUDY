package subin.baekjoon.step.lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int max = Integer.MIN_VALUE;
        int x = 0;
        int y = 0;

        for (int i = 0; i < 9; i++) {
            String input = br.readLine();
            st = new StringTokenizer(input);
            for (int j = 0; j < 9; j++) {
                int number = Integer.parseInt(st.nextToken());
                if(max < number){
                    max = number;
                    x = i+1;
                    y = j+1;
                }
            }
        }
        sb.append(max).append("\n").append(x).append(" ").append(y).append(" ");
        System.out.println(sb);
    }
}
