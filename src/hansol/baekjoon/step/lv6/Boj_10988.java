package hansol.baekjoon.step.lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int cnt =word.length();
        int answer = 1;
        for (int i =0; i<cnt/2;i++){
            if (word.charAt(i)!=word.charAt(cnt-1-i)) {
                answer = 0;
                break;
            }
        }
        System.out.println(answer);
        br.close();
    }
}
