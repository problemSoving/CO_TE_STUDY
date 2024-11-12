package hansol.baekjoon.step.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

//        int num =0;
//        while (st.hasMoreTokens()) {
//            String token = st.nextToken();
//            num++;
//        }

        System.out.println(st.countTokens());

    }
}
