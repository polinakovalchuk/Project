package ua.edu.npu.lab01.task03;

import java.util.Scanner;

public class StringArray {
    Scanner input = new Scanner(System.in);
    String[] strings;
    double averageLength=0;

    public void setStringsNumber(int stringsNumber) {
        strings = new String[stringsNumber];
    }

    public String[] inputStrings () {
        for (int i = 0; i <strings.length; i++) {
            System.out.println("Enter string number " + i);
            strings[i] = input.next();
            averageLength += strings[i].length();
        }
        averageLength /= strings.length;
        return strings;
    }

    public void outputSpecial () {
        System.out.println("Length lesser than " + averageLength);
        for (int i = 0; i <strings.length; i++) {
            if (ifLesserThanAverage(strings[i])) {
                System.out.println(strings[i] + "   Length: " + strings[i].length());
            }
        }
    }

    boolean ifLesserThanAverage (String e) {
        if(e.length() < averageLength) {
            return true;
        }
        else {
            return false;
        }
    }
}
