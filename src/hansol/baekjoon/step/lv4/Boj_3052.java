package hansol.baekjoon.step.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 배열 % 42 나머지 저장
        int[] numArr = new int[10];
        for (int i =0; i<10; i++){
            numArr[i] = Integer.parseInt(br.readLine())%42;
        }

        // 서로 다른 나머지 갯수 카운트
        int cnt = numArr.length;
        for(int i =0; i< numArr.length; i++){
            int compare=0;
            for(int j =i+1; j< numArr.length; j++){
             if (numArr[i] == numArr[j]) compare++;
            }
            if(compare>0) cnt--;
        }
        // 출력
        System.out.println(cnt);
    br.close();
    }


//    ★set - 중복을 허용하지 않음
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[] a = new int[10];
//        for(int i=0; i<a.length; i++){
//            a[i] = Integer.parseInt(br.readLine())%42;
//        }
//        HashSet<Integer> set = new HashSet<>();
//        for(int i: a)
//            set.add(i);
//        System.out.println(set.size());
//    }


}
