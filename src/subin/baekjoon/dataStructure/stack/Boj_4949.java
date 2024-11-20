package subin.baekjoon.dataStructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Boj_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = "";

        while (true) {
            ArrayDeque<Character> arrayDeque = new ArrayDeque<>();
            input = br.readLine();
            boolean isBalanced = true;

            if (input.equals(".")) break;

            for (int i = 0; i < input.length(); i++) {
                char check = input.charAt(i);

                if (check == '(' || check == '[') {
                    arrayDeque.push(check);
                } else if (check == ')') {
                    if (arrayDeque.isEmpty() || arrayDeque.peek() != '(') {
                        isBalanced = false;
                        break;
                    } else {
                        arrayDeque.pop();
                    }
                } else if (check == ']') {
                    if (arrayDeque.isEmpty() || arrayDeque.peek() != '[') {
                        isBalanced = false;
                        break;
                    } else {
                        arrayDeque.pop();
                    }
                }
            }
            if (isBalanced && arrayDeque.isEmpty()) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }
        System.out.println(sb);
    }
}
