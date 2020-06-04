package ua.edu.npu.lab01.task01;

public class App {
    public static void main(String[] args) {
        StringArray array = new StringArray();
        FindShortest shortest = new FindShortest();
        array.setStringsNumber(4);
        array.inputStrings();
        array.output();
        shortest.findShortest(array.getStrings());
    }
}
