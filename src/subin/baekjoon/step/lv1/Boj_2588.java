package subin.baekjoon.step.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int b1 = b%10;
        int b2 = (b%100)/10;
        int b3 = b/100;

        int result1 = a*b1;
        int result2 = a*b2;
        int result3 = a*b3;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(a*b);
    }
}
