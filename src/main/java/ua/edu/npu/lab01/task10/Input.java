package ua.edu.npu.lab01.task10;

import java.util.Scanner;

public class Input {
    Scanner input = new Scanner(System.in);
    int dots = 0;
    public int getDotNumber() {
        System.out.println("Enter number of dots: ");
        dots = input.nextInt();
        return dots;
    }

    public void getCoordinates(PointArray arr) {
        for(int i = 0; i<arr.pointArr.length; i++) {
            System.out.println("Enter x of " + i + " dot: ");
            arr.pointArr[i].setX(input.nextInt());
            System.out.println("Enter y of " + i + " dot: ");
            arr.pointArr[i].setY(input.nextInt());
        }
    }
}
