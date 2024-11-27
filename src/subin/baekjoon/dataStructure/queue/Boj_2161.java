package subin.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Boj_2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= num; i++) {
            queue.offer(i);
        }

        while(queue.size() > 1){
            sb.append(queue.poll()).append(" ");
            queue.offer(queue.poll());
        }
        sb.append(queue.poll());

        System.out.println(sb);
    }
}
