package hansol.baekjoon.step.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        StringTokenizer nums = new StringTokenizer(br.readLine());
        int[] numArr = new int[size];

        for(int i=0; i<size;i++)  numArr[i] = Integer.parseInt(nums.nextToken());

        int max=numArr[0];
        int min=numArr[0];

        for (int num : numArr){
            if(max<num) max = num;
            if(min>num) min = num;
        }
        System.out.println(min+" "+max);


        br.close();
    }
}
