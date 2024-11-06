package subin.baekjoon.step.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int maxNum = Integer.MIN_VALUE;

        if (a != b && a != c && b != c) {
            if (a > c && a > b) {
                maxNum = a;
            } else if (b > a && b > c) {
                maxNum = b;
            } else {
                maxNum = c;
            }
            System.out.println(maxNum * 100);
        } else {
            if (a == b && a == c) {
                System.out.println(10000 + a * 1000);
            } else if (a == b || b == c) {
                System.out.println(1000 + b * 100);
            } else {
                System.out.println(1000 + c * 100);
            }
        }
    }
}
