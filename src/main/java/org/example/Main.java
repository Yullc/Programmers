package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Solution s = new Solution();
   int[] numbers = new int[]{1, 2, 3, 4, 5};
    s.solution(numbers);
    }
    }
class Solution {
    public List<Integer> solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + numbers[i];
            answer.add(numbers[i]);
        }

        return answer;
    }
}