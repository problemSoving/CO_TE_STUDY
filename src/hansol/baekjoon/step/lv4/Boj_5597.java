package hansol.baekjoon.step.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //배열 초기화
        int[] numArr = new int[30];
        for (int i =0; i<numArr.length; i++){
            numArr[i]=i+1;
        }

        //제출 입력받기
        for (int i=0; i<28; i++){
            int submit = Integer.parseInt(br.readLine())-1;
            numArr[submit] = 0;
        }

        //출력
        StringBuilder sb = new StringBuilder();
        for (int num : numArr){
            if (num>0) sb.append(num).append("\n");
        }
        System.out.println(sb);

        br.close();
    }
}
