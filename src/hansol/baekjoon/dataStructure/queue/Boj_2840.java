package hansol.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_2840 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int listSize = Integer.parseInt(st.nextToken()); //칸
        int cnt = Integer.parseInt(st.nextToken()); //횟수

        //바퀴 리스트 초기화
        List<Character> charList = new LinkedList<>();
        for (int i = 0; i < listSize; i++) charList.add('?');
        Set<Character> checkDup = new HashSet<>();
        //On

        int nowIdx = 0 ;
        for (int i = 0; i < cnt; i++) {
            StringTokenizer input = new StringTokenizer(br.readLine(), " ");
            int addIdx = Integer.parseInt(input.nextToken()); //칸
            char word = input.nextToken().charAt(0); //글자 1개


            //글자 입력 , 충돌이면 ! 입력

            nowIdx = (nowIdx + addIdx) % listSize;
            char idxWord = charList.get(nowIdx);
            boolean isDup =checkDup.contains(word);

            if ( isDup == true && idxWord==word){
                charList.set(nowIdx,word);
                checkDup.add(word);

            }else if ( isDup == false && idxWord=='?'){
                charList.set(nowIdx,word);
                checkDup.add(word);

            }else {
                System.out.println("!");
                return;
            }

        }


        //  마지막 인덱스부터 거꾸로 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< listSize; i++){
            sb.append(charList.get((nowIdx+ listSize)% listSize));
            nowIdx--;
        }
        System.out.println(sb);
        br.close();
    }

}
