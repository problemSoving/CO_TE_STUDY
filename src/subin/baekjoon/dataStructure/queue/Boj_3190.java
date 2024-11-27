package subin.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Boj_3190 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Deque<int[][]> snake = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        boolean[][] apple = new boolean[k][k];
        for (int i = 0; i < k; i++) {
            String inputK = br.readLine();
            st = new StringTokenizer(inputK);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            apple[x][y] = true;
        }

        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            String inputL = br.readLine();
            st = new StringTokenizer(inputL);
            int number = Integer.parseInt(st.nextToken());
            String turn = st.nextToken();

//            int[][]

            switch (turn){
                case "D":

                    break;
            }

        }



    }
}
