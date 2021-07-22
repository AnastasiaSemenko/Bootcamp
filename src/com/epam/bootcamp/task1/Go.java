package com.epam.bootcamp.task1;

import com.epam.bootcamp.task1.console.ResultInfo;
import com.epam.bootcamp.task1.service.CreateRandomArray;
import com.epam.bootcamp.task1.service.Solution;

import java.util.Scanner;

public class Go {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter the number of coins[1, 100]: ");
        int numberOfCoins = in.nextInt();
        int numberOfActions;

        if (numberOfCoins <= 100 && numberOfCoins >= 1) {
            int[] coins = CreateRandomArray.getRandomArray(numberOfCoins);
            numberOfActions = Solution.solution(coins);
            ResultInfo.printResult(numberOfActions);
        } else {
            System.out.println("You entered an incorrect number. Try again later.");
        }
    }
}
