package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите арифметическое выражение: ");
        String EXPRESSION = scanner.nextLine();
        String[] OPERATIONS = {"+", "-", "*", "/"};
        String[] parts;
        String operator = "";
        parts = EXPRESSION.split("([+\\-*/])");

        for (String operation : OPERATIONS) {
            boolean containsElement = EXPRESSION.contains(operation); //есть ли элемент в строке
            if (containsElement) {
                operator = operation;
            }
        }
        String operand1 = parts[0];
        String operand2 = parts[1];

        // Определяем систему счисления
        boolean isArabic = NumberIdentifier.isArabicNumber(operand1) && NumberIdentifier.isArabicNumber(operand2);
        boolean isRoman = NumberIdentifier.isRomanNumber(operand1) && NumberIdentifier.isRomanNumber(operand2);
        if (!isArabic && !isRoman) {
            System.out.println("Неверный формат чисел.\n" +
                    "\"Оба числа должны быть либо арабскими, либо римскими.\"");
            return;
        }

        //Создаем объект класса Calculations
        Calculations calculator;
        if (isArabic) {
            calculator = new ArabicCalcs(Integer.parseInt(operand1), Integer.parseInt(operand2));
        } else {
            calculator = new RomanCalcs(operand1, operand2);
        }

        // Выполняем операцию
        int result = 0;
        switch (operator) {
            case "+":
                result = calculator.addition();
                break;
            case "-":
                result = calculator.subtraction();
                break;
            case "*":
                result = calculator.multiplication();
                break;
            case "/":
                result = calculator.division();
                break;
            default:
                System.out.println("Неподдерживаемая операция.");
        }
        // Выводим результат
        if (isArabic) {
            System.out.println("Результат: " + result);
        } else {
            System.out.println("Результат: " + Converter.IntToRoman(result));
        }
    }
}