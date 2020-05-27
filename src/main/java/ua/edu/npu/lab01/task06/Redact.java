package ua.edu.npu.lab01.task06;

public class Redact {
    public void redact(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                System.out.print(s.charAt(i));
            }
            else if (s.charAt(i) == ' ') {
                System.out.print(s.charAt(i));
            }
            else {
                System.out.print(" ");
            }
        }
    }
}
