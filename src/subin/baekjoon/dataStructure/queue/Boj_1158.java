package subin.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Boj_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        st = new StringTokenizer(input);
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // LinkedList =======================================
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(i + 1);

        }

        int index = 0;
        sb.append("<");
        while (linkedList.size() > 1) {
            index = (index + k - 1) % linkedList.size();
            sb.append(linkedList.remove(index)).append(", ");
        }
        sb.append(linkedList.remove()).append(">");
        System.out.println(sb);

        //linkedList 2 =======================================
        /*LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(i + 1);

        }

        sb.append("<");
        while (!linkedList.isEmpty()) {
            for (int i = 0; i < k; i++) {
                if(i == k-1){
                    if(linkedList.size() == 1){
                        sb.append(linkedList.remove());
                    } else {
                        sb.append(linkedList.remove()).append(", ");
                    }
                }else {
                    linkedList.add(linkedList.remove());
                }
            }
        }
        sb.append(">");
        System.out.println(sb);*/

        // Queue =======================================
        /*Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(i+1);
        }

        sb.append("<");
        while(queue.size() > 1){
            for (int i = 0; i < k-1; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll()).append(">");
        System.out.println(sb);*/
    }
}
