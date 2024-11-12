package hansol.baekjoon.step.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_27866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int i = Integer.parseInt(br.readLine());

        System.out.println(word.substring(i-1,i));
        br.close();
    }

}
