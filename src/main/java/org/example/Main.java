package org.example;

public class Main {
    public static void main(String[] args) {
    Solution s = new Solution();
   String[] my_string = new String[]{"ProgrammerS123"};
    s.solution("ProgrammerS123", 11);
    }
    }
class Solution {
    public String solution(String my_string, int n) {
        System.out.println(my_string);
        String answer = "";
        String[] arr = my_string.split("");
        for (int i = arr.length-n; i < arr.length; i++) {
            answer += arr[i];
        }
        System.out.println(answer);
        return answer;
    }
}