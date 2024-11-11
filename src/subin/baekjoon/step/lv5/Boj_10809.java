package subin.baekjoon.step.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();

        // 알파벳 배열 선언 a~z 26개
        // ASCII 코드: A는 65번, a는 97번
        int[] arr = new int[26];

        // 배열 초기값 -1로 설정
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
//        Arrays.fill(arr, -1);

        // 알파벳 배열에 순서인덱스 번호 넣기
        for (int i = 0; i < input.length(); i++) {
            int alphabet = input.charAt(i);
            if(arr[alphabet-97] == -1){
                arr[alphabet-97] = i;
            }

//            int index = input.charAt(i) - 'a';
//            if(arr[index] == -1){
//                arr[index] = i;
//            }

        }

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
