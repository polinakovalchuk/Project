package ua.edu.npu.lab06.task01;

import java.time.LocalDate;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Interface i;
        i= () -> "Polina";
        System.out.println(i.method());
        i = () -> String.valueOf(LocalDate.now().getDayOfWeek());
        System.out.println(i.method());
        i = () -> randomWord();
    }
    public static String randomWord () {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        String word = new String();
        double a = Math.random()*10;
        for (int i = 0; i < a; i++) {
            char c = (char) ('a' + r.nextInt('z' - 'a'));
            sb.append(c);
        }
        word = sb.toString();
        return word;
    }
}
