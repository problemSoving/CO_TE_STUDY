package subin.baekjoon.step.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int n = Integer.parseInt(br.readLine());

        String input = br.readLine();
        st = new StringTokenizer(input);

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(max < num){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
    }
}
