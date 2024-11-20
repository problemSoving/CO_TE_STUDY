package subin.baekjoon.dataStructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Boj_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        for (int i = 0; i < testCase; i++) {
            int number = Integer.parseInt(br.readLine());
            if (number == 0) {
                arrayDeque.pop();
            } else {
                arrayDeque.push(number);
            }
        }

        int result = 0;
        while (!arrayDeque.isEmpty()) {
            result += arrayDeque.pop();
        }

        System.out.println(result);

//        Stack<Integer> stack = new Stack<>();
//
//        for (int i = 0; i < testCase; i++) {
//            int number = Integer.parseInt(br.readLine());
//            if(number != 0){
//                stack.push(number);
//            } else {
//                stack.pop();
//            }
//        }
//
//        int result = 0;
//        while (!stack.empty()){
//            result+=stack.pop();
//        }
//
//        System.out.println(result);
    }
}
