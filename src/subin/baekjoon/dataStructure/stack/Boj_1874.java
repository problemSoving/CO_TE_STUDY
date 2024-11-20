package subin.baekjoon.dataStructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Boj_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        int check = 0;

        for (int i = 0; i < testCase; i++) {
            int num = Integer.parseInt(br.readLine());

            if (check < num) {
                for (int j = check + 1; j <= num; j++) {
                    arrayDeque.push(j);
                    sb.append("+").append("\n");
                }
                check = num;
            } else if (arrayDeque.peek() != num) {
                System.out.println("NO");
                return;
            }
            arrayDeque.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}