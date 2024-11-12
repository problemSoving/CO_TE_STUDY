package hansol.baekjoon.step.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i ='a'; i<='z' ; i++){
            sb.append(word.indexOf((char)i)).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
}
