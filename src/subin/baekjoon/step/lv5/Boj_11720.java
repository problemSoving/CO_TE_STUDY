package subin.baekjoon.step.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Character.getNumericValue(input.charAt(i));
            sum += num;
        }

        System.out.println(sum);
    }
}
