package hansol.baekjoon.step.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());

        String[] str = br.readLine().split(" ");
        Double a = Double.parseDouble(str[0]);
        Double b = Double.parseDouble(str[1]);

        System.out.println(a/b);
        br.close();
    }
}
