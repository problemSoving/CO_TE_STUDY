package hansol.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Boj_11866 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i =0 ; i < n ; i++) queue.offerLast(i+1);


        sb.append("<");
        while (1<queue.size()){
            for (int i = 0; i<k-1; i++) {
                queue.offerLast(queue.pop());
            }
            sb.append(queue.pop()).append(", ");
        }
        sb.append(queue.pop()).append(">");

        System.out.println(sb);
        br.close();



    }

}
