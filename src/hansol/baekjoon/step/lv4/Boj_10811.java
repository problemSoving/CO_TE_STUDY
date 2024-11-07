package hansol.baekjoon.step.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10811 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 1 ~ n 바구니 초기화
        int[] basket = new int[n];
        for (int i = 0; i < n; i++) basket[i] = i + 1;

        // 바구니 바꾸기
        for (int a = 0; a < m; a++) {
            StringTokenizer change = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(change.nextToken()) - 1;
            int j = Integer.parseInt(change.nextToken()) - 1;
            for (; i < j; i++) {
                int tmp = basket[i];
                basket[i] = basket[j];
                basket[j] = tmp;
                j--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int num : basket) {
            sb.append(num).append(" ");
        }
        System.out.println(sb);
    }
}
