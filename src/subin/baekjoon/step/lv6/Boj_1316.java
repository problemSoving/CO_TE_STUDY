package subin.baekjoon.step.lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        // [방법 1]
        for (int i = 0; i < n; i++) {
            boolean isGroup = true;
            String s = br.readLine();
            boolean[] check = new boolean[26];
            char[] val = new char[s.length()];

            for (int j = 0; j < s.length(); j++) {
                val[j] = s.charAt(j);
            }

            for (int j = 0; j < s.length(); j++) {
                if(!check[val[j] - 'a']){
                    check[val[j] - 'a'] = true;
                } else if(check[val[j] - 'a'] && val[j] != val[j-1]){
                    isGroup = false;
                    break;
                }
            }
            if(isGroup) count++;
        }

        System.out.println(count);

        // [방법 2]
        /*
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            boolean isGroup = true;

            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = 0; j < word.length(); j++) {
                // 연속된 문자이면서 그룹문자인지 확인
                if (map.containsKey(word.charAt(j)) && map.get(word.charAt(j)) != j - 1) {
                    isGroup = false;
                    break;
                }
                // hashmap에 문자와 인덱스를 저장
                map.put(word.charAt(j), j);
            }
            if (isGroup) {
                count++;
            }

        }
        System.out.println(count);*/
    }
}
