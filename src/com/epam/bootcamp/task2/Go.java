package com.epam.bootcamp.task2;

import com.epam.bootcamp.task2.service.Solution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Go {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("src\\com\\epam\\bootcamp\\task2\\text.txt")));
        System.out.println("The file has been read.");

        int maxWordsInSentence = Solution.solution(contents);
        System.out.printf("The longest sentence contains %d words!", maxWordsInSentence);

    }
}
