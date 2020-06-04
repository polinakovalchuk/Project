package ua.edu.npu.lab01.task05;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String MainString;
        System.out.println("Enter your String");
        MainString = input.nextLine();
        Output output = new Output();
        output.DoubleSpace(MainString);
        output.Numbers(MainString);
    }
}
