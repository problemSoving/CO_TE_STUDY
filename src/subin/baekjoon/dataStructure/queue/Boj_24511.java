package subin.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Boj_24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] dataStructure = new int[n];
        String a = br.readLine();
        st = new StringTokenizer(a);
        for (int i = 0; i < n; i++) {
            int info = Integer.parseInt(st.nextToken());
            dataStructure[i] = info;
        }

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        String b = br.readLine();
        st = new StringTokenizer(b);
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (dataStructure[i] == 0) {
                arrayDeque.addLast(num);
            }
        }

        int count = Integer.parseInt(br.readLine());
        String input = br.readLine();
        st = new StringTokenizer(input);
        for (int i = 0; i < count; i++) {
            arrayDeque.addFirst(Integer.parseInt(st.nextToken()));
            sb.append(arrayDeque.pollLast()).append(" ");
        }

        System.out.println(sb);
    }
}
