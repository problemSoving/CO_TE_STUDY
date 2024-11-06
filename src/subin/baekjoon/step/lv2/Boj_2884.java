package subin.baekjoon.step.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input);
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        if (minute < 45) {
            minute = minute + 60 - 45;
            if (hour == 0) {
                hour = 24;
            }
            hour = hour - 1;
        } else {
            minute = minute - 45;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(hour);
        sb.append(" ");
        sb.append(minute);
        System.out.println(sb);
    }
}
