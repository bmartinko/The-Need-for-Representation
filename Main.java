package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner kbsReader = new Scanner(System.in);
        System.out.println("Please write a word");
        String word = kbsReader.nextLine();

        int wordLength = word.length();
        int randomNumber = (int) (Math.random() * 5);
        if (randomNumber % 5 == 0) {

        } else if (randomNumber % 5 == 1) {

        } else if (randomNumber % 5 == 2) {

        } else if (randomNumber % 5 == 3) {

        } else if (randomNumber % 5 == 4) {

        }
    }
}
