package hansol.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//키로거
public class Boj_5397 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line; i++) {

            String input = br.readLine();

            Stack<Character> left = new Stack<>();
            Stack<Character> right = new Stack<>();

            for (char word : input.toCharArray()){
                if ( word == '<') {
                    if (!left.empty()) right.push(left.pop());
                } else if (word == '>'){
                    if (!right.empty()) left.push(right.pop());
                } else if (word == '-') {
                    if (!left.empty()) left.pop();
                } else left.push(word);
            }

            // 결과 조합
            while (!left.isEmpty()) right.push(left.pop());
            while (!right.isEmpty()) sb.append(right.pop());
            sb.append("\n");

        }

        System.out.println(sb);
        br.close();

    }

//    통과 했으나 시간이 너무 오래걸림
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int line = Integer.parseInt(br.readLine());
//
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i<line ; i++){
//
//            String input = br.readLine();
//            int cursor = 0;
//            List<Character> pw = new LinkedList<>();
//
//            for (int j = 0 ; j<input.length(); j++){
//                char word =input.charAt(j);
//
//                if ( word == '<') {
//                    cursor--;
//                    if (cursor<0) cursor=0;
//                }else if ( word == '>'){
//                    cursor++;
//                    if (cursor>pw.size())cursor=pw.size();
//                }else if ( word == '-') {
//                    cursor--;
//                    pw.remove(cursor);
//                }else {
//                    pw.add(cursor, word);
//                    cursor++;
//                }
//            }
//
//            for (char word : pw) sb.append(word);
//            sb.append("\n");
//
//        }
//        System.out.println(sb);
//
//        br.close();
//    }
}
