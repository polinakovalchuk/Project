package ua.edu.npu.lab01.task10;

public class PointArray {
    protected Point[] pointArr;

    public PointArray(int n) {
        pointArr = new Point[n];
        for (int i = 0; i < n; ++i) {
            pointArr[i] = new Point();
        }
    }
}
