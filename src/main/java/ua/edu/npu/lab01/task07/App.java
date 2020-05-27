package ua.edu.npu.lab01.task07;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        Redact redaction = new Redact();
        Splitter split = new Splitter();
        System.out.println("Enter String");
        str = input.nextLine();
        split.Split(str);
        String[] StrArr = split.getStringArray();
        redaction.redact(StrArr);
        split.output(StrArr);
    }
}
