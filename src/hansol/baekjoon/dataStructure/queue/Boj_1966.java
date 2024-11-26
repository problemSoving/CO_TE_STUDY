package hansol.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Boj_1966 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int test = Integer.parseInt(br.readLine());

        for (int i = 0; i < test; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            StringTokenizer stNums = new StringTokenizer(br.readLine(), " ");
            int[] cntArr = new int[9]; // 중요도 갯수 카운트 배열
            int max = 0; // 가장 높은 중요도

            // input 인쇄 queue 초기화
            LinkedList<Integer> queue = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(stNums.nextToken());
                if (max < num) max = num;
                cntArr[num - 1]++;
                queue.addLast(num);
            }

            int print = 0; // 프린트 횟수

            // 가장 높은 중요도부터 출력
            loop:
            for (int j = max; max > 0; max--) {

                for (int k = 0; k < n; k++) {

                    if (cntArr[max - 1] == 0) break; //현재 중요도에 출력할게 없으면 탈출

                    if (queue.getFirst() == max) {
                        queue.removeFirst();
                        print++;
                        cntArr[max - 1]--;

                        if (m == 0) { //출력시 m ==0번째 인덱스에 왔으면 test loop 탈출
                            sb.append(print).append("\n");
                            break loop;
                        } else m--;

                    } else {
                        if (m == 0) m = queue.size() - 1;
                        else m--;

                        queue.addLast(queue.pollFirst());
                    }
                }

            }// one test

        }// All test

        System.out.println(sb);


    }
}
