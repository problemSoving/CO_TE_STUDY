package hansol.baekjoon.step.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i= (Integer.parseInt(br.readLine())/4); i>0; i--){
            sb.append("long ");
        }
            sb.append("int");
        System.out.println(sb);
        br.close();
    }
}
