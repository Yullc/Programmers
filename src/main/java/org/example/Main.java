package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] number = new int[]{-2, 3, 0, 2, -5};
        String s = "addp";
        sol.solution(number);
    }
}

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }

            }
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