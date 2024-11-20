package subin.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj_5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            String input = br.readLine();

            Stack<Character> front = new Stack<>();
            Stack<Character> back = new Stack<>();

            for (int j = 0; j < input.length(); j++) {
                char a = input.charAt(j);

                if (a == '<') {
                    if (front.empty()) {
                        continue;
                    }
                    back.push(front.pop());
                } else if (a == '>') {
                    if (back.empty()) {
                        continue;
                    }
                    front.push(back.pop());
                } else if (a == '-') {
                    if (front.empty()) {
                        continue;
                    }
                    front.pop();
                } else {
                    front.push(a);
                }
            }

            while (!front.empty()) {
                back.push(front.pop());
            }
            while (!back.empty()) {
                sb.append(back.pop());
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
