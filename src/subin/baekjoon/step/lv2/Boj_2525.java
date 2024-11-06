package subin.baekjoon.step.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input);
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        int time = Integer.parseInt(br.readLine());

        if(minute + time > 59) {
            hour = hour + (minute+time)/60;
            minute = (minute+time)%60;
            if(hour > 23){
                hour = hour%24;
            }
        }else {
            minute = minute+time;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(hour).append(" ").append(minute);
        System.out.println(sb);
    }
}