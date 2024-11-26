package hansol.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Boj_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            if (input.length()>5){
                queue.offerLast(Integer.parseInt(input.substring(5)));
                continue;
            }else if (input.equals("pop")) {
                sb.append(queue.isEmpty()?-1:queue.pop());
            }else if (input.equals("size")) {
                sb.append(queue.size());
            }else if (input.equals("empty")) {
                sb.append(queue.isEmpty()?1:0);
            }else if (input.equals("front")) {
                sb.append(queue.isEmpty()?-1:queue.peekFirst());
            }else if (input.equals("back")) {
                sb.append(queue.isEmpty()?-1:queue.peekLast());
            }

            sb.append("\n");

        }

        System.out.println(sb);
        br.close();


    }
}
