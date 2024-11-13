package hansol.baekjoon.step.lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2563 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[][] background = new int[101][101];
        int totalSpace = 0;

        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j=x; j < x + 10; j++) {
                for (int k=y; k < y + 10; k++) {
                    if(background[j][k]==0) {
                        background[j][k] = 1;
                        totalSpace++;
                    }

                }
            }
        }
        System.out.println(totalSpace);
        br.close();
    }

// 도화지가 100x100 이 아닐때...
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int caseNum = Integer.parseInt(br.readLine());
//        int[][] xyArr= new int[caseNum][2];
//
//        for (int i = 0; i < caseNum; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine()," ");
//            xyArr[i][0]= Integer.parseInt(st.nextToken());
//            xyArr[i][1]= Integer.parseInt(st.nextToken());
//        }
//
//        int totalSpace=100*caseNum;
//        for (int i = 0; i < caseNum-1; i++) {
//            for (int j = i+1; j < caseNum; j++) {
//                int x = Math.abs(xyArr[i][0]-xyArr[j][0]);
//                int y = Math.abs(xyArr[i][1]-xyArr[j][1]);
//
//                if (x<10 && y<10){
//                    totalSpace -= (10-x)*(10-y);
//                }
//            }
//        }
//
//        System.out.println(totalSpace);
//        br.close();
//    }
}
