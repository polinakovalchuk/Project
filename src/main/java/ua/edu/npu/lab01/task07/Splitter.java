package ua.edu.npu.lab01.task07;

public class Splitter {
    String[] StringArray;
    public void Split (String s) {
        StringArray = s.split(" ");
    }

    public String[] getStringArray() {
        return StringArray;
    }

    public void output (String[] arr) {
        for (String a : arr)
            System.out.print(a + " ");
    }
}
