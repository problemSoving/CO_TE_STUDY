package subin.baekjoon.step.lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        boolean isPalindrome = true;

        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) != input.charAt(input.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
