package subin.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_3078 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String input = br.readLine();
        st = new StringTokenizer(input);
        int total = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] nameLength = new int[total];
        int[] nameLengthCount = new int[21];

        for (int i = 0; i < total; i++) {
            String name = br.readLine();
            nameLength[i] = name.length();
            if(i <= k){
                nameLengthCount[nameLength[i]]++;
            }
        }

        long friends = --nameLengthCount[nameLength[0]];

        for (int i = 1; i < total; i++) {
            if(i + k < total) nameLengthCount[nameLength[i+k]]++;
            friends += --nameLengthCount[nameLength[i]];
        }

        System.out.println(friends);

    }
}
