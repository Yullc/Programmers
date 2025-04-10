package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String t = "3141592";
        String p = "271";

        int result = sol.solution(t, p);
        System.out.println("결과: " + result);
    }
}

class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        if (p.length() > t.length()) return 0;

        long pLong = Long.parseLong(p);

        for (int i = 0; i <= t.length() - p.length(); i++) {
            String sub = t.substring(i, i + p.length());

            try {
                long subLong = Long.parseLong(sub);
                if (subLong <= pLong) {
                    answer++;
                }
            } catch (NumberFormatException e) {
            }
        }

        return answer;
    }
}
