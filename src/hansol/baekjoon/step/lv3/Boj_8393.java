package hansol.baekjoon.step.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        for (int i = Integer.parseInt(br.readLine()); i>0; i--){
            sum += i;
        }
        System.out.println(sum);

        br.close();
    }

}
