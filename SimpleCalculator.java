/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simplecalculator;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        int result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Cannot divide by zero.");
                return;
            }
        } else {
            System.out.println("Invalid operator.");
            return;
        }

        System.out.println("Result: " + result);
    }
}

