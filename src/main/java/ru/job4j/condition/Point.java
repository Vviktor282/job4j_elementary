package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow((x2 - x1), 2)  + Math.pow((y2 - y1), 2));
        return result;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(4, 8, 2, 7);
        double result3 = Point.distance(4, 1, 4, 2);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        System.out.println("result (4, 8) to (2, 7) " + result2);
        System.out.println("result (4, 1) to (4, 2) " + result3);
    }
}
