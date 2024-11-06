package subin.baekjoon.step.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        // 불기 연도 - 543 = 서기 연도
        int result = input - 543;
        System.out.println(result);
    }
}