package ua.edu.npu.lab01.task09;

public class Counter {
    int vowels = 0;
    int consonants = 0;
    Character e;
    public void counting (String s) {
        for(int i=0; i<s.length(); i++) {
            e = s.charAt(i);
            if (e.isLetter(e)) {
                if ("AEIOUaeiou".indexOf(e) != -1) {
                    vowels++;
                }
                else {
                    consonants++;
                }
            }
        }
    }

    public void output () {
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
