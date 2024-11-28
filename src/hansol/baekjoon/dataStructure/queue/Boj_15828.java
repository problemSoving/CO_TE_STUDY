package hansol.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Boj_15828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int input;
        int cnt = 0 ;
        while ((input = Integer.parseInt(br.readLine())) != -1){
            if (input==0 && !queue.isEmpty()){
                queue.pop();
                cnt--;
            }
            else if (cnt==n) continue;
            else{
                queue.offerLast(input);
                cnt++;
            }
        }

        if (queue.isEmpty()) sb.append("empty");
        else {
            for (int num : queue) {
                sb.append(queue.pop()).append(" ");
            }
        }
        System.out.println(sb);
    }
}
