package subin.baekjoon.step.lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String n = br.readLine();
        st = new StringTokenizer(n);
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int[][] a = new int[x][y];
        int[][] b = new int[x][y];

        for (int i = 0; i < x; i++) {
            String input = br.readLine();
            st = new StringTokenizer(input);
            for (int j = 0; j < y; j++) {
                int number = Integer.parseInt(st.nextToken());
                a[i][j] = number;
            }
        }

        for (int i = 0; i < x; i++) {
            String input = br.readLine();
            st = new StringTokenizer(input);
            for (int j = 0; j < y; j++) {
                int number = Integer.parseInt(st.nextToken());
                b[i][j] = number;
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int numA = a[i][j];
                int numB = b[i][j];
                sb.append(numA+numB).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);


    }
}
