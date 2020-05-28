package ua.edu.npu.lab01.task09;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        java.lang.String string = new java.lang.String();
        System.out.println("Enter string");
        string = input.nextLine();
        Counter count = new Counter();
        count.counting(string);
        count.output();
    }
}
