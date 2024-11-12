package subin.baekjoon.step.lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double total = 0;     // 학점 x 과목평점
        double creditSum = 0;      // 학점 총합

        for (int i = 0; i < 20; i++) {
            String input = br.readLine();
            st = new StringTokenizer(input);
            String major = st.nextToken();
            double credit = Double.parseDouble(st.nextToken()); // 학점
            String score = st.nextToken();                      // 등급

            switch (score) {
                case "A+":
                    total += 4.5 * credit;
                    break;
                case "A0":
                    total += 4.0 * credit;
                    break;
                case "B+":
                    total += 3.5 * credit;
                    break;
                case "B0":
                    total += 3.0 * credit;
                    break;
                case "C+":
                    total += 2.5 * credit;
                    break;
                case "C0":
                    total += 2.0 * credit;
                    break;
                case "D+":
                    total += 1.5 * credit;
                    break;
                case "D0":
                    total += 1.0 * credit;
                    break;
                case "F":
                    total += 0;
                    break;
                case "P":
                    credit = 0;
                    break;
            }

            creditSum += credit;

        }
        System.out.println(total / creditSum);

    }
}
