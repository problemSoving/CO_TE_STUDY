package subin.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_3190 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 보드 크기
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        for (int[] y : map) {
            Arrays.fill(y, 0);
        }

        // 사과 위치
        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            map[x][y] = 2; // 사과 표시
        }

        // 방향 전환 정보 입력
        int l = Integer.parseInt(br.readLine());
        Deque<int[]> directions = new ArrayDeque<>();
        for (int i = 0; i < l; i++) {
            st = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(st.nextToken());
            char direction = st.nextToken().charAt(0);
            directions.add(new int[]{time, direction});
        }

        // 방향 설정 (오른쪽, 아래, 왼쪽, 위)
        int[] dx = {0, 1, 0, -1};  // x 축 이동 (오른쪽, 아래, 왼쪽, 위)
        int[] dy = {1, 0, -1, 0};  // y 축 이동 (오른쪽, 아래, 왼쪽, 위)

        int direction = 0;  // 초기 방향은 오른쪽 (0:오른쪽, 1:아래, 2:왼쪽, 3:위)
        int currentTime = 0;

        // 뱀의 몸
        Deque<int[]> snake = new LinkedList<>();
        snake.offer(new int[]{0, 0});  // 뱀의 초기 위치 (0, 0)
        map[0][0] = 1;  // 뱀의 시작 위치를 표시

        while (true) {
            currentTime++;  // 시간이 1초 흐름

            // 새로운 머리 위치 계산
            int headX = snake.getFirst()[0] + dx[direction];
            int headY = snake.getFirst()[1] + dy[direction];

            // 벽에 부딪히거나 자기 몸에 부딪히면 종료
            if (headX < 0 || headY < 0 || headX >= n || headY >= n || map[headX][headY] == 1) {
                System.out.println(currentTime);  // 종료 시점
                return;
            }

            // 새로운 머리 위치에 사과가 있으면
            if (map[headX][headY] == 2) {
                map[headX][headY] = 1;  // 먹이를 먹음
                snake.offerFirst(new int[]{headX, headY});  // 머리 추가
            } else {
                // 먹이가 없으면 꼬리 제거
                map[headX][headY] = 1;  // 새로운 머리 위치
                snake.offerFirst(new int[]{headX, headY}); // 머리 이동
                int[] tail = snake.pollLast();  // 꼬리 제거
                map[tail[0]][tail[1]] = 0;  // 빈 공간으로 만듬
            }

            // 방향 전환 처리
            if (!directions.isEmpty() && directions.peek()[0] == currentTime) {
                int[] turn = directions.pollFirst();
                if (turn[1] == 'D') {  // 'D'는 오른쪽 회전
                    direction = (direction + 1) % 4;
                } else if (turn[1] == 'L') {  // 'L'은 왼쪽 회전
                    direction = (direction + 3) % 4;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(map[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("------------");
        }
    }
}
