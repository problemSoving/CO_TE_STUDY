package subin.baekjoon.step.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] numbers = new int[9];

        int max = Integer.MIN_VALUE;
        int idx = 0;

        for (int i = 0; i < numbers.length; i++) {
            int number = Integer.parseInt(br.readLine());
            numbers[i] = number;
        }

        for (int i = 0; i < numbers.length; i++) {
            if(max < numbers[i]){
                max = numbers[i];
                idx = i+1;
            }
        }
        sb.append(max).append("\n").append(idx);
        System.out.println(sb);
    }
}