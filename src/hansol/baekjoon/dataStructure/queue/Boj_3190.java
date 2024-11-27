package hansol.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_3190 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine()); //사과의 갯수

        //게임판 셋팅
        int[][] stage = new int[n][n];
        for (int[] y : stage) {
            Arrays.fill(y, 0);
        }


        //사과 위치
        ArrayDeque<int[]> apples = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            stage[x - 1][y - 1] = 2;
        }

        // 방향
        int l = Integer.parseInt(br.readLine()); //방향 전환 횟수
        ArrayDeque<String[]> course = new ArrayDeque<>();
        for (int i = 0; i < l; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String[] handle = new String[2];
            handle[0] = st.nextToken();
            handle[1] = st.nextToken();

            course.offerLast(handle);
        }

        //게임 셋팅
        int time = 0;
        LinkedList<int[]> snake = new LinkedList<>();
        int[] init = {0, 0}; // 뱀의 위치
        snake.push(init);
        stage[0][0] = 1;

        int direction = 90;  //뱀 머리 방향  위쪽-> 0도
        boolean isLife = true; // 현재 목숨

        while (isLife) {

            //방향
            if (!course.isEmpty()) {
                String[] handle = course.peekFirst();
                int timing = Integer.parseInt(handle[0]);
                if (time == timing) {
                    if (handle[1].equals("D")) direction = (direction + 90) % 360;
                    else direction = (direction - 90) >= 0 ? (direction - 90) : 270;
                    course.removeFirst();
                }
            }

            int[] head = snake.peekFirst();
            int x = head[0];
            int y = head[1];

            //직진
            if (direction == 0) {
                x--;
            } else if (direction == 90) {
                y++;
            } else if (direction == 180) {
                x++;
            } else if (direction == 270) {
                y--;
            }

            time++;
            if (x < 0 || y < 0 || x > n - 1 || y > n - 1 || stage[x][y] == 1) {
                isLife = false;
                break;
            }


            if (stage[x][y] == 0) {
                int[] tail = snake.peekLast();
                stage[tail[0]][tail[1]] = 0;
                snake.removeLast();
            }

            stage[x][y] = 1;
            int[] newHead = {x, y};
            snake.addFirst(newHead);

        }
        System.out.println(time);
        br.close();
    }
}
