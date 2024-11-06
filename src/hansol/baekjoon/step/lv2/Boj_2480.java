package hansol.baekjoon.step.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a==b && a==c) System.out.println(a*1000+10000);
        else if (a==b || a==c )  System.out.println(a*100+1000);
        else if (b==c)  System.out.println(b*100+1000);
        else{
            int max = Math.max(a, Math.max(b, c));
            System.out.println(max*100);
        }

        br.close();
    }


}
