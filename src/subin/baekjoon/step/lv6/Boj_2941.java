package subin.baekjoon.step.lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // [방법 1]
        // 한글자로 취급할 문자 목록(크로아티아 문자)
        String[] words = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        // 크로아티아 문자를 문자 한개로 바꾸기
        for (int i = 0; i < words.length; i++) {
            input = input.replace(words[i],"0");
        }

        // 크로아티아를 일반 문자로 바꿨을때 문자의 길이를 확인하는 문제라 크로아티아 문자 자체를 일반 문자 1개로 치환한 뒤 길이를 확인함
        System.out.println(input.length());

        // [방법 2]
        // string의 subString() 메소드 사용
        // subString()은 문자열의 특정 부분을 잘라내는데 사용함
        // - 문자열.subString(시작 인덱스)
        // - 문자열.subString(시작 인덱스, 마지막 인덱스)

        /*
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (i < input.length() - 1) {
                // 두글자짜리 크로아티아 문자 비교
                String pair = input.substring(i, i + 2);
                if (pair.equals("c=") || pair.equals("c-") || pair.equals("d-") || pair.equals("lj")
                || pair.equals("nj") || pair.equals("s=") || pair.equals("z=")) {
                    count++;
                    i++;        // 다음문자까지 비교 생략
                    continue;
                // 세글자짜리 크로아티아 문자 비교
                } else if (i < input.length() - 2 && input.substring(i, i + 3).equals("dz=")) {
                    count++;
                    i += 2;         // 비교 시작 문자 ~ 2칸 뒤 문자까지 비교 생략
                    continue;
                }
            }
            count++;
        }
        System.out.println(count);
        */
    }
}
