package ua.edu.npu.lab01.task02;

public class App {
    public static void main(String[] args) {
        StringArray array = new StringArray();
        Sorting sort = new Sorting();
        String[] strs;
        array.setStringsNumber(4);
        array.inputStrings();
        strs = array.getStrings();
        sort.sorting(strs);
        output(strs);
    }

    public static void output(String[] A) {
        for (int i = 0; i <A.length; i++) {
            System.out.println(A[i]);
        }
    }
}
