package com.sheridan;
import java.util.Scanner;


public class Calculator {

    public int sumValues(int num1, int num2) {
        return num1 + num2;
    }

    public int subtractValues(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplyValues(int num1, int num2) {
        return num1 * num2;
    }

    public double divideValues(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0; 
        }
        return (double) num1 / num2;
    }

    public static void main(String[] args) {
        Calculator customCalc = new Calculator();
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = inputScanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = inputScanner.nextInt();

        System.out.println("Addition: " + customCalc.sumValues(num1, num2));
        System.out.println("Subtraction: " + customCalc.subtractValues(num1, num2));
        System.out.println("Multiplication: " + customCalc.multiplyValues(num1, num2));
        System.out.println("Division: " + customCalc.divideValues(num1, num2));

        inputScanner.close();
    }
}
