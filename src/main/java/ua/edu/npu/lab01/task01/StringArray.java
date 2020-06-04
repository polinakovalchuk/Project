package ua.edu.npu.lab01.task01;

import java.util.Scanner;

public class StringArray {
    Scanner input = new Scanner(System.in);
    String[] strings;

    public void setStringsNumber(int stringsNumber) {
        strings = new String[stringsNumber];
    }

    public String[] inputStrings () {
        for (int i = 0; i <strings.length; i++) {
            System.out.println("Enter string number " + i);
            strings[i] = input.next();
        }
        return strings;
    }

    public void output () {
        for (int i = 0; i <strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    public String[] getStrings() {
        return strings;
    }
}
