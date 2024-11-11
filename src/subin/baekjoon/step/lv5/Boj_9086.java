package subin.baekjoon.step.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String input = br.readLine();
            char start = input.charAt(0);
            char end = input.charAt(input.length()-1);

            sb.append(start).append(end).append("\n");
        }
        System.out.println(sb);
    }
}