package subin.baekjoon.step.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalPrice = Integer.parseInt(br.readLine());
        int totalCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < totalCount; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            int price = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());

            totalPrice -= price*count;
        }
        if(totalPrice == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
