package hansol.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_1158 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> numCircle = new LinkedList<>();
        for (int i=0;i<n;i++) numCircle.add(i,i+1);

        StringBuilder sb = new StringBuilder();

        int nowIndex=-1;
        for (int i=0;i<=n-1;i++) {
            for (int j=0; j<k;j++){
                nowIndex++;
                if (nowIndex>numCircle.size()-1){
                    nowIndex=i;
                }
            }
            numCircle.add(i,numCircle.get(nowIndex));
            numCircle.remove(nowIndex+1);
        }
        String answer =Arrays.toString(numCircle.toArray());
        sb.append("<").append(answer.substring(1,answer.length()-1)).append(">");
        System.out.println(sb);
        br.close();
    }



}
