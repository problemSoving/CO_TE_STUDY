package subin.baekjoon.step.lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        input = input.toUpperCase();

        // a ~ z 개수 저장할 배열 선언
        int[] arr = new int[26];
        for (int i = 0; i < input.length(); i++) {
            // 문자 사용 개수 저장
            arr[input.charAt(i) - 'A'] += 1;
        }

        int max = Integer.MIN_VALUE;
        char index = 0;

        // 문자의 개수 arr[i]의 max값 비교
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                // 가장 많이 사용된 문자
                index = (char) (i + 65);
                // max값이 같은 것이 있는 경우
            }else if(arr[i] == max){
                index = '?';
            }
        }
        System.out.println(index);
    }
}
