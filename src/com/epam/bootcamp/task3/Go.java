package com.epam.bootcamp.task3;

import com.epam.bootcamp.task3.service.Solution;

import java.util.Scanner;

public class Go {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter the number: ");
        int startNumber = in.nextInt();
        int finalNumber = Solution.solution(startNumber);
        System.out.printf("The final number is %d.", finalNumber);
    }
}
