package subin.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj_5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            String input = br.readLine();

            // 커서 기준 왼쪽
            Stack<Character> front = new Stack<>();
            // 커서 기준 오른쪽
            Stack<Character> back = new Stack<>();

            for (int j = 0; j < input.length(); j++) {
                if(input.charAt(j) == '<'){
                    if(front.size() == 0){
                        continue;
                    }
                    back.push(front.pop());
                } else if(input.charAt(j) == '>'){
                    if(back.size() == 0){
                        continue;
                    } front.push(back.pop());
                } else if(input.charAt(j) == '-'){
                    if(front.size() == 0){
                        continue;
                    }front.pop();
                } else {
                    front.push(input.charAt(j));
                }
            }

            while(!front.empty()){
                back.push(front.pop());
            }
            while(!back.empty()){
                sb.append(back.pop());
            }
            sb.append("\n");

        }
        System.out.println(sb);
    }
}
