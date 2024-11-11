package subin.baekjoon.step.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int result = input.charAt(0);
        System.out.println(result);
    }
}

/*
String은 char로 쪼갤 수 있고, 각각의 char는 아스키 코드로 변환이 가능하다.
 String -> ASCII
 1. String -> char
 2. char -> int => ASCII
 + char를 아스키 코드가 아닌 char값 자체를 int 값으로 하고 싶다면?
 => Character.getNumericValue();
*/