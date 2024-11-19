package hansol.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

// 회전하는 큐
public class Boj_1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int size = Integer.parseInt(st.nextToken()); //전체 큐 사이즈
        int cnt = Integer.parseInt(st.nextToken()); // 뽑을 수 갯수

        // 덱 초기화
        List<Integer> numList = new LinkedList<>();
        for (int i =1; i<=size;i++) numList.add(i);


        int result =0;
        int nowIdx =0;
        st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()){
            int findNum = Integer.parseInt(st.nextToken());
            int findIdx = numList.indexOf(findNum); //On
            if (findIdx>nowIdx){
                result += Math.min(findIdx-nowIdx,numList.size()-(findIdx-nowIdx));
            }else{
                result += Math.min(nowIdx- findIdx,numList.size()-(nowIdx-findIdx));
            }
            numList.remove(findIdx);
            nowIdx = findIdx;
        }
        System.out.println(result);
        br.close();
    }

}
