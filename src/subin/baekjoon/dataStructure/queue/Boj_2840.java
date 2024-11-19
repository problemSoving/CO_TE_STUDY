package subin.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_2840 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String nk = br.readLine();
        st = new StringTokenizer(nk);
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Character> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add('?');
        }

        int index = 0;

        for (int i = 0; i < k; i++) {
            String input = br.readLine();
            st = new StringTokenizer(input);
            int num = Integer.parseInt(st.nextToken());
            char alphabet = st.nextToken().charAt(0);

            index = (index + num) % n;


            if (list.get(index) == '?') {
                // 알파벳이 다른 위치에 있는지 검증
                if (list.contains(alphabet)) {
                    System.out.println("!");
                    return;
                }
                list.set(index, alphabet);
            } else if (list.get(index) != alphabet) {
                // 이미 할당된 위치의 알파벳이 다른 경우
                System.out.println("!");
                return;
            }
        }

        // 마지막 인덱스부터 시계 방향으로 출력
        // 예) 인덱스: 2, n: 5 [2-> 1 -> 0 -> 4 -> 3]
        for (int i = 0; i < n; i++) {
            sb.append(list.get((index - i + n) % n));
        }
        System.out.println(sb);
    }
}

