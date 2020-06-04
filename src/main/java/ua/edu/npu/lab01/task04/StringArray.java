package ua.edu.npu.lab01.task04;

import java.util.Scanner;

public class StringArray {
    Scanner input = new Scanner(System.in);
    String[] strings;
    int replaceNumber=0;
    char replace = '_';

    public void setStringsNumber(int stringsNumber) {
        strings = new String[stringsNumber];
    }

    public String[] inputStrings () {
        for (int i = 0; i <strings.length; i++) {
            System.out.println("Enter string number " + i);
            strings[i] = input.next();
        }
        System.out.println("Enter number to replace");
        replaceNumber = input.nextInt();
        return strings;
    }

    public void outputSpecial () {
        System.out.println("Replace " + replaceNumber + " number of word");
        for (int i = 0; i <strings.length; i++) {
            if (strings[i].length() >= replaceNumber) {
                strings[i] = strings[i].substring(0, replaceNumber) + replace + strings[i].substring(replaceNumber + 1);
            }
                System.out.println(strings[i]);
        }
    }
}
