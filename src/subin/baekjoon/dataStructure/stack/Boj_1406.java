package subin.baekjoon.dataStructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        String origin = br.readLine();
        for (int i = 0; i < origin.length(); i++) {
            left.push(origin.charAt(i));
        }

        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            String input = br.readLine();
            char order = input.charAt(0);
            if (order == 'L') {
                if (left.empty()) {
                    continue;
                }
                right.push(left.pop());
            } else if (order == 'D') {
                if (right.empty()) {
                    continue;
                }
                left.push(right.pop());
            } else if (order == 'B') {
                if (!left.empty()) {
                    left.pop();
                }
            } else {
                left.push(input.charAt(2));
            }
        }

        while (!left.empty()) {
            right.push(left.pop());
        }
        while (!right.empty()) {
            sb.append(right.pop());
        }

        System.out.println(sb);
    }
}
