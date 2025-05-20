package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Can not divide by zero");
        }
        return (double) a / b;
    }

    public int modulus(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Can not perform modulus with zero");
        }
        return a % b;
    }
}
