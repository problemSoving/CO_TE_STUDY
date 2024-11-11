package subin.baekjoon.step.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        String input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
            int a = input.charAt(i);

            if ('A' <= a && a <= 'C') {
                sum += 3;
            } else if ('D' <= a && a <= 'F') {
                sum += 4;
            } else if ('G' <= a && a <= 'I') {
                sum += 5;
            } else if ('J' <= a && a <= 'L') {
                sum += 6;
            } else if ('M' <= a && a <= 'O') {
                sum += 7;
            } else if ('P' <= a && a <= 'S') {
                sum += 8;
            } else if ('T' <= a && a <= 'V') {
                sum += 9;
            } else {
                sum += 10;
            }
        }

        System.out.println(sum);
    }
}
