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
        sol.solution(3,30,5);
    }
}

class Solution {
    public long solution(int price, int money, int count) {
        long answer=0;
        long total=0 ;
        for(int i=1;i<=count;i++){
            total += price *i;
        }
        if (total > money) {
            answer = total-money;
            return answer;
        } else if (total == money) {
            return 0;
        } else{
            return 0;
        }
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