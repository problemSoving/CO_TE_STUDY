package hansol.baekjoon.dataStructure.stack;

import java.io.*;
import java.util.ArrayDeque;

public class Boj_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input == 0 && !stack.isEmpty() ) stack.pop();
            else stack.push(input);

        }

        int sum = 0;
        while (!stack.isEmpty()) sum += stack.pop();
        System.out.println(sum);

        br.close();
    }
}
