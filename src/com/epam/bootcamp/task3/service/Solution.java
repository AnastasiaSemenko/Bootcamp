package com.epam.bootcamp.task3.service;

public class Solution {
    public static int solution(int A) {
        char[] chars = String.valueOf(A).toCharArray();
        String newString = "";

        for (int i = 0; i < (chars.length / 2); i++) {
            newString += chars[i];
            newString += chars[chars.length - i - 1];
        }
        if (chars.length % 2 != 0) {
            newString += chars[chars.length / 2];
        }
        return Integer.parseInt(newString);
    }
}
