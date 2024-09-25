package org.example;

public class ArabicCalcs extends Calculations{

    public ArabicCalcs(int operand1, int operand2){
        super(operand1, operand2);
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
