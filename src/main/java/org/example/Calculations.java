package org.example;

public abstract class Calculations {

    protected int operand1;
    protected int operand2;
    public Calculations(int operand1, int operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public abstract int addition(); //метод, выполняющий сложение
    public abstract int subtraction(); //метод, выполняющий вычитание

    public abstract int multiplication(); //метод, выполняющий умножение
    public abstract int division(); //метод, выполняющий деление
}
