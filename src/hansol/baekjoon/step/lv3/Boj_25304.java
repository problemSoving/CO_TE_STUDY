package hansol.baekjoon.step.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int total = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());

        for (int i = count; i>0 ; i--){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int cnt = Integer.parseInt(st.nextToken());
            total -= price*cnt;

        }
        if(total==0) System.out.println("Yes");
        else System.out.println("No");
        br.close();
    }

}
