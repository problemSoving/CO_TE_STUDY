package subin.baekjoon.dataStructure.stack;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        int[] result = new int[n];

        // 입력받기
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        // 스택을 사용하여 오큰수를 찾기
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                System.out.println("numbers[i] = " + numbers[i]);
                System.out.println("stack.peek() = " + stack.peek());
                result[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }

        // 결과 배열에서 오큰수가 없는 경우 -1로 설정
        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        // 결과 출력
        for (int i = 0; i < n; i++) {
            bw.write(result[i] + " ");
        }

        // 버퍼에 저장된 내용을 출력
        bw.flush();
        bw.close();
    }
}
