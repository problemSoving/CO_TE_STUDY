package subin.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_1966 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String input1 = br.readLine();
            st = new StringTokenizer(input1);
            int n = Integer.parseInt(st.nextToken()); // 문서 개수
            int m = Integer.parseInt(st.nextToken()); // 목표 인덱스

            Queue<int[]> queue = new ArrayDeque<>();
            List<Integer> priorityList = new LinkedList<>();

            String input2 = br.readLine();
            st = new StringTokenizer(input2);

            for (int j = 0; j < n; j++) {
                int priority = Integer.parseInt(st.nextToken());
                queue.offer(new int[]{j, priority});
                priorityList.add(priority);
            }

            int count = 0;

            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                int currentIndex = current[0];
                int currentPriority = current[1];

                // 큐에서 꺼낸 문서의 중요도가 현재 리스트의 최대 중요도와 일치하는지 확인
                if (currentPriority == Collections.max(priorityList)) {
                    count++;
                    // 인쇄한 문서의 중요도 삭제
                    priorityList.remove(Integer.valueOf(currentPriority));

                    // 목표 문서의 인덱스인지 확인
                    if (currentIndex == m) {
                        sb.append(count).append("\n");
                    }
                } else {
                    // 중요도가 낮으면 큐 뒤로 다시 저장
                    queue.offer(current);
                }
            }
        }
        System.out.println(sb);
    }
}