package hansol.baekjoon.step.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int sNum1 = num1%10*100+(num1%100)/10*10+num1/100;
        int sNum2 = num2%10*100+(num2%100)/10*10+num2/100;
        System.out.println((sNum1>sNum2)?sNum1:sNum2);

        br.close();

    }
}
