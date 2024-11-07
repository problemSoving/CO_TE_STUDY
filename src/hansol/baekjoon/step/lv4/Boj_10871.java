package hansol.baekjoon.step.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10871 {

//   no 배열
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int cnt = Integer.parseInt(st.nextToken());
//        int compareNum = Integer.parseInt(st.nextToken());
//
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st2 = new StringTokenizer(br.readLine());
//
//        while (st2.hasMoreTokens()){
//            int num= Integer.parseInt(st2.nextToken());
//            if (num<compareNum) sb.append(num).append(" ");
//        }
//
//        System.out.println(sb);
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int compareNum = Integer.parseInt(st.nextToken());
        int[] numArr = new int[size];

        StringBuilder sb = new StringBuilder();
        StringTokenizer st2 = new StringTokenizer(br.readLine());

       for(int i=0; i<size; i++){
            numArr[i] = Integer.parseInt(st2.nextToken());
        }

       for (int num : numArr){
            if (num<compareNum) sb.append(num).append(" ");
       }

        System.out.println(sb);
    }
}
