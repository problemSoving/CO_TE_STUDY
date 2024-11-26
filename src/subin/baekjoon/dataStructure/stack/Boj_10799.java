package subin.baekjoon.dataStructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Boj_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        ArrayDeque<Character> arrayDeque = new ArrayDeque<>();
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            if (a == '(') {
                arrayDeque.push(a);
            }
            if (a == ')') {
                arrayDeque.pop();
                // 레이저인 경우
                if (input.charAt(i - 1) == '(') {
                    result += arrayDeque.size();
                // 마지막부분일때
                } else {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
