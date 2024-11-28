package hansol.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj_3078 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Integer> friends = new ArrayList<>();
        for (int i = 0 ; i < n ; i++){
            String name = br.readLine();
            friends.add(name.length());
        }

        int ssang = 0;

        for (int i = 0 ; i < n-1 ; i++){
            for (int j=i+1; j<i+k;j++){}

        }



    }
}
