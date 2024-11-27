package subin.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_13335 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String input = br.readLine();
        st = new StringTokenizer(input);
        int n = Integer.parseInt(st.nextToken());   // 트럭 수
        int w = Integer.parseInt(st.nextToken());   // 다리 길이
        int l = Integer.parseInt(st.nextToken());   // 다리 최대 하중

        String input2 = br.readLine();
        st = new StringTokenizer(input2);
        int[] truck = new int[n];
        for (int i = 0; i < n; i++) {
            truck[i] = Integer.parseInt(st.nextToken());
        }

        Queue<Integer> bridge = new LinkedList<>();
        int time = 0;   // 경과 시간
        int currentWeight = 0;  // 현재 다리 위 무게

        // 초기 다리 상태 (빈 상태)
        for (int i = 0; i < w; i++) {
            bridge.add(0);  // 다리 길이만큼 0으로 채움(빈 공간)
        }

        int index = 0;  // 대기 중인 트럭 인덱스
        while(index < n || currentWeight > 0){
            time++;

            // 다리 맨 앞 트럭 제거
            currentWeight -= bridge.poll();

            // 트럭 추가 가능 여부 확인
            // 현재 다리위 무게 + 올라갈 트럭 무게 <= 다리 하중
            if(index < n && currentWeight + truck[index] <= l){
                // 트럭 추가
                bridge.add(truck[index]);
                currentWeight += truck[index];
                index++;
            } else {
                // 트럭 추가 불가: 빈 공간 0으로 채움
                bridge.add(0);
            }
        }
        System.out.println(time);
    }
}
