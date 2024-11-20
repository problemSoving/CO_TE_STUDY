package hansol.baekjoon.dataStructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj_1406 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        int cnt = Integer.parseInt(br.readLine());
        
        //첫째줄 셋팅
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        for (char word : line1.toCharArray()){
            left.push(word);
        }


        for (int i=0; i<cnt; i++){
            String input = br.readLine();
            char edit = input.charAt(0);
            if ( edit =='L'){
                if (!left.empty())right.push(left.pop());
            }else if ( edit =='D'){
                if (!right.empty())left.push(right.pop());
            }else if ( edit =='B'){
                if (!left.empty())left.pop();
            }else if ( edit =='P'){
                left.push(input.charAt(2));
            }
        }


        StringBuilder sb = new StringBuilder();
        while (!left.empty()) right.push(left.pop());
        while (!right.empty()) sb.append(right.pop());

        System.out.println(sb);
        br.close();
    }
}
