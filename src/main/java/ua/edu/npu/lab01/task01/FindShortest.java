package ua.edu.npu.lab01.task01;

public class FindShortest {
    public void findShortest (String[] A) {
        int stringNumber = 0;
        for (int i = 1; i <A.length; i++) {
            if(A[stringNumber].length()>A[i].length()) {
                stringNumber = i;
            }
        }
        System.out.println("Shortest string: " + A[stringNumber] + "    Length: " + A[stringNumber].length());
    }
}
