package hansol.baekjoon.dataStructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Boj_1874 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine()); // 수열의 길이

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int topNum = 1;

        for (int i = 0 ; i<cnt ; i++){

            int target = Integer.parseInt(br.readLine());

            while (topNum <= target){
                stack.offerLast(topNum++);
                sb.append("+\n");
            }

            if (stack.peekLast()==target){
                stack.removeLast();
                sb.append("-\n");
            }else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
        br.close();
    }

}
