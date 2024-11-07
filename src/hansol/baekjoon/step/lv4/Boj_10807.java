package hansol.baekjoon.step.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;

public class Boj_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int str = Integer.parseInt(br.readLine());

        String[] strArr = br.readLine().split(" ");
        int fineNum = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (String num : strArr){
            if (Integer.parseInt(num)==fineNum) cnt++;
        }
        System.out.println(cnt);

    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(r.readLine());
//        StringTokenizer st = new StringTokenizer(r.readLine());
//        int[] ar= new int[n];
//
//        for(int i = 0; i < n; i++){
//            ar[i] = Integer.parseInt(st.nextToken());
//        }
//
//        int target = Integer.parseInt(r.readLine());
//        int count = 0;
//
//        for(int i = 0; i < n; i++){
//            if(ar[i]==target){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }

}
