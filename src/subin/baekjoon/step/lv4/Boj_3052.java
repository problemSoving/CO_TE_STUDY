package subin.baekjoon.step.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[42];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num%42] = true;
        }
        for (int i = 0; i < 42; i++) {
            if(arr[i]){
               count++;
            }
        }
        System.out.println(count);
    }
}
