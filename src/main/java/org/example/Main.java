package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] absolutes = new int[]{4,7,12};
        boolean[] signs = new boolean[absolutes.length];
        String s = "addp";
        sol.solution(absolutes,signs);
    }
}

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        System.out.println(answer);
        return answer;
    }
}

//class Solution {
//    boolean solution(String s) {
//        boolean answer = true;
//        int count=0;
//        int num =0;
//        String[] st = s.split("");
//        for(int i = 0; i < st.length; i++) {
//            if(st[i].equals("p")) {
//                count++;
//            }
//            else if(st[i].equals("y")) {
//                num++;
//            }
//
//        }
//        if(count != num) {
//            answer = false;
//        }
//        else if (count == 0 && num == 0) {
//            answer = true;
//        }
//        System.out.println(answer);
//        return answer;
//    }
//}