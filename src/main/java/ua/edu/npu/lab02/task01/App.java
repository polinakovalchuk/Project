package ua.edu.npu.lab02.task01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Statistic statistic = new Statistic();
        String choose = "";
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\nAdd - add new result\nStatistics - see statistics\nStop - stop the program");
            choose = input.next();
            switch (choose){
                case "Add":
                    System.out.println("Enter number");
                    statistic.addResult(input.nextInt());
                    break;
                case "Statistics":
                    System.out.println("Min number: " + statistic.getMin());
                    System.out.println("Max number: " + statistic.getMax());
                    System.out.println("Average number: " + statistic.getAvg());
                    statistic.getMode();
                    statistic.biggerThanAvg();
                    statistic.lesserThanAvg();
                    break;
                case "Stop":
                    System.exit(0);
                default:
                    System.out.println("Wrong command");
                    break;
            }
        }
    }
}
