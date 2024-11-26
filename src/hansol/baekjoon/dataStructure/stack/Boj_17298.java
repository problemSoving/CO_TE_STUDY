package hansol.baekjoon.dataStructure.stack;

import java.io.*;
import java.util.*;

public class Boj_17298 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());
        int[] nums = new int[size];
        int[] result = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        for (int i = 0; i < size; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        // 결과 배열 초기화
        Arrays.fill(result, -1);

        // 인덱스를 저장할 스택
        Deque<Integer> stack = new ArrayDeque<>();


        for (int i = 0; i < size; i++) {
            // 스택의 마지막 원소가 현재 값보다 작으면 오큰수를 찾은 것
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                System.out.println(nums[stack.peek()]+"/"+nums[i]);
                result[stack.pop()] = nums[i];
            }
            // 현재 인덱스를 스택에 추가
            System.out.println("스택 "+i);
            stack.push(i);
        }




//
//
//        ArrayDeque<Integer> inputStack = new ArrayDeque<>();
//        ArrayDeque<Integer> stack = new ArrayDeque<>();
//
//        for (int i=0; i<size-1;i++){
//            int top = inputStack.pop();
//            if (inputStack.peek() < top) {
//                stack.push(top);
//                if (!singleNum.isEmpty()&&singleNum.get)
//            }
//            else {
//                int oks =-1;
//                for (int num : stack){
//                    if ( inputStack.peek() < num ){
//                        oks = num;
//                        break;
//                    }
//                }
//                stack.push(oks);
//            }
//        }

        //stack.forEach(num -> sb.append(num).append(" "));
        System.out.println(sb);
    }
}
