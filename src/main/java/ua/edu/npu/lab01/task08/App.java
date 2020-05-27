package ua.edu.npu.lab01.task08;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        Counter Counting = new Counter();
        Splitter Split = new Splitter();
        System.out.println("Enter your String");
        str = input.nextLine();
        Split.Split(str);
        String[] StringArr = Split.getStringArray();
        Counting.counting(StringArr);
        Counting.Out();
    }
}
