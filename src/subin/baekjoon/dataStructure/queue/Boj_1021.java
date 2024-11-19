package subin.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Boj_1021 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String input = br.readLine();
        st = new StringTokenizer(input);
        int total = Integer.parseInt(st.nextToken());  // 큐의 크기
        int count = Integer.parseInt(st.nextToken());  // 제거할 숫자의 개수

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= total; i++) {
            list.add(i);
        }

        int moveCount = 0;  // 총 이동 횟수

        String order = br.readLine();
        st = new StringTokenizer(order);
        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(st.nextToken());  // 현재 제거할 숫자
            int numIdx = list.indexOf(num);              // 현재 숫자의 인덱스

            // 2번 연산(앞으로 이동)과 3번 연산(뒤로 이동) 중 더 적은 연산을 선택
            if (numIdx <= list.size() / 2) {
                // 2번 연산이 더 효율적일 경우
                for (int j = 0; j < numIdx; j++) {
                    int movedNum = list.pollFirst();
                    list.offerLast(movedNum);
                    moveCount++;
                }
            } else {
                // 3번 연산이 더 효율적일 경우
                for (int j = 0; j < list.size() - numIdx; j++) {
                    int movedNum = list.pollLast();
                    list.offerFirst(movedNum);
                    moveCount++;
                }
            }

            // 맨 앞에 있는 숫자 제거
            list.pollFirst();
        }

        // 총 이동 횟수 출력
        System.out.println(moveCount);
    }
}
