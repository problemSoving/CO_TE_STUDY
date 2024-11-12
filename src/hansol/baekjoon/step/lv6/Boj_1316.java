package hansol.baekjoon.step.lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer=n;

        for (; n>0; n--){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String word = st.nextToken();

            char[] wordArr = new char[word.length()];
            wordArr[0] = word.charAt(0);
            int spellIndex=0;

            for (int i =1; i<word.length(); i++){
                if(word.charAt(i) != word.charAt(i-1)){
                    spellIndex++;
                    wordArr[spellIndex]=word.charAt(i);
                }
            }

            Loop1 : for (int i =0; i<wordArr.length-1 ; i++){
               for (int j=i+1 ; j< wordArr.length;j++){
                   if (wordArr[i]==wordArr[j] && wordArr[j]>0){
                   answer--;
                   break Loop1;

                   }
               }
            }

        }
        System.out.println(answer);
        br.close();
    }
}
