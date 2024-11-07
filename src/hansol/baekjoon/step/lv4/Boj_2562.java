package hansol.baekjoon.step.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.parseInt(br.readLine());
        int numIndex=1;
        for(int i =2 ; i<=9;i++){
            int num = Integer.parseInt(br.readLine());
            if(max<num){
                max = num;
                numIndex=i;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(max).append("\n").append(numIndex);
        System.out.println(sb);
        br.close();

    }

}