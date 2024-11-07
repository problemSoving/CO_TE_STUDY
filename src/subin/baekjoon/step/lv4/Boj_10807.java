package subin.baekjoon.step.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int[] numbers = new int[input];

        String inputNumbers = br.readLine();

        StringTokenizer st = new StringTokenizer(inputNumbers);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int findNum = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(findNum == numbers[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
