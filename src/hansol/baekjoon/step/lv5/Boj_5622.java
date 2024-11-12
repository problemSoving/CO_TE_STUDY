package hansol.baekjoon.step.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int cnt =0;
        for (int i = 0 ; i< word.length(); i++){
             char spell = word.charAt(i);

             if(spell<'P')cnt+=(spell-65)/3+3;
             else if (spell<'T') cnt+=8;
             else if (spell<'W') cnt+=9;
             else if (spell<='Z') cnt+=10;
        }
        System.out.println(cnt);
    }
}
