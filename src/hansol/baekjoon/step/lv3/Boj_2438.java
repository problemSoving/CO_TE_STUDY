package hansol.baekjoon.step.lv3;

import java.io.BufferedReader;
import java.io.FilePermission;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0;i < cnt ;i++){
            for (int j =0 ; j<=i; j++){
                sb.append("*");
            }
                sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
