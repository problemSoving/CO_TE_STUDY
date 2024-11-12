package hansol.baekjoon.step.lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        String DZ = "dz=";
        String[] croatia = {"c=","c-","d-","lj","nj","s=","z="};

        //크로아티아 3글자 문자 제거 -> 반복문 돌리기 위해서 공백 남기기
        String onlyAlphabet = word;
        onlyAlphabet = word.replace(DZ, "");
        int cnt3Spell = (word.length()-onlyAlphabet.length())/3;


        //초기화 -> 크로아티아 2글자 문자 제거 -> 반복문 돌리기 위해서 공백 남기기
        onlyAlphabet = word.replace(DZ, " ");
        for (String cWord : croatia) {
            onlyAlphabet = onlyAlphabet.replace(cWord, " ");
        }
        onlyAlphabet = onlyAlphabet.replace(" ","");
        int cnt2Spell = (word.length()-(cnt3Spell*3)-onlyAlphabet.length())/2;


        // 전체 글자수 - (cnt3Spell*3 + cnt2Spell*2) + cnt3Spell + cnt2Spell
        System.out.println(word.length() - (cnt3Spell*3 + cnt2Spell*2) + cnt3Spell + cnt2Spell);
        br.close();
    }
}
