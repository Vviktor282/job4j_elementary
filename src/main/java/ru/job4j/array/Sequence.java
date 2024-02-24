package ru.job4j.array;

public class Sequence {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;

        int[][] numbers = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        System.out.println(numbers[0].length);
        System.out.println(numbers[1].length);
        System.out.println(numbers[2].length);
        System.out.println(numbers[3].length);
    }
}