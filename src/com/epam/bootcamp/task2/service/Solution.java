package com.epam.bootcamp.task2.service;

public class Solution {
    public static int solution(String S) {
        String[] sentences = S.split("[.!?]\\s*");
        String[][] words = new String[sentences.length][];

        for (int i = 0; i < sentences.length; ++i) {
            words[i] = sentences[i].split("[\\p{Punct}\\s]+");
        }

        int maxNum = 0;
        for (int i = 0; i < words.length; i++) {
            int num = 0;
            for (int j = 0; j < words[i].length; j++) {
                num++;
            }
            if (num > maxNum) maxNum = num;
        }

        return maxNum;
    }
}
