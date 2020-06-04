package ua.edu.npu.lab01.task06;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        Redact redaction = new Redact();
        System.out.println("Enter String");
        str = input.nextLine();
        redaction.redact(str);
    }
}
