package subin.baekjoon.step.lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num-i; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < 2*i -1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int i = num-1; i >=0; i--) {
            for (int j = 0; j < num - i; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
