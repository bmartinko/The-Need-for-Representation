package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Main {


    public static void main(String[] args) {

        Scanner kbsReader = new Scanner(System.in);
        System.out.println("Please write a word");
        String word = kbsReader.nextLine();

        int wordLength = word.length();
        double randomNumber = (Math.random());
        int randomCorrelation = (int)(randomNumber * 5);
        int startingLetterSpot = (int)(randomNumber * wordLength);
        String[] wordArray = word.split("");
        int i;
        for (i = 0; i <= wordLength; i++) {
            if (randomCorrelation % 5 == 0) {
                String conversionA = word.substring(startingLetterSpot,startingLetterSpot + 1);
                char aConversion = conversionA.charAt(0);
                int a_conversion = (int)(aConversion);
                String conversion_a = Integer.toBinaryString(a_conversion);
                wordArray[startingLetterSpot] = conversion_a;
                if (startingLetterSpot == (wordLength - 1)){
                    startingLetterSpot = startingLetterSpot * 0;
                }else{
                    startingLetterSpot++;
                }
                randomCorrelation++;
            } else if (randomCorrelation % 5 == 1) {
                String conversionB = word.substring(startingLetterSpot,startingLetterSpot + 1);
                char bConversion = conversionB.charAt(0);
                int b_conversion = (int)(bConversion);
                String conversion_b = Integer.toOctalString(b_conversion);
                wordArray[startingLetterSpot] = conversion_b;
                if (startingLetterSpot == (wordLength - 1)){
                    startingLetterSpot = startingLetterSpot * 0;
                }else{
                    startingLetterSpot++;
                }
                randomCorrelation++;
            } else if (randomCorrelation % 5 == 2) {
                String conversionC = word.substring(startingLetterSpot,startingLetterSpot + 1);
                char cConversion = conversionC.charAt(0);
                int c_conversion = (int)(cConversion);
                wordArray[startingLetterSpot] = Integer.toString(c_conversion);
                if (startingLetterSpot == (wordLength - 1)){
                    startingLetterSpot = startingLetterSpot * 0;
                }else{
                    startingLetterSpot++;
                }
                randomCorrelation++;
            } else if (randomCorrelation % 5 == 3) {
                String conversionD = word.substring(startingLetterSpot, startingLetterSpot + 1);
                char dConversion = conversionD.charAt(0);
                int d_conversion = (int)(dConversion);
                String conversion_d = Integer.toHexString(d_conversion);
                wordArray[startingLetterSpot] = conversion_d;
                if (startingLetterSpot == (wordLength - 1)){
                    startingLetterSpot = startingLetterSpot * 0;
                }else{
                    startingLetterSpot++;
                }
                randomCorrelation++;
            } else if (randomCorrelation % 5 == 4) {
                String conversionE = word.substring(startingLetterSpot, startingLetterSpot + 1);
                char eConversion = conversionE.charAt(0);
                wordArray[startingLetterSpot] = Character.toString(eConversion);
                if (startingLetterSpot == (wordLength - 1)){
                    startingLetterSpot = startingLetterSpot * 0;
                }else{
                    startingLetterSpot++;
                }
                randomCorrelation = randomCorrelation * 0;
            }
        }
        System.out.println(Arrays.toString(wordArray));
    }
}
