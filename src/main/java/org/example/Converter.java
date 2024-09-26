package org.example;

public class Converter {
    private static final String[] RomanValues = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] IntValue = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static int RomanToInt(String roman) {
        int result = 0;
        for (int i = 0; i < RomanValues.length; i++) {
            while (roman.startsWith(RomanValues[i])) {
                result += IntValue[i];
                roman = roman.substring(RomanValues[i].length());
            }
        }
        return result;
    }

    public static String IntToRoman(int number) {
        if (number < 1) {
            return "Неположительный результат";
        }
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < IntValue.length; i++) {
            while (number >= IntValue[i]) {
                roman.append(RomanValues[i]);
                number -= IntValue[i];
            }
        }
        return roman.toString();
    }
}
