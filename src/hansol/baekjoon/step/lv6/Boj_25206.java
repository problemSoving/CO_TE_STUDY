package hansol.baekjoon.step.lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float totalScore=0;
        float totalHakjum=0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            st.nextToken();
            String[] score = {st.nextToken(),st.nextToken()};

            if (score[1].equals("P")) {
                continue;
            }else{
                totalHakjum+=Float.parseFloat(score[0]);
                switch (score[1]){
                    case "A+":totalScore+=Float.parseFloat(score[0])*4.5f;break;
                    case "A0":totalScore+=Float.parseFloat(score[0])*4.0f;break;
                    case "B+":totalScore+=Float.parseFloat(score[0])*3.5f;break;
                    case "B0":totalScore+=Float.parseFloat(score[0])*3.0f;break;
                    case "C+":totalScore+=Float.parseFloat(score[0])*2.5f;break;
                    case "C0":totalScore+=Float.parseFloat(score[0])*2.0f;break;
                    case "D+":totalScore+=Float.parseFloat(score[0])*1.5f;break;
                    case "D0":totalScore+= Float.parseFloat(score[0]);break;
                    case "F":totalScore+=Float.parseFloat(score[0])*0.0f;break;
                }

            }
        }
        System.out.printf("%.6f",totalScore/totalHakjum);
        br.close();
    }

}
