package hansol.baekjoon.step.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cook = Integer.parseInt(br.readLine());

        if (m + cook < 60) System.out.println( h +" "+(m+cook));
        else if (h + (m + cook)/60 >=24) System.out.println( (h+(m + cook)/60-24) +" "+(m + cook)%60);
        else System.out.println( (h+(m + cook)/60) +" "+(m + cook)%60);


    }
}
