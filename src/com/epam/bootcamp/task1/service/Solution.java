package com.epam.bootcamp.task1.service;

public class Solution {
    public static int solution(int[] A) {
        int heads = 0;
        int tails = 0;
        for (int coin : A) {
            if (coin == 1) {
                tails++;
            } else {
                heads++;
            }
        }
        return Math.min(heads, tails);
    }
}
