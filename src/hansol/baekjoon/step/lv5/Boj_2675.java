package hansol.baekjoon.step.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for ( ; num>0 ; num--){
            String word = br.readLine();
            int r = Integer.parseInt(word.substring(0,1));
            for (int i=2; i<word.length();i++){
                for (int j = 0 ;j<r;j++){
                    sb.append(word.substring(i,i+1));
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
