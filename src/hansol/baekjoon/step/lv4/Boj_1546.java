package hansol.baekjoon.step.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1546 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        //점수 배열 초기화, 최대 점수 추출
        int[] mArr = new int[n];
        mArr[0]= Integer.parseInt(st.nextToken());
        int max = mArr[0];
        for (int i=1; i<mArr.length; i++){
            mArr[i]= Integer.parseInt(st.nextToken());
            if (max<mArr[i]) max=mArr[i];
        }
        
        //새로운 평균
        float total=0f;
        for (int i =0; i<mArr.length ; i++){
            total+=(mArr[i]/(float)max)*100;
        }

        // 출력
        System.out.println(total/n);
        br.close();
    }
}
