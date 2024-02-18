package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2 Euro. Test result : " + passed);

        input = 120;
        expected = 2;
        output = rubleToDollar(input);
        passed = expected == output;
        System.out.println("120 rubles are 2 Dollars. Test result : " + passed);
    }
}
