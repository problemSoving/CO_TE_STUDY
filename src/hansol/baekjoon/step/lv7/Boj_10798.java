package hansol.baekjoon.step.lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_10798 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stArr = new String[5];

        int maxLength = 1;
        for (int i = 0; i < 5; i++) {
            String input = br.readLine();
            stArr[i] = input;
            if (input.length() > maxLength) maxLength = input.length();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (stArr[j].length() < i + 1) {
                    continue;
                }
                sb.append(stArr[j].charAt(i));

            }
        }

        System.out.println(sb);
        br.close();
    }


}
