package org.example;

public class RomanCalcs extends Calculations{

    public RomanCalcs(String operand1, String operand2){
        super(Converter.RomanToInt(operand1), Converter.RomanToInt(operand2));
    }
    @Override
    public int addition() {
        return operand1 + operand2;
    }

    @Override
    public int subtraction() {
        return operand1 - operand2;
    }

    @Override
    public int multiplication() {
        return operand1 * operand2;
    }

    @Override
    public int division() {
        try {
            return operand1 / operand2;
        }
        catch (ArithmeticException e){
            System.out.println("Деление на ноль, операция невозможна!");
        }
        return operand1 / operand2;
    }
}
