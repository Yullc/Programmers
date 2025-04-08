package org.example;

public class Main {
    public static void main(String[] args) {
    Solution s = new Solution();
    int[] array = new int[]{1, 1, 2, 3, 4, 5};
    s.solution(array, 1);
    }
    }
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }
}