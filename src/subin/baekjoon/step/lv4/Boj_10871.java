package subin.baekjoon.step.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        st = new StringTokenizer(input);
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] result = new int[n];

        String numbers = br.readLine();
        st = new StringTokenizer(numbers);
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(st.nextToken());
            result[i] = number;
        }

        for (int i = 0; i < n; i++) {
            if(result[i] < x){
                sb.append(result[i]).append(" ");
            }
        }
        System.out.println(sb);
    }
}