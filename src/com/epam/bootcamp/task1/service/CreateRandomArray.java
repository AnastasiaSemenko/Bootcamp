package com.epam.bootcamp.task1.service;

public class CreateRandomArray {
    public static int[] getRandomArray(int volume) {
        int[] randomArray = new int[volume];
        for (int i = 0; i < volume; i++) {
            randomArray[i] = (int) (Math.random() * 2);
            System.out.print(randomArray[i] + " ");
        }
        return randomArray;
    }
}
