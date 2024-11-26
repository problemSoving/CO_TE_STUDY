package hansol.baekjoon.dataStructure.stack;

import java.io.*;
import java.util.ArrayDeque;

public class Boj_4949 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;

        while (!(input = br.readLine()).equals(".")) {

            ArrayDeque<Character> stack = new ArrayDeque<>();
            boolean isBalanced = true;

            loop:
            for (char word : input.toCharArray()) {

                if (word == '(' || word == '[') {
                    stack.offerLast(word);

                } else if (word == ')') {
                    if (stack.isEmpty() || stack.peekLast() == '[') {
                        isBalanced = false;
                        break loop;
                    } else if (stack.peekLast() == '(') {
                        stack.removeLast();
                    }

                } else if (word == ']') {
                    if (stack.isEmpty() || stack.peekLast() == '(') {
                        isBalanced = false;
                        break loop;
                    } else if (stack.peekLast() == '[') {
                        stack.removeLast();
                    }
                }
            }
            if (isBalanced && stack.isEmpty())  bw.write("yes\n");
            else bw.write("no\n");

        }//while
        bw.flush();
        br.close();
    }
}
