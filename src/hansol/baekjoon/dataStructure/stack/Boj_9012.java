package hansol.baekjoon.dataStructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Boj_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder(); //출력

        for (int i = 0; i < cnt; i++) {
            String input = br.readLine();
            int check = 0;

            loop:
            for (char word : input.toCharArray()) {
                if (word == '(') check++;
                else check--;

                if (check < 0) {
                    sb.append("NO");
                    break loop; //닫는 괄호가 더 많아지면 바로 탈출
                }
            }

            if (check > 0) sb.append("NO");
            else if (check == 0) sb.append("YES");

            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}



//            if (input.charAt(0)==')' || input.charAt(input.length())=='('){
//                sb.append("NO");
//                continue;
//            }