package hansol.baekjoon.step.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int range = Integer.parseInt(st.nextToken());
        int cnt = Integer.parseInt(st.nextToken());

        // 바구니 초기화
        int[] ballArr = new int[range];
        for (int i=0; i<range ; i++){
            ballArr[i]=i+1;
        }

        //바구니 볼 바꾸니
        for (int i=0;i<cnt;i++) {
            StringTokenizer change = new StringTokenizer(br.readLine());
            int bsk1 = Integer.parseInt(change.nextToken())-1;
            int bsk1Ball = ballArr[bsk1];
            int bsk2 = Integer.parseInt(change.nextToken())-1;
            int bsk2Ball = ballArr[bsk2];

            ballArr[bsk1] = bsk2Ball;
            ballArr[bsk2] = bsk1Ball;
        }

        //바구니 출력
        StringBuilder sb = new StringBuilder();
        for (int num : ballArr){
            sb.append(num).append(" ");
        }
        System.out.println(sb);

    }
}


