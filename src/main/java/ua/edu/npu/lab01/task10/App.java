package ua.edu.npu.lab01.task10;

public class App {
    public static void main(String[] args) {
        Perimeter perimeter = new Perimeter();
        Input Inp = new Input();
        PointArray pointArray = new PointArray(Inp.getDotNumber());
        Inp.getCoordinates(pointArray);
        perimeter.getBiggerPerimeter(pointArray);
        perimeter.Output();
    }
}
