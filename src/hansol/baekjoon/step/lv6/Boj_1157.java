package hansol.baekjoon.step.lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();
        int[] alphabet =new int[26];
        for (int i=0; i<word.length();i++){
            int spellIndex = (int)word.charAt(i) - 65;
            alphabet[spellIndex] ++;
        }

        //더 빠른 최댓값 찾기 방법
        int max = -1;
        char answer = 0;
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                answer = (char) (i + 65);
            } else if (alphabet[i] == max) {
                answer = '?';
            }
        }

        System.out.println(answer);

//
//        // 최댓값 찾기
//        int max = alphabet[0];
//        char answer = 0;
//        for (int i=1; i<26;i++){
//            if (max < alphabet[i]) {
//                max = alphabet[i];
//                maxIndex = (char)(i+65);
//            }
//        }
//
//        //최댓값과 같은 값 찾기
//        for (int i=0; i<26;i++){
//            if (max == alphabet[i] && i != maxIndex) {
//                maxIndex=-1;
//                break;
//            }
//        }
//        System.out.println((maxIndex>=0)?(char)(maxIndex+65):"?");


        br.close();
    }
}
