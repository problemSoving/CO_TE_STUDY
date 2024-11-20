package hansol.baekjoon.dataStructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Boj_10828 {

    // 배열 구현 버전
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder(); //출력

        int[] numArr = new int[cnt];
        int topIdx = 0;

        for (int i = 0; i < cnt; i++) {
            String input = br.readLine();

            switch (input) {
                case "pop":
                    if (topIdx == 0) sb.append("-1").append("\n");
                    else {
                        topIdx--;
                        sb.append(numArr[topIdx]).append("\n");
                        numArr[topIdx] = 0;
                    }
                    break;
                case "size":
                    sb.append(topIdx).append("\n");
                    break;
                case "empty":
                    sb.append(topIdx == 0 ? 1 : 0).append("\n");
                    break;
                case "top":
                    if (topIdx == 0) sb.append(-1).append("\n");
                    else sb.append(numArr[topIdx - 1]).append("\n");
                    break;
                default:
                    numArr[topIdx] = Integer.parseInt(input.substring(5));
                    topIdx++;
            }

        }
        System.out.println(sb);
        br.close();

    }




//    deque 사용한 버전
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int cnt = Integer.parseInt(br.readLine());
//
//        ArrayDeque<Integer> deque = new ArrayDeque<>(); //스택
//        StringBuilder sb = new StringBuilder(); //출력
//
//        //입력 처리
//        for (int i = 0; i < cnt; i++) {
//            String input = br.readLine();
//
//            switch (input){
//                case "pop" :
//                    if (deque.isEmpty()) sb.append(-1).append("\n");
//                    else sb.append(deque.pollLast()).append("\n");
//                    break;
//                case "size" :
//                    sb.append(deque.size()).append("\n");
//                    break;
//                case "empty" :
//                    sb.append(deque.isEmpty()?1:0).append("\n");
//                    break;
//                case "top" :
//                    if (deque.isEmpty()) sb.append(-1).append("\n");
//                    else sb.append(deque.getLast()).append("\n");
//                    break;
//                default:
//                    deque.offerLast(Integer.parseInt(input.substring(5)));
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }

}
