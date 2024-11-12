package subin.baekjoon.step.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // 뒤집은 숫자 저장할 stringBuilder
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        String input = br.readLine();
        st = new StringTokenizer(input);
        String num1 = st.nextToken();
        String num2 = st.nextToken();

        // 숫자 뒤집어서 저장
        for (int i = 2; i >= 0; i--) {
            a.append(num1.charAt(i));
            b.append(num2.charAt(i));
        }

        // 숫자 비교를 위해 StringBuilder -> String -> int 형변환
        int result = 0;
        int numA = Integer.parseInt(String.valueOf(a));
        int numB = Integer.parseInt(String.valueOf(b));

        result = Math.max(numA, numB);
        System.out.println(result);
    }
}
