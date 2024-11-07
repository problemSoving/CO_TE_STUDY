package subin.baekjoon.step.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        double[] arr = new double[n];

        String input = br.readLine();
        double maxScore = 0;
        double result = 0;

        st = new StringTokenizer(input);
        for (int i = 0; i < n; i++) {
            double score = Double.parseDouble(st.nextToken());
            arr[i] = score;

            if (maxScore < score) {
                maxScore = score;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = (arr[i] / maxScore) * 100;
            result += arr[i];
        }
        System.out.println(result / n);
    }
}
