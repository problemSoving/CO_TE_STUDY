package hansol.baekjoon.step.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i =0; i<t; i++){
            String word = br.readLine();
            sb.append(word.substring(0,1)).append(word.substring(word.length()-1)).append("\n");
        }
        System.out.println(sb);
        br.close();
    }

}
