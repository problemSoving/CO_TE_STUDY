package hansol.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Boj_13335 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        // 버스 리스트
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int bus = Integer.parseInt(st2.nextToken());
            queue.offerLast(bus);
        }

        // 다리 셋팅
        LinkedList<Integer> bridge = new LinkedList<>();
        for (int i = 0; i< w; i ++) bridge.push(0);

        //다리 건너기
        int time = 0;
        int weight = 0;
        boolean isCrossing = true;
        while (isCrossing){

            time++;
            if (bridge.peekFirst()!=0){
                weight -= bridge.pop();
            }else bridge.pop();

            if( !queue.isEmpty() && weight + queue.peekFirst() <= l ) {
                int bus = queue.pop();
                weight += bus;
                bridge.offerLast(bus);
            }else bridge.offerLast(0);

            if(queue.isEmpty()) break;
        }
        time+=w;
        System.out.println(time);
    }

}
