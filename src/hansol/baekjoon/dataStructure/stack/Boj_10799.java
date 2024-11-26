package hansol.baekjoon.dataStructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Boj_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        int total = 0;
        boolean isSecond=false;
        for (char bracket : input.toCharArray()){
            if (bracket=='('){
                stack.push(bracket);
                isSecond=false;
            }else{
                if (stack.peek()=='(' && !isSecond){
                    stack.pop();
                    total += stack.size();
                    isSecond=true;
                }else{
                    stack.pop();
                    total ++;
                }
            }
        }

        System.out.println(total);


    }
}
