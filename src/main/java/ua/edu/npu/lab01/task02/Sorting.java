package ua.edu.npu.lab01.task02;

public class Sorting {
    public String[] sorting (String[] A) {
        String e;
        for (int i = 1; i <A.length; i++) {
            for (int j = 0; j <A.length-1; j++) {
                if(A[j].length()>A[j+1].length()) {
                    e = A[j];
                    A[j] = A[j+1];
                    A[j+1] = e;
                }
            }
        }
        return A;
    }
}
