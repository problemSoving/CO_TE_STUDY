package subin.baekjoon.dataStructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            String input = br.readLine();

            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < input.length(); j++) {
                char check = input.charAt(j);

                if (check == '(') {
                    stack.push(check);
                } else if (stack.empty()) {
                    stack.push(check);
                    break;
                } else {
                    stack.pop();
                }
            }

            if (stack.empty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
