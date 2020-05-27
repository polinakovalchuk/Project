package ua.edu.npu.lab01.task08;

public class Splitter {
    String[] stringArray;
    public void Split (String s) {
        stringArray = s.split(" ");
    }

    public String[] getStringArray() {
        return stringArray;
    }
}
